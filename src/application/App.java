package application;

import java.time.LocalDate;
import java.util.ArrayList;

import entities.ResponsavelEntity;
import entities.ProfessorEntity;
import entities.AutorizadoBuscarEntity;
import entities.AlunoEntity;
import entities.ResponsavelAlunoEntity;
import entities.AutorizadoBuscarAlunoEntity;
import entities.TurmaEntity;
import entities.MatriculaEntity;
import entities.AulasPlanejamentoEntity;
import entities.MatriculaAulasEntity;
import entities.DiarioBordoEntity;

public class App {
    public static void main(String[] args) {

        System.out.println("\n+=======  SISTEMA COLMEIA GIRASSOL  =========+");

        //instaciação de responsavel
        ResponsavelEntity r1 = new ResponsavelEntity(1, "Silmara", "111.111.1", "1111-1", LocalDate.of(1990, 5, 10), "123", "08000-000", "São Paulo", "SP", "silmara@email.com", "(11) 99999-9999", "Escola Girassol", "(11) 3333-3333", 0, "Casada");
        
        ResponsavelEntity r2 = new ResponsavelEntity(2, "João Silva", "222.222.2", "2222-2", LocalDate.of(1985, 3, 15), "456", "08000-001", "São Paulo", "SP", "joao@email.com", "(11) 98888-8888", "Indústria X", "(11) 3333-4444", 0, "Casado");
        
        ResponsavelEntity r3 = new ResponsavelEntity(3, "Maria Oliveira", "333.333.3", "3333-3", LocalDate.of(1992, 7, 20), "789", "08000-002", "São Paulo", "SP", "maria@email.com", "(11) 97777-7777", "Hospital Y", "(11) 3333-5555", 0, "Solteira");
        
        ResponsavelEntity r4 = new ResponsavelEntity(4, "Pedro Santos", "444.444.4", "4444-4", LocalDate.of(1980, 11, 5), "abc", "08000-003", "São Paulo", "SP", "pedro@email.com", "(11) 96666-6666", "Comércio Z", "(11) 3333-6666", 0, "Casado");
        
        ResponsavelEntity r5 = new ResponsavelEntity(5, "Ana Souza", "555.555.5", "5555-5", LocalDate.of(1988, 1, 30), "def", "08000-004", "São Paulo", "SP", "ana@email.com", "(11) 95555-5555", "Banco W", "(11) 3333-7777", 0, "Divorciada");
        
        ResponsavelEntity r6 = new ResponsavelEntity(6, "Carlos Lima", "666.666.6", "6666-6", LocalDate.of(1975, 9, 12), "ghi", "08000-005", "São Paulo", "SP", "carlos@email.com", "(11) 94444-4444", "Oficina K", "(11) 3333-8888", 0, "Casado");
        
        ResponsavelEntity r7 = new ResponsavelEntity(7, "Fernanda Costa", "777.777.7", "7777-7", LocalDate.of(1995, 5, 25), "jkl", "08000-006", "São Paulo", "SP", "fernanda@email.com", "(11) 93333-3333", "Estúdio M", "(11) 3333-9999", 0, "Solteira");
        
        ResponsavelEntity r8 = new ResponsavelEntity(8, "Ricardo Pereira", "888.888.8", "8888-8", LocalDate.of(1982, 12, 10), "mno", "08000-007", "São Paulo", "SP", "ricardo@email.com", "(11) 92222-2222", "Escritório L", "(11) 3333-0000", 0, "Casado");
        
        ResponsavelEntity r9 = new ResponsavelEntity(9, "Juliana Rocha", "999.999.9", "9999-9", LocalDate.of(1990, 8, 5), "pqr", "08000-008", "São Paulo", "SP", "juliana@email.com", "(11) 91111-1111", "Clínica P", "(11) 3333-1111", 0, "Casada");
        
        ResponsavelEntity r10 = new ResponsavelEntity(10, "Lucas Mendes", "000.000.0", "0000-0", LocalDate.of(1987, 4, 18), "stu", "08000-009", "São Paulo", "SP", "lucas@email.com", "(11) 90000-0000", "Startup Q", "(11) 3333-2222", 0, "Solteiro");
        
        ArrayList<ResponsavelEntity> responsaveis = new ArrayList<>();
        responsaveis.add(r1);
        responsaveis.add(r2);
        responsaveis.add(r3);
        responsaveis.add(r4);
        responsaveis.add(r5);
        responsaveis.add(r6);
        responsaveis.add(r7);
        responsaveis.add(r8);
        responsaveis.add(r9);
        responsaveis.add(r10);

        // Instanciação de Autorizado a Buscar
        AutorizadoBuscarEntity ab1 = new AutorizadoBuscarEntity(1, "Tio Barnabé", "123.456.7", "1234-5", LocalDate.of(1960, 5, 10), "senha1", "08000-100", "São Paulo", "SP", "barnabe@email.com", "(11) 91111-0001", "Tio");

        AutorizadoBuscarEntity ab2 = new AutorizadoBuscarEntity(2, "Dona Benta", "234.567.8", "2345-6", LocalDate.of(1950, 3, 15), "senha2", "08000-101", "São Paulo", "SP", "benta@email.com", "(11) 91111-0002", "Avó");

        AutorizadoBuscarEntity ab3 = new AutorizadoBuscarEntity(3, "Tia Nastácia", "345.678.9", "3456-7", LocalDate.of(1955, 7, 20), "senha3", "08000-102", "São Paulo", "SP", "nastacia@email.com", "(11) 91111-0003", "Tia");

        AutorizadoBuscarEntity ab4 = new AutorizadoBuscarEntity(4, "Visconde de Sabugosa", "456.789.0", "4567-8", LocalDate.of(1970, 11, 5), "senha4", "08000-103", "São Paulo", "SP", "visconde@email.com", "(11) 91111-0004", "Primo");

        AutorizadoBuscarEntity ab5 = new AutorizadoBuscarEntity(5, "Emília", "567.890.1", "5678-9", LocalDate.of(2010, 1, 30), "senha5", "08000-104", "São Paulo", "SP", "emilia@email.com", "(11) 91111-0005", "Irmã");

        AutorizadoBuscarEntity ab6 = new AutorizadoBuscarEntity(6, "Zeca Pagodinho", "678.901.2", "6789-0", LocalDate.of(1965, 9, 12), "senha6", "08000-105", "São Paulo", "SP", "zeca@email.com", "(11) 91111-0006", "Vizinho");

        AutorizadoBuscarEntity ab7 = new AutorizadoBuscarEntity(7, "Luciana Gimenez", "789.012.3", "7890-1", LocalDate.of(1980, 5, 25), "senha7", "08000-106", "São Paulo", "SP", "luciana@email.com", "(11) 91111-0007", "Madrinha");

        AutorizadoBuscarEntity ab8 = new AutorizadoBuscarEntity(8, "Fernando Pessoa", "890.123.4", "8901-2", LocalDate.of(1975, 12, 10), "senha8", "08000-107", "São Paulo", "SP", "fernando@email.com", "(11) 91111-0008", "Padrinho");

        AutorizadoBuscarEntity ab9 = new AutorizadoBuscarEntity(9, "Beatriz Segall", "901.234.5", "9012-3", LocalDate.of(1968, 8, 5), "senha9", "08000-108", "São Paulo", "SP", "beatriz@email.com", "(11) 91111-0009", "Amiga da Família");

        AutorizadoBuscarEntity ab10 = new AutorizadoBuscarEntity(10, "Jorge Ben", "012.345.6", "0123-4", LocalDate.of(1972, 4, 18), "senha10", "08000-109", "São Paulo", "SP", "jorge@email.com", "(11) 91111-0010", "Motorista");

        ArrayList<AutorizadoBuscarEntity> autorizados = new ArrayList<>();
        autorizados.add(ab1);
        autorizados.add(ab2);
        autorizados.add(ab3);
        autorizados.add(ab4);
        autorizados.add(ab5);
        autorizados.add(ab6);
        autorizados.add(ab7);
        autorizados.add(ab8);
        autorizados.add(ab9);
        autorizados.add(ab10);

        // Instanciação de Professores
        ProfessorEntity p1 = new ProfessorEntity(1, "Marcos Silva", "111.222.333-01", "12345-1", LocalDate.of(1980, 5, 10), "senha1", "08000-201", "São Paulo", "SP", "marcos@escola.com", "(11) 92222-1111", LocalDate.of(2015, 2, 1), "Pedagogia", 0);
        ProfessorEntity p2 = new ProfessorEntity(2, "Sandra Oliveira", "222.333.444-02", "22345-2", LocalDate.of(1985, 3, 15), "senha2", "08000-202", "São Paulo", "SP", "sandra@escola.com", "(11) 92222-2222", LocalDate.of(2016, 3, 1), "Pedagogia", 0);
        ProfessorEntity p3 = new ProfessorEntity(3, "Roberto Santos", "333.444.555-03", "32345-3", LocalDate.of(1975, 7, 20), "senha3", "08000-203", "São Paulo", "SP", "roberto@escola.com", "(11) 92222-3333", LocalDate.of(2014, 1, 1), "Pedagogia", 0);
        ProfessorEntity p4 = new ProfessorEntity(4, "Cláudia Souza", "444.555.666-04", "42345-4", LocalDate.of(1982, 11, 5), "senha4", "08000-204", "São Paulo", "SP", "claudia@escola.com", "(11) 92222-4444", LocalDate.of(2017, 5, 1), "Pedagogia", 0);
        ProfessorEntity p5 = new ProfessorEntity(5, "Paulo Lima", "555.666.777-05", "52345-5", LocalDate.of(1990, 1, 30), "senha5", "08000-205", "São Paulo", "SP", "paulo@escola.com", "(11) 92222-5555", LocalDate.of(2018, 8, 1), "Pedagogia", 0);
        ProfessorEntity p6 = new ProfessorEntity(6, "Regina Costa", "666.777.888-06", "62345-6", LocalDate.of(1978, 9, 12), "senha6", "08000-206", "São Paulo", "SP", "regina@escola.com", "(11) 92222-6666", LocalDate.of(2015, 6, 1), "Pedagogia", 0);
        ProfessorEntity p7 = new ProfessorEntity(7, "Fábio Pereira", "777.888.999-07", "72345-7", LocalDate.of(1988, 5, 25), "senha7", "08000-207", "São Paulo", "SP", "fabio@escola.com", "(11) 92222-7777", LocalDate.of(2019, 2, 1), "Natação", 0);
        ProfessorEntity p8 = new ProfessorEntity(8, "Márcia Rocha", "888.999.000-08", "82345-8", LocalDate.of(1983, 12, 10), "senha8", "08000-208", "São Paulo", "SP", "marcia@escola.com", "(11) 92222-8888", LocalDate.of(2016, 10, 1), "Educação Física", 0);
        ProfessorEntity p9 = new ProfessorEntity(9, "André Mendes", "999.000.111-09", "92345-9", LocalDate.of(1992, 8, 5), "senha9", "08000-209", "São Paulo", "SP", "andre@escola.com", "(11) 92222-9999", LocalDate.of(2020, 1, 1), "Espanhol", 0);
        ProfessorEntity p10 = new ProfessorEntity(10, "Sônia Castro", "000.111.222-10", "02345-0", LocalDate.of(1970, 4, 18), "senha10", "08000-210", "São Paulo", "SP", "sonia@escola.com", "(11) 92222-0000", LocalDate.of(2013, 2, 1), "Inglês", 0);

        ArrayList<ProfessorEntity> professores = new ArrayList<>();
        professores.add(p1);
        professores.add(p2);
        professores.add(p3);
        professores.add(p4);
        professores.add(p5);
        professores.add(p6);
        professores.add(p7);
        professores.add(p8);
        professores.add(p9);
        professores.add(p10);

        // Instanciação de Alunos e Relacionamentos N:N
        ArrayList<AlunoEntity> alunos = new ArrayList<>();

        // Aluno 1
        AlunoEntity a1 = new AlunoEntity(1, "Joãozinho Silva", LocalDate.of(2018, 5, 10), "Nenhuma", "Nenhuma", "Nenhuma", new ArrayList<>(), new ArrayList<>());
        a1.adicionarResponsavel(new ResponsavelAlunoEntity(r1, a1, "Mãe", 100.0, 1));
        a1.adicionarAutorizado(new AutorizadoBuscarAlunoEntity(ab1, a1));
        alunos.add(a1);

        // Aluno 2
        AlunoEntity a2 = new AlunoEntity(2, "Mariazinha Oliveira", LocalDate.of(2019, 3, 15), "Poeira", "Lactose", "Nenhuma", new ArrayList<>(), new ArrayList<>());
        a2.adicionarResponsavel(new ResponsavelAlunoEntity(r2, a2, "Pai", 100.0, 1));
        a2.adicionarAutorizado(new AutorizadoBuscarAlunoEntity(ab2, a2));
        alunos.add(a2);

        // Aluno 3
        AlunoEntity a3 = new AlunoEntity(3, "Pedrinho Santos", LocalDate.of(2017, 7, 20), "Nenhuma", "Nenhuma", "TDAH", new ArrayList<>(), new ArrayList<>());
        a3.adicionarResponsavel(new ResponsavelAlunoEntity(r3, a3, "Mãe", 100.0, 1));
        a3.adicionarAutorizado(new AutorizadoBuscarAlunoEntity(ab3, a3));
        alunos.add(a3);

        // Aluno 4
        AlunoEntity a4 = new AlunoEntity(4, "Aninha Souza", LocalDate.of(2020, 11, 5), "Amendoim", "Amendoim", "Nenhuma", new ArrayList<>(), new ArrayList<>());
        a4.adicionarResponsavel(new ResponsavelAlunoEntity(r4, a4, "Pai", 100.0, 1));
        a4.adicionarAutorizado(new AutorizadoBuscarAlunoEntity(ab4, a4));
        alunos.add(a4);

        // Aluno 5
        AlunoEntity a5 = new AlunoEntity(5, "Chiquinho Lima", LocalDate.of(2018, 1, 30), "Nenhuma", "Nenhuma", "Nenhuma", new ArrayList<>(), new ArrayList<>());
        a5.adicionarResponsavel(new ResponsavelAlunoEntity(r5, a5, "Mãe", 100.0, 1));
        a5.adicionarAutorizado(new AutorizadoBuscarAlunoEntity(ab5, a5));
        alunos.add(a5);

        // Aluno 6
        AlunoEntity a6 = new AlunoEntity(6, "Belinha Costa", LocalDate.of(2019, 9, 12), "Nenhuma", "Glúten", "Nenhuma", new ArrayList<>(), new ArrayList<>());
        a6.adicionarResponsavel(new ResponsavelAlunoEntity(r6, a6, "Pai", 100.0, 1));
        a6.adicionarAutorizado(new AutorizadoBuscarAlunoEntity(ab6, a6));
        alunos.add(a6);

        // Aluno 7
        AlunoEntity a7 = new AlunoEntity(7, "Zequinha Pereira", LocalDate.of(2017, 5, 25), "Gatos", "Nenhuma", "Nenhuma", new ArrayList<>(), new ArrayList<>());
        a7.adicionarResponsavel(new ResponsavelAlunoEntity(r7, a7, "Mãe", 100.0, 1));
        a7.adicionarAutorizado(new AutorizadoBuscarAlunoEntity(ab7, a7));
        alunos.add(a7);

        // Aluno 8
        AlunoEntity a8 = new AlunoEntity(8, "Dudinha Rocha", LocalDate.of(2018, 12, 10), "Nenhuma", "Nenhuma", "Autismo", new ArrayList<>(), new ArrayList<>());
        a8.adicionarResponsavel(new ResponsavelAlunoEntity(r8, a8, "Pai", 100.0, 1));
        a8.adicionarAutorizado(new AutorizadoBuscarAlunoEntity(ab8, a8));
        alunos.add(a8);

        // Aluno 9
        AlunoEntity a9 = new AlunoEntity(9, "Gui Mendes", LocalDate.of(2020, 8, 5), "Nenhuma", "Nenhuma", "Nenhuma", new ArrayList<>(), new ArrayList<>());
        a9.adicionarResponsavel(new ResponsavelAlunoEntity(r9, a9, "Mãe", 100.0, 1));
        a9.adicionarAutorizado(new AutorizadoBuscarAlunoEntity(ab9, a9));
        alunos.add(a9);

        // Aluno 10
        AlunoEntity a10 = new AlunoEntity(10, "Lala Castro", LocalDate.of(2019, 4, 18), "Nenhuma", "Nenhuma", "Nenhuma", new ArrayList<>(), new ArrayList<>());
        a10.adicionarResponsavel(new ResponsavelAlunoEntity(r10, a10, "Pai", 100.0, 1));
        a10.adicionarAutorizado(new AutorizadoBuscarAlunoEntity(ab10, a10));
        alunos.add(a10);

        // 1. Instanciação de Turmas
        ArrayList<TurmaEntity> turmas = new ArrayList<>();
        TurmaEntity t1 = new TurmaEntity(1, "Berçário I", "2024", "Infantil", new ArrayList<>(), p1);
        TurmaEntity t2 = new TurmaEntity(2, "Berçário II", "2024", "Infantil", new ArrayList<>(), p2);
        TurmaEntity t3 = new TurmaEntity(3, "Maternal I-A", "2024", "Infantil", new ArrayList<>(), p3);
        TurmaEntity t4 = new TurmaEntity(4, "Maternal I-B", "2024", "Infantil", new ArrayList<>(), p4);
        TurmaEntity t5 = new TurmaEntity(5, "Maternal II-A", "2024", "Infantil", new ArrayList<>(), p5);
        TurmaEntity t6 = new TurmaEntity(6, "Maternal II-B", "2024", "Infantil", new ArrayList<>(), p6);
        TurmaEntity t7 = new TurmaEntity(7, "Etapa 1-A", "2024", "Infantil", new ArrayList<>(), p7);
        TurmaEntity t8 = new TurmaEntity(7, "Etapa 1-B", "2024", "Infantil", new ArrayList<>(), p8);
        TurmaEntity t9 = new TurmaEntity(9, "Etapa 2-A", "2024", "Infantil", new ArrayList<>(), p9);
        TurmaEntity t10 = new TurmaEntity(10, "Etapa 2-B", "2024", "Infantil", new ArrayList<>(), p10);
        turmas.add(t1); turmas.add(t2); turmas.add(t3); turmas.add(t4); turmas.add(t5);
        turmas.add(t6); turmas.add(t7); turmas.add(t8); turmas.add(t9); turmas.add(t10);

        // 2. Instanciação de Matrículas
        ArrayList<MatriculaEntity> matriculas = new ArrayList<>();
        MatriculaEntity m1 = new MatriculaEntity(101, LocalDate.now(), 0, a1, new ArrayList<>());
        MatriculaEntity m2 = new MatriculaEntity(102, LocalDate.now(), 0, a2, new ArrayList<>());
        MatriculaEntity m3 = new MatriculaEntity(103, LocalDate.now(), 0, a3, new ArrayList<>());
        MatriculaEntity m4 = new MatriculaEntity(104, LocalDate.now(), 0, a4, new ArrayList<>());
        MatriculaEntity m5 = new MatriculaEntity(105, LocalDate.now(), 0, a5, new ArrayList<>());
        MatriculaEntity m6 = new MatriculaEntity(106, LocalDate.now(), 0, a6, new ArrayList<>());
        MatriculaEntity m7 = new MatriculaEntity(107, LocalDate.now(), 0, a7, new ArrayList<>());
        MatriculaEntity m8 = new MatriculaEntity(108, LocalDate.now(), 0, a8, new ArrayList<>());
        MatriculaEntity m9 = new MatriculaEntity(109, LocalDate.now(), 0, a9, new ArrayList<>());
        MatriculaEntity m10 = new MatriculaEntity(110, LocalDate.now(), 0, a10, new ArrayList<>());

        matriculas.add(m1); matriculas.add(m2); matriculas.add(m3); matriculas.add(m4); matriculas.add(m5);
        matriculas.add(m6); matriculas.add(m7); matriculas.add(m8); matriculas.add(m9); matriculas.add(m10);

        // Vinculando Matrículas às Turmas (5 em cada uma para exemplo)
        t1.adicionarMatricula(m1); t1.adicionarMatricula(m2); t1.adicionarMatricula(m3); t1.adicionarMatricula(m4); t1.adicionarMatricula(m5);
        t2.adicionarMatricula(m6); t2.adicionarMatricula(m7); t2.adicionarMatricula(m8); t2.adicionarMatricula(m9); t2.adicionarMatricula(m10);

        // 3. Instanciação de Aulas Planejadas
        ArrayList<AulasPlanejamentoEntity> aulas = new ArrayList<>();

        AulasPlanejamentoEntity ap1 = new AulasPlanejamentoEntity(1, LocalDate.now(), "Pintura a Dedo", "Atividade criativa com tintas", 0, p1, t1);

        AulasPlanejamentoEntity ap2 = new AulasPlanejamentoEntity(2, LocalDate.now().plusDays(1), "Roda de Cantiga", "Cantar músicas infantis", 0, p2, t2);

        AulasPlanejamentoEntity ap3 = new AulasPlanejamentoEntity(3, LocalDate.now().plusDays(2), "Contação de Histórias", "Leitura de contos clássicos", 0, p3, t3);

        AulasPlanejamentoEntity ap4 = new AulasPlanejamentoEntity(4, LocalDate.now().plusDays(3), "Brincadeiras de Roda", "Interação social com música", 0, p4, t4);

        AulasPlanejamentoEntity ap5 = new AulasPlanejamentoEntity(5, LocalDate.now().plusDays(4), "Aula de Natureza", "Exploração do jardim", 0, p5, t5);

        AulasPlanejamentoEntity ap6 = new AulasPlanejamentoEntity(6, LocalDate.now().plusDays(5), "Matemática Divertida", "Contagem com objetos", 0, p6, t6);

        AulasPlanejamentoEntity ap7 = new AulasPlanejamentoEntity(7, LocalDate.now().plusDays(6), "Expressão Corporal", "Dança e movimentos", 0, p7, t7);

        AulasPlanejamentoEntity ap8 = new AulasPlanejamentoEntity(8, LocalDate.now().plusDays(7), "Iniciação ao Inglês", "Cores e saudações em inglês", 0, p8, t8);

        AulasPlanejamentoEntity ap9 = new AulasPlanejamentoEntity(9, LocalDate.now().plusDays(8), "Experiências Científicas", "Mistura de cores e texturas", 0, p9, t9);

        AulasPlanejamentoEntity ap10 = new AulasPlanejamentoEntity(10, LocalDate.now().plusDays(9), "Atividade Sensorial", "Explorando diferentes materiais", 0, p10, t10);
        
        
        aulas.add(ap1); aulas.add(ap2); aulas.add(ap3); aulas.add(ap4); aulas.add(ap5);
        aulas.add(ap6); aulas.add(ap7); aulas.add(ap8); aulas.add(ap9); aulas.add(ap10);
        // ... (pode-se criar mais 8 seguindo o mesmo padrão)

        // 4. Instanciação de Presença (MatriculaAulas)
        ArrayList<MatriculaAulasEntity> presencas = new ArrayList<>();
        MatriculaAulasEntity ma1 = new MatriculaAulasEntity(ap1, m1, 0); // Presente
        MatriculaAulasEntity ma2 = new MatriculaAulasEntity(ap1, m2, 1); // Falta
        MatriculaAulasEntity ma3 = new MatriculaAulasEntity(ap2, m3, 0); // Presente
        MatriculaAulasEntity ma4 = new MatriculaAulasEntity(ap2, m4, 0); // Presente
        MatriculaAulasEntity ma5 = new MatriculaAulasEntity(ap3, m5, 0); // Presente
        MatriculaAulasEntity ma6 = new MatriculaAulasEntity(ap3, m6, 1); // Falta
        MatriculaAulasEntity ma7 = new MatriculaAulasEntity(ap4, m7, 0); // Presente
        MatriculaAulasEntity ma8 = new MatriculaAulasEntity(ap4, m8, 0); // Presente
        MatriculaAulasEntity ma9 = new MatriculaAulasEntity(ap5, m9, 0); // Presente
        MatriculaAulasEntity ma10 = new MatriculaAulasEntity(ap5, m10, 1); // Falta

        presencas.add(ma1); presencas.add(ma2); presencas.add(ma3); presencas.add(ma4); presencas.add(ma5);
        presencas.add(ma6); presencas.add(ma7); presencas.add(ma8); presencas.add(ma9); presencas.add(ma10);

        // 5. Instanciação de Diário de Bordo
        ArrayList<DiarioBordoEntity> diarios = new ArrayList<>();
        DiarioBordoEntity db1 = new DiarioBordoEntity(1, LocalDate.now(), (byte)1, "Comeu tudo", "Dormiu 1h", "Feliz", "Troca normal", "Muito participativo", m1, p1);
        DiarioBordoEntity db2 = new DiarioBordoEntity(2, LocalDate.now(), (byte)1, "Recusou legumes", "Dormiu pouco", "Agitado", "Troca normal", "Brincou muito no parque", m2, p2);
        DiarioBordoEntity db3 = new DiarioBordoEntity(3, LocalDate.now(), (byte)1, "Comeu bem", "Não dormiu", "Calmo", "Troca normal", "Concentrado na pintura", m3, p3);
        DiarioBordoEntity db4 = new DiarioBordoEntity(4, LocalDate.now(), (byte)1, "Comeu tudo", "Dormiu 2h", "Radiante", "Troca normal", "Adora a roda de música", m4, p4);
        DiarioBordoEntity db5 = new DiarioBordoEntity(5, LocalDate.now(), (byte)1, "Lanchou bem", "Dormiu 1h30", "Feliz", "Troca normal", "Interagiu com os colegas", m5, p5);
        DiarioBordoEntity db6 = new DiarioBordoEntity(6, LocalDate.now(), (byte)1, "Comeu tudo", "Dormiu 1h", "Preguiçoso", "Troca normal", "Ficou quietinho hoje", m6, p6);
        DiarioBordoEntity db7 = new DiarioBordoEntity(7, LocalDate.now(), (byte)1, "Recusou a fruta", "Não dormiu", "Choroso", "Troca normal", "Sentiu falta da mamãe", m7, p7);
        DiarioBordoEntity db8 = new DiarioBordoEntity(8, LocalDate.now(), (byte)1, "Comeu bem", "Dormiu 1h", "Feliz", "Troca normal", "Muito interessado na história", m8, p8);
        DiarioBordoEntity db9 = new DiarioBordoEntity(9, LocalDate.now(), (byte)1, "Comeu tudo", "Dormiu 2h", "Energético", "Troca normal", "Correu muito no pátio", m9, p9);
        DiarioBordoEntity db10 = new DiarioBordoEntity(10, LocalDate.now(), (byte)1, "Comeu bem", "Dormiu 1h", "Tranquilo", "Troca normal", "Desenhou a família", m10, p10);
        
        diarios.add(db1); diarios.add(db2); diarios.add(db3); diarios.add(db4); diarios.add(db5);
        diarios.add(db6); diarios.add(db7); diarios.add(db8); diarios.add(db9); diarios.add(db10);

        // =========================================================================
        // DEMONSTRAÇÃO DO SISTEMA COLMEIA GIRASSOL (ESTRUTURADA)
        // =========================================================================

        System.out.println("\n+--------------------------------------------------------------------------+");
        System.out.println("|                RELATÓRIO GERAL DO SISTEMA COLMEIA GIRASSOL               |");
        System.out.println("+--------------------------------------------------------------------------+");

        // 1. Responsáveis
        System.out.println(BORDER_TITLE(" LISTA DE RESPONSÁVEIS "));
        System.out.printf("%-5s | %-20s | %-14s | %-15s | %-10s%n", "CÓD", "NOME", "CPF", "TELEFONE", "STATUS");
        System.out.println("--------------------------------------------------------------------------");
        responsaveis.forEach(r -> {
            System.out.printf("%-5d | %-20s | %-14s | %-15s | %s%n",
                r.getCodigo(), r.getNome(), r.getCpf(), r.getTelefone(), r.getStatusDescricao());
        });

        // 2. Autorizados a Buscar
        System.out.println(BORDER_TITLE(" LISTA DE AUTORIZADOS A BUSCAR "));
        System.out.printf("%-5s | %-20s | %-15s | %-15s%n", "CÓD", "NOME", "PARENTESCO", "CIDADE");
        System.out.println("--------------------------------------------------------------------------");
        autorizados.forEach(a -> {
            System.out.printf("%-5d | %-20s | %-15s | %-15s%n",
                a.getCodigo(), a.getNome(), a.getGrauParentesco(), a.getCidade());
        });

        // 3. Professores
        System.out.println(BORDER_TITLE(" LISTA DE PROFESSORES "));
        System.out.printf("%-5s | %-20s | %-20s | %-10s%n", "CÓD", "NOME", "FORMAÇÃO", "STATUS");
        System.out.println("--------------------------------------------------------------------------");
        professores.forEach(p -> {
            System.out.printf("%-5d | %-20s | %-20s | %s%n",
                p.getCodigo(), p.getNome(), p.getFormacao(), p.getStatusDescricao());
        });

        // 4. Alunos e Relacionamentos N:N
        System.out.println(BORDER_TITLE(" ALUNOS E VÍNCULOS FAMILIARES "));
        alunos.forEach(aluno -> {
            System.out.println("- Aluno(a): " + aluno.getNome() + " (Cód: " + aluno.getCodigo() + ")");
            System.out.print("  > Responsáveis: ");
            aluno.getResponsavel().forEach(ra -> System.out.print("[" + ra.getResponsavel().getNome() + " - " + ra.getGrauParentesco() + "] "));
            System.out.print("\n  > Autorizados:  ");
            aluno.getAutorizado().forEach(aba -> System.out.print("[" + aba.getAutorizado().getNome() + " - " + aba.getAutorizado().getGrauParentesco() + "] "));
            System.out.println("\n--------------------------------------------------------------------------");
        });

        // 5. Turmas
        System.out.println(BORDER_TITLE(" GESTÃO DE TURMAS "));
        turmas.forEach(t -> {
            System.out.printf("TURMA: %-15s | PROF: %-15s | ANO: %s%n", 
                t.getNomeTurma(), t.getProfessor().getNome(), t.getAno());
        });

        // 6. Matrículas
        System.out.println(BORDER_TITLE(" MATRÍCULAS ATIVAS "));
        System.out.printf("%-6s | %-20s | %-12s | %-10s%n", "MATR", "ALUNO", "DATA", "STATUS");
        System.out.println("--------------------------------------------------------------------------");
        matriculas.forEach(m -> {
            System.out.printf("%-6d | %-20s | %-12s | %s%n",
                m.getNr(), m.getAluno().getNome(), m.getDataMatricula(), m.getStatusDescricao());
        });

        // 7. Aulas Planejadas
        System.out.println(BORDER_TITLE(" PRÓXIMAS AULAS PLANEJADAS "));
        aulas.forEach(ap -> {
            System.out.printf("DATA: %s | %-25s | TURMA: %s%n",
                ap.getDataAula(), ap.getAtividadeDinamica(), ap.getTurma().getNomeTurma());
        });

        // 8. Diário de Bordo
        System.out.println(BORDER_TITLE(" ÚLTIMOS REGISTROS DO DIÁRIO DE BORDO "));
        diarios.forEach(db -> {
            System.out.println("Registro: " + db.getDataRegistro() + " | Aluno: " + db.getMatricula().getAluno().getNome());
            System.out.println("  Humor: " + db.getHumor() + " | Alimentação: " + db.getAlimentacao());
            System.out.println("  Obs: " + db.getObservacoes());
            System.out.println("--------------------------------------------------------------------------");
        });

        System.out.println("\n+--------------------------------------------------------------------------+");
        System.out.println("|                         FIM DO RELATÓRIO GERAL                           |");
        System.out.println("+--------------------------------------------------------------------------+");
    }

    private static String BORDER_TITLE(String title) {
        return "\n--- [ " + title + " ] ---";
    }
}