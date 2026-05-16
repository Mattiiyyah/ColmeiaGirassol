// =============================================================================
// render.js — Renderiza dados do Database.js nos dashboards
// Todos os dados vêm do Database (sincronizado com App.java)
// =============================================================================

document.addEventListener("DOMContentLoaded", function () {

    // =========================================================================
    // UTILITÁRIOS
    // =========================================================================

    // Lê o nome salvo no sessionStorage (definido pelo login)
    const nomeSessao = (() => { try { return sessionStorage.getItem('cg_nome'); } catch(e) { return null; } })();
    const perfilSessao = (() => { try { return sessionStorage.getItem('cg_perfil'); } catch(e) { return null; } })();

    // Formata data dd/mm/aaaa
    function fmtData(iso) {
        if (!iso) return '—';
        const [y, m, d] = iso.split('-');
        return `${d}/${m}/${y}`;
    }

    // Mascara CPF parcialmente: 111.111.***-**
    function mascaraCpf(cpf) {
        if (!cpf) return '—';
        return cpf.replace(/(\d{3}\.\d{3})\.\d{3}-\d{2}/, '$1.***.** ').trim();
    }

    // Mascara telefone: (11) 9****-0003
    function mascaraTel(tel) {
        if (!tel) return '—';
        return tel.replace(/(\(\d{2}\)\s\d)\d{4}(-\d{4})/, '$1****$2');
    }

    // =========================================================================
    // DASHBOARD ADMIN
    // =========================================================================

    // --- Saudação dinâmica ---
    const saudacaoAdmin = document.getElementById('saudacao-admin');
    if (saudacaoAdmin) {
        saudacaoAdmin.textContent = 'Olá, ' + (nomeSessao || 'Administrador');
    }

    // --- Stats dinâmicos ---
    const statAlunos = document.getElementById('stat-alunos');
    if (statAlunos) statAlunos.textContent = Database.get('alunos').length;

    const statProfessores = document.getElementById('stat-professores');
    if (statProfessores) statProfessores.textContent = Database.get('professores').length;

    const statTurmas = document.getElementById('stat-turmas');
    if (statTurmas) statTurmas.textContent = Database.get('turmas').length;

    const statMatriculas = document.getElementById('stat-matriculas');
    if (statMatriculas) statMatriculas.textContent = Database.get('matriculas').length;

    // --- Select de professores no formulário de nova turma ---
    const selectProfTurma = document.getElementById('select-prof-turma');
    if (selectProfTurma) {
        const profs = Database.get('professores');
        selectProfTurma.innerHTML = profs.map(p =>
            `<option value="${p.id}">${p.nome}</option>`
        ).join('');
    }

    // --- Tabela de Professores ---
    const professorTable = document.querySelector('#cadastro-professor tbody');
    if (professorTable) {
        const professores = Database.get('professores');
        professorTable.innerHTML = professores.map(p => `
            <tr>
                <td>
                    <div class="d-flex align-items-center gap-3">
                        <img src="https://ui-avatars.com/api/?name=${encodeURIComponent(p.nome)}&background=7EC8D9&color=fff" class="rounded-circle" style="width: 35px;" alt="${p.nome}">
                        <div>
                            <div class="fw-bold">${p.nome}</div>
                            <small class="text-muted">${p.email}</small>
                        </div>
                    </div>
                </td>
                <td>${p.formacao}</td>
                <td>${fmtData(p.dataAdmissao)}</td>
                <td><span class="badge badge-active px-3 py-2 rounded-pill">${StatusUtil.getDescricaoGeral(p.status)}</span></td>
                <td class="text-center">
                    <button class="btn btn-sm text-primary" title="Editar"><i class="fa-solid fa-pen-to-square"></i></button>
                    <button class="btn btn-sm text-danger" title="Remover" onclick="removerProfessor(${p.id})"><i class="fa-solid fa-trash"></i></button>
                </td>
            </tr>
        `).join('');
    }

    // --- Grid de Turmas ---
    const turmaGrid = document.querySelector('#cadastro-turma .row.g-4');
    if (turmaGrid) {
        renderTurmas();
    }

    function renderTurmas() {
        const grid = document.querySelector('#cadastro-turma .row.g-4');
        if (!grid) return;
        const turmas = Database.getTurmasComProfessor();
        grid.innerHTML = turmas.map(t => `
            <div class="col-md-4 mb-4">
                <div class="stat-card border-start border-4 border-primary">
                    <h5 class="fw-bold text-dark-blue">${t.nomeTurma}</h5>
                    <p class="text-muted small mb-1"><i class="fa-solid fa-user-tie me-2"></i>Prof. ${t.professor}</p>
                    <p class="text-muted small mb-3"><i class="fa-solid fa-calendar me-2"></i>${t.ano} — ${t.grau}</p>
                    <div class="d-flex justify-content-between align-items-center">
                        <span class="badge bg-light text-dark-blue rounded-pill px-3">${t.alunosCount} Aluno${t.alunosCount !== 1 ? 's' : ''}</span>
                        <button class="btn btn-sm text-danger" onclick="removerTurma(${t.id})"><i class="fa-solid fa-trash"></i></button>
                    </div>
                </div>
            </div>
        `).join('');
    }

    // --- Tabela de Matrículas ---
    const matriculaTable = document.querySelector('#matriculas tbody');
    if (matriculaTable) {
        renderMatriculas();
    }

    function renderMatriculas() {
        const tbody = document.querySelector('#matriculas tbody');
        if (!tbody) return;
        const matriculas = Database.get('matriculas');
        tbody.innerHTML = matriculas.map(m => {
            const aluno = Database.get('alunos').find(a => a.id === m.alunoId);
            const turma = Database.getTurma(m.turmaId);
            return `
                <tr>
                    <td><span class="fw-bold">${m.nr}</span></td>
                    <td>${aluno?.nome ?? '—'}</td>
                    <td>${turma?.nomeTurma ?? '—'}</td>
                    <td>${fmtData(m.dataMatricula)}</td>
                    <td><span class="badge badge-active px-3 py-2 rounded-pill">${StatusUtil.getDescricaoGeral(m.status)}</span></td>
                    <td class="text-center">
                        <button class="btn btn-sm text-primary" title="Editar"><i class="fa-solid fa-pen-to-square"></i></button>
                        <button class="btn btn-sm text-danger" title="Remover" onclick="removerMatricula(${m.nr})"><i class="fa-solid fa-trash"></i></button>
                    </td>
                </tr>
            `;
        }).join('');
    }

    // --- Tabela de Alunos (admin) ---
    const alunosTable = document.querySelector('#alunos-lista tbody');
    if (alunosTable) {
        renderAlunos();
    }

    function renderAlunos() {
        const tbody = document.querySelector('#alunos-lista tbody');
        if (!tbody) return;
        const alunos = Database.getAlunosCompleto();
        tbody.innerHTML = alunos.map(a => `
            <tr>
                <td>
                    <div class="d-flex align-items-center gap-2">
                        <img src="https://ui-avatars.com/api/?name=${encodeURIComponent(a.nome)}&background=7EC8D9&color=fff" class="rounded-circle" style="width:32px;" alt="${a.nome}">
                        <div>
                            <div class="fw-bold">${a.nome}</div>
                            <small class="text-muted">${fmtData(a.dataNascimento)}</small>
                        </div>
                    </div>
                </td>
                <td>${a.turma?.nomeTurma ?? '—'}</td>
                <td>${a.responsavel?.nome ?? '—'}</td>
                <td><span class="badge badge-active px-3 py-2 rounded-pill">Ativo</span></td>
                <td class="text-center">
                    <button class="btn btn-sm text-primary"><i class="fa-solid fa-pen-to-square"></i></button>
                    <button class="btn btn-sm text-danger"><i class="fa-solid fa-trash"></i></button>
                </td>
            </tr>
        `).join('');
    }

    // Ações Admin expostas globalmente
    window.removerProfessor = function(id) {
        if (!confirm('Remover este professor?')) return;
        Database.remove('professores', id);
        location.reload();
    };
    window.removerTurma = function(id) {
        if (!confirm('Remover esta turma?')) return;
        Database.remove('turmas', id);
        renderTurmas();
    };
    window.removerMatricula = function(nr) {
        if (!confirm('Remover esta matrícula?')) return;
        Database.remove('matriculas', nr);
        renderMatriculas();
    };

    // =========================================================================
    // DASHBOARD PROFESSOR
    // =========================================================================

    // --- Saudação dinâmica ---
    const saudacaoProfEl = document.getElementById('saudacao-prof');
    if (saudacaoProfEl) {
        // Usa nome da sessão, ou pega o primeiro professor do DB como fallback
        const prof = nomeSessao
            ? Database.get('professores').find(p => p.nome === nomeSessao)
            : Database.get('professores')[0];
        const nomeProf = prof?.nome ?? nomeSessao ?? 'Professor(a)';
        saudacaoProfEl.textContent = 'Olá, Prof. ' + nomeProf.split(' ')[0];

        // Info no header
        const headerProfNome = document.getElementById('header-prof-nome');
        const headerProfInfo = document.getElementById('header-prof-info');
        const headerProfAvatar = document.getElementById('header-prof-avatar');
        if (prof) {
            const turmaProf = Database.get('turmas').find(t => t.professorId === prof.id);
            if (headerProfNome) headerProfNome.textContent = prof.nome;
            if (headerProfInfo) headerProfInfo.textContent = prof.formacao + (turmaProf ? ' — ' + turmaProf.nomeTurma : '');
            if (headerProfAvatar) headerProfAvatar.src = `https://ui-avatars.com/api/?name=${encodeURIComponent(prof.nome)}&background=7EC8D9&color=fff`;
        }
    }

    // --- Stats do professor ---
    const statProfAlunos = document.getElementById('stat-prof-alunos');
    if (statProfAlunos) {
        const prof = Database.get('professores').find(p => p.nome === nomeSessao) ?? Database.get('professores')[0];
        const turmaProf = prof ? Database.get('turmas').find(t => t.professorId === prof.id) : null;
        const qtd = turmaProf ? Database.get('matriculas').filter(m => m.turmaId === turmaProf.id).length : 0;
        statProfAlunos.textContent = qtd;
    }
    const statProfPlanos = document.getElementById('stat-prof-planos');
    if (statProfPlanos) {
        const prof = Database.get('professores').find(p => p.nome === nomeSessao) ?? Database.get('professores')[0];
        const qtd = prof ? Database.get('planejamentos').filter(p => p.professorId === prof.id).length : 0;
        statProfPlanos.textContent = qtd;
    }

    // --- Select de alunos no Diário de Bordo ---
    const selectAlunoDiario = document.getElementById('select-aluno-diario');
    if (selectAlunoDiario) {
        const prof = Database.get('professores').find(p => p.nome === nomeSessao) ?? Database.get('professores')[0];
        const turmaProf = prof ? Database.get('turmas').find(t => t.professorId === prof.id) : null;
        const matriculas = turmaProf
            ? Database.get('matriculas').filter(m => m.turmaId === turmaProf.id)
            : Database.get('matriculas');
        const alunos = matriculas.map(m => Database.get('alunos').find(a => a.id === m.alunoId)).filter(Boolean);
        selectAlunoDiario.innerHTML = alunos.length
            ? alunos.map(a => `<option value="${a.id}">${a.nome}</option>`).join('')
            : '<option>Nenhum aluno na turma</option>';
    }

    // --- Grid de Planejamentos ---
    const planejamentoGrid = document.querySelector('#planejamento .row.g-4');
    if (planejamentoGrid) {
        const planos = Database.getPlanejamentosCompleto();
        planejamentoGrid.innerHTML = planos.length ? planos.map(p => `
            <div class="col-md-6 mb-4">
                <div class="stat-card">
                    <div class="d-flex justify-content-between mb-3">
                        <span class="badge ${p.status === 1 ? 'bg-green-light text-success' : 'bg-yellow-light text-warning'} rounded-pill px-3 py-2">${p.statusLabel}</span>
                        <span class="text-muted small">${fmtData(p.dataAula)}</span>
                    </div>
                    <h5 class="fw-bold text-dark-blue">${p.atividadeDinamica}</h5>
                    <p class="text-muted small">${p.descricao}</p>
                    <hr>
                    <div class="d-flex align-items-center gap-2">
                        <i class="fa-solid fa-users text-light-blue"></i>
                        <span class="small fw-bold">${p.turma}</span>
                        <span class="text-muted small ms-auto"><i class="fa-solid fa-chalkboard-user me-1"></i>${p.professor}</span>
                    </div>
                </div>
            </div>
        `).join('') : '<div class="col-12"><p class="text-muted">Nenhum planejamento cadastrado.</p></div>';
    }

    // --- Minhas Turmas (lista de alunos) ---
    const minhasTurmasEl = document.getElementById('minhas-turmas-lista');
    if (minhasTurmasEl) {
        const prof = Database.get('professores').find(p => p.nome === nomeSessao) ?? Database.get('professores')[0];
        const turmaProf = prof ? Database.get('turmas').find(t => t.professorId === prof.id) : null;
        if (turmaProf) {
            const matriculas = Database.get('matriculas').filter(m => m.turmaId === turmaProf.id);
            const alunos = matriculas.map(m => Database.getAlunosCompleto().find(a => a.id === m.alunoId)).filter(Boolean);
            minhasTurmasEl.innerHTML = `
                <h5 class="fw-bold text-dark-blue mb-3"><i class="fa-solid fa-chalkboard-user me-2"></i>${turmaProf.nomeTurma} — ${alunos.length} aluno${alunos.length !== 1 ? 's' : ''}</h5>
                <div class="table-responsive">
                    <table class="table table-hover align-middle mb-0">
                        <thead class="table-light">
                            <tr><th>Aluno</th><th>Nasc.</th><th>Alergias</th><th>Necessidades</th><th>Responsável</th></tr>
                        </thead>
                        <tbody>
                            ${alunos.map(a => `
                                <tr>
                                    <td>
                                        <div class="d-flex align-items-center gap-2">
                                            <img src="https://ui-avatars.com/api/?name=${encodeURIComponent(a.nome)}&background=7EC8D9&color=fff" class="rounded-circle" style="width:32px;">
                                            <span class="fw-bold">${a.nome}</span>
                                        </div>
                                    </td>
                                    <td>${fmtData(a.dataNascimento)}</td>
                                    <td>${a.alergias}</td>
                                    <td>${a.necessidadesEspeciais}</td>
                                    <td>${a.responsavel?.nome ?? '—'}</td>
                                </tr>
                            `).join('')}
                        </tbody>
                    </table>
                </div>
            `;
        } else {
            minhasTurmasEl.innerHTML = '<p class="text-muted">Nenhuma turma atribuída.</p>';
        }
    }

    // =========================================================================
    // DASHBOARD RESPONSÁVEL
    // =========================================================================

    // Pega o responsável logado (por nome de sessão ou primeiro do DB)
    const respLogado = nomeSessao
        ? Database.get('responsaveis').find(r => r.nome === nomeSessao)
        : Database.get('responsaveis')[0];

    // Encontra os alunos deste responsável
    const alunosDoResp = respLogado
        ? Database.getAlunosCompleto().filter(a => a.responsavelId === respLogado.id)
        : Database.getAlunosCompleto().slice(0, 1);

    const alunoAtual = alunosDoResp[0] ?? null;

    // --- Nome do responsável no header ---
    const headerRespNome = document.getElementById('header-resp-nome');
    if (headerRespNome) {
        headerRespNome.textContent = respLogado?.nome ?? 'Responsável';
    }
    const headerRespAvatar = document.getElementById('header-resp-avatar');
    if (headerRespAvatar && respLogado) {
        headerRespAvatar.src = `https://ui-avatars.com/api/?name=${encodeURIComponent(respLogado.nome)}&background=F2D544&color=2D4459`;
        headerRespAvatar.alt = respLogado.nome;
    }

    // --- Card do aluno ---
    const alunoNomeEl = document.getElementById('aluno-nome');
    if (alunoNomeEl && alunoAtual) {
        alunoNomeEl.textContent = alunoAtual.nome;
    }
    const alunoTurmaEl = document.getElementById('aluno-turma-prof');
    if (alunoTurmaEl && alunoAtual) {
        const turma = alunoAtual.turma;
        const prof = turma ? Database.getProfessor(turma.professorId) : null;
        alunoTurmaEl.textContent = (turma?.nomeTurma ?? '—') + (prof ? ' — Prof. ' + prof.nome.split(' ')[0] : '');
    }
    const alunoAvatarEl = document.getElementById('aluno-avatar');
    if (alunoAvatarEl && alunoAtual) {
        alunoAvatarEl.src = `https://ui-avatars.com/api/?name=${encodeURIComponent(alunoAtual.nome)}&background=7EC8D9&color=fff&size=128`;
    }
    const alunoAlergiasEl = document.getElementById('aluno-alergias');
    if (alunoAlergiasEl && alunoAtual) {
        alunoAlergiasEl.textContent = alunoAtual.alergias;
    }
    const alunoRestEl = document.getElementById('aluno-restricoes');
    if (alunoRestEl && alunoAtual) {
        alunoRestEl.textContent = alunoAtual.restricoesAlimentares;
    }
    const alunoNecEl = document.getElementById('aluno-necessidades');
    if (alunoNecEl && alunoAtual) {
        alunoNecEl.textContent = alunoAtual.necessidadesEspeciais;
    }

    // --- Diário de Bordo (responsável) ---
    const diarioContent = document.querySelector('#diario .form-card');
    if (diarioContent) {
        const diarios = Database.getDiariosCompleto();
        // Filtra pelo aluno do responsável, se possível
        const diariosFiltrados = alunoAtual
            ? diarios.filter(d => d.aluno?.id === alunoAtual.id)
            : diarios;
        const ultimoDiario = diariosFiltrados[diariosFiltrados.length - 1] ?? diarios[diarios.length - 1];

        if (ultimoDiario) {
            diarioContent.innerHTML = `
                <div class="d-flex justify-content-between align-items-center mb-4">
                    <h4 class="fw-bold text-dark-blue mb-0"><i class="fa-solid fa-star text-yellow-main me-2"></i>Diário de Bordo — ${ultimoDiario.aluno?.nome ?? '—'}</h4>
                    <span class="text-muted small">${fmtData(ultimoDiario.dataRegistro)}</span>
                </div>
                <div class="row g-3 mb-4">
                    <div class="col-md-4">
                        <div class="bg-light p-3 rounded-4 text-center">
                            <i class="fa-solid fa-face-smile fs-3 text-success mb-2"></i>
                            <h6 class="fw-bold mb-1">Humor</h6>
                            <p class="small mb-0">${ultimoDiario.humor}</p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="bg-light p-3 rounded-4 text-center">
                            <i class="fa-solid fa-utensils fs-3 text-primary mb-2"></i>
                            <h6 class="fw-bold mb-1">Alimentação</h6>
                            <p class="small mb-0">${ultimoDiario.alimentacao}</p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="bg-light p-3 rounded-4 text-center">
                            <i class="fa-solid fa-moon fs-3 text-warning mb-2"></i>
                            <h6 class="fw-bold mb-1">Sono</h6>
                            <p class="small mb-0">${ultimoDiario.sono}</p>
                        </div>
                    </div>
                </div>
                <div class="bg-light p-4 rounded-4 mb-0">
                    <h6 class="fw-bold text-dark-blue mb-2">Mensagem do Professor:</h6>
                    <p class="mb-0 text-secondary fst-italic">"${ultimoDiario.observacoes}"</p>
                </div>
            `;
        } else {
            diarioContent.innerHTML = `
                <div class="text-center py-4 text-muted">
                    <i class="fa-solid fa-book-open fs-1 mb-3 opacity-25"></i>
                    <p>Nenhum registro no diário ainda.</p>
                </div>`;
        }
    }

    // --- Tabela de Autorizados (responsável) ---
    const autorizadosTable = document.querySelector('#autorizados tbody');
    if (autorizadosTable) {
        // Filtra autorizados vinculados ao aluno do responsável logado
        let autorizados = Database.get('autorizados');
        if (alunoAtual?.autorizadoId) {
            // Mostra o autorizado do aluno + todos (simulação demo)
            const autPrincipal = autorizados.find(a => a.id === alunoAtual.autorizadoId);
            autorizados = autPrincipal ? [autPrincipal] : autorizados.slice(0, 3);
        } else {
            autorizados = autorizados.slice(0, 3);
        }

        autorizadosTable.innerHTML = autorizados.map(a => `
            <tr>
                <td>
                    <div class="fw-bold">${a.nome}</div>
                    <small class="text-muted">CPF: ${mascaraCpf(a.cpf)}</small>
                </td>
                <td>${a.grauParentesco}</td>
                <td>${mascaraTel(a.telefone)}</td>
                <td class="text-end">
                    <button class="btn btn-sm text-danger"><i class="fa-solid fa-trash"></i></button>
                </td>
            </tr>
        `).join('');
    }

    // --- Info do aluno (render.js antigo — compatibilidade) ---
    const alunoInfoEl = document.getElementById('aluno-info');
    if (alunoInfoEl && alunoAtual) {
        alunoInfoEl.innerHTML = `
            <p class="mb-1"><strong>Nome:</strong> ${alunoAtual.nome}</p>
            <p class="mb-1"><strong>Turma:</strong> ${alunoAtual.turma?.nomeTurma ?? '—'}</p>
            <p class="mb-1"><strong>Alergias:</strong> ${alunoAtual.alergias}</p>
            <p class="mb-1"><strong>Restrições Alimentares:</strong> ${alunoAtual.restricoesAlimentares}</p>
            <p class="mb-0"><strong>Necessidades Especiais:</strong> ${alunoAtual.necessidadesEspeciais}</p>
        `;
    }
});
