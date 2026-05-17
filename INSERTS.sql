USE banco_girassol;
GO

--PESSOAS
INSERT INTO pessoas (nome, cpf, rg, data_nascimento, senha, cep, cidade, uf, endereco, telefone) VALUES 
-- Professores
('Professora Helena', '11111111111', '11111111', '1990-01-01', 'senha1', '15000000', 'São Paulo', 'SP', 'Rua Escola, 1', '11910000001'),
('Professor Girafales', '22222222222', '22222222', '1985-02-02', 'senha2', '15000001', 'São Paulo', 'SP', 'Rua Escola, 2', '11910000002'),
-- Responsáveis
('Seu Madruga', '33333333333', '33333333', '1970-05-05', 'senha3', '15000002', 'São Paulo', 'SP', 'Vila, 72', '11920000003'),
('Dona Florinda', '44444444444', '44444444', '1975-06-06', 'senha4', '15000003', 'São Paulo', 'SP', 'Vila, 14', '11920000004'),
('Seu Sousa', '55555555555', '55555555', '1980-08-08', 'senha5', '15000004', 'São Paulo', 'SP', 'Limoeiro, 10', '11920000005'),
('Dona Luísa', '66666666666', '66666666', '1982-09-09', 'senha6', '15000005', 'São Paulo', 'SP', 'Limoeiro, 11', '11920000006'),
-- Autorizados a Buscar
('Dona Clotilde', '77777777777', '77777777', '1960-07-07', 'senha7', '15000006', 'São Paulo', 'SP', 'Vila, 71', '11930000007'),
('Jaiminho', '88888888888', '88888888', '1950-06-06', 'senha8', '15000007', 'São Paulo', 'SP', 'Tangamandápio, 1', '11930000008'),
('Cebola (Pai)', '99999999999', '99999999', '1981-10-10', 'senha9', '15000008', 'São Paulo', 'SP', 'Limoeiro, 20', '11930000009'),
('Tia Nena', '10101010101', '10101010', '1965-03-03', 'senha10', '15000009', 'São Paulo', 'SP', 'Rua Magia, 5', '11930000010');
GO
SELECT * FROM pessoas;


--ALUNOS
INSERT INTO alunos (nome, data_nascimento, alergias, restricoes_alimentar, necessidades_especiais) VALUES 
('Chiquinha', '2019-01-15', 'Nenhuma', 'Nenhuma', 'Nenhuma'),
('Kiko', '2019-04-30', 'Amendoim', 'Nenhuma', 'Nenhuma'),
('Mônica', '2019-03-21', 'Nenhuma', 'Nenhuma', 'Força descomunal'),
('Magali', '2019-05-15', 'Nenhuma', 'Evitar excesso', 'Nenhuma');
GO
SELECT * FROM alunos;

--PROFESSORES
INSERT INTO professores (pessoa_codigo, data_contratacao, formacao, status) VALUES 
(1, '2020-01-15', 'Pedagogia', 1), 
(2, '2015-03-10', 'Letras', 1);
SELECT * FROM professores;

--RESPONSÁVEIS
INSERT INTO responsaveis (pessoa_codigo, local_trabalho, telefone_trabalho, estado_civil, status) VALUES 
(3, 'Biscateiro', '1100000003', 'Viúvo', 1), 
(4, 'Dona de Casa', '1100000004', 'Viúva', 1),
(5, 'Escritório', '1100000005', 'Casado', 1), 
(6, 'Arquiteta', '1100000006', 'Casada', 1);
SELECT * FROM responsaveis;

--AUTORIZADOS A BUSCAR 
INSERT INTO autorizados_busca (codigo, aluno_codigo, grau_parentesco) VALUES 
(7, 1, 'Vizinha'),    
(8, 2, 'Amigo'),      
(9, 3, 'Tio'),       
(10, 4, 'Tia');      
SELECT * FROM autorizados_busca;

--VINCULANDO RESPONSÁVEIS AOS ALUNOS
INSERT INTO responsavel_aluno (responsavel_codigo, aluno_codigo, grau_parentesco, esp_financeiro, ordem_contato) VALUES 
(3, 1, 'Pai', 0, 1), 
(4, 2, 'Mãe', 1, 1), 
(5, 3, 'Pai', 1, 1), 
(6, 4, 'Mãe', 1, 1); 
GO
SELECT * FROM responsavel_aluno;



--TURMAS
INSERT INTO turmas (professor_codigo, nome_turma, ano, grau) VALUES 
(1, 'Turma do Carrossel', '2026', 'Jardim I'),
(2, 'Turma da Vila', '2026', 'Jardim II');
SELECT * FROM turmas;

--MATRÍCULAS
INSERT INTO matriculas (aluno_codigo, turma_codigo, data_matricula, status) VALUES 
(1, 1, '2026-01-10', 1), 
(2, 1, '2026-01-10', 1), 
(3, 2, '2026-01-10', 1), 
(4, 2, '2026-01-10', 1);
SELECT * FROM matriculas;

--AULAS PLANEJAMENTOS
INSERT INTO aulas_planejamentos (professor_codigo, turma_codigo, data_aula, atividade_dinamica, descricao, status) VALUES 
(1, 1, '2026-05-18', 'Pintura a dedo', 'Artes com tinta.', 1),
(2, 2, '2026-05-18', 'Aritmética', 'Somando maçãs.', 1);
SELECT * FROM aulas_planejamentos;

--FREQUÊNCIAS
INSERT INTO frequencias (aula_planejamentos_codigo, matricula_codigo, status_presenca) VALUES 
(1, 1, 'P'), 
(1, 2, 'P'), 
(2, 3, 'P'), 
(2, 4, 'P');
SELECT * FROM frequencias;

--DIÁRIO DE BORDO 
INSERT INTO diario_bordo (matricula_nr, data_registro, compareceu, alimentacao, sono, humor, banheiro_fralda, observacoes) VALUES 
(1, '2026-05-18', 1, 'Boa', 'Não dormiu', 'Chorosa', 'Independente', 'Chorou de mentirinha.'),
(2, '2026-05-18', 1, 'Ótima', 'Dormiu 30 min', 'Alegre', 'Independente', 'Não emprestou a bola quadrada.'),
(3, '2026-05-18', 1, 'Boa', 'Não dormiu', 'Agitada', 'Independente', 'Correu muito no recreio.'),
(4, '2026-05-18', 1, 'Excelente', 'Não dormiu', 'Feliz', 'Independente', 'Repetiu o lanche três vezes.');
SELECT * FROM diario_bordo;














