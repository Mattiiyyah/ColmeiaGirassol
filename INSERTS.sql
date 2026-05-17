USE banco_girassol;
GO


INSERT INTO pessoas
(nome, cpf, rg, data_nascimento, senha, cep, cidade, uf, endereco, telefone)
VALUES

-- PROFESSORES
('Professora Helena', '11111111111', '11111111', '1990-01-01', 'senha1', '15000001', 'São Paulo', 'SP', 'Rua Escola 1', '11911111111'),
('Professor Girafales', '22222222222', '22222222', '1985-02-02', 'senha2', '15000002', 'São Paulo', 'SP', 'Rua Escola 2', '11922222222'),
('Professora Carmem', '33333333333', '33333333', '1988-03-03', 'senha3', '15000003', 'São Paulo', 'SP', 'Rua Escola 3', '11933333333'),
('Professor Xavier', '44444444444', '44444444', '1980-04-04', 'senha4', '15000004', 'São Paulo', 'SP', 'Rua Escola 4', '11944444444'),
('Professora Marta', '55555555555', '55555555', '1989-05-05', 'senha5', '15000005', 'São Paulo', 'SP', 'Rua Escola 5', '11955555555'),
('Professor João', '66666666666', '66666666', '1981-06-06', 'senha6', '15000006', 'São Paulo', 'SP', 'Rua Escola 6', '11966666666'),
('Professora Bianca', '77777777777', '77777777', '1992-07-07', 'senha7', '15000007', 'São Paulo', 'SP', 'Rua Escola 7', '11977777777'),
('Professor Renato', '88888888888', '88888888', '1987-08-08', 'senha8', '15000008', 'São Paulo', 'SP', 'Rua Escola 8', '11988888888'),
('Professora Júlia', '99999999999', '99999999', '1991-09-09', 'senha9', '15000009', 'São Paulo', 'SP', 'Rua Escola 9', '11999999999'),
('Professor Carlos', '10101010101', '10101010', '1983-10-10', 'senha10', '15000010', 'São Paulo', 'SP', 'Rua Escola 10', '11910101010'),

-- RESPONSÁVEIS
('Seu Madruga', '11111111112', '11111112', '1970-01-01', 'senha11', '15000011', 'São Paulo', 'SP', 'Vila 72', '11911111112'),
('Dona Florinda', '22222222223', '22222223', '1971-02-02', 'senha12', '15000012', 'São Paulo', 'SP', 'Vila 14', '11922222223'),
('Seu Sousa', '33333333334', '33333334', '1972-03-03', 'senha13', '15000013', 'São Paulo', 'SP', 'Limoeiro 10', '11933333334'),
('Dona Luísa', '44444444445', '44444445', '1973-04-04', 'senha14', '15000014', 'São Paulo', 'SP', 'Limoeiro 11', '11944444445'),
('Seu Barriga', '55555555556', '55555556', '1974-05-05', 'senha15', '15000015', 'São Paulo', 'SP', 'Centro 50', '11955555556'),
('Dona Clotilde', '66666666667', '66666667', '1975-06-06', 'senha16', '15000016', 'São Paulo', 'SP', 'Vila 71', '11966666667'),
('Jaiminho', '77777777778', '77777778', '1976-07-07', 'senha17', '15000017', 'São Paulo', 'SP', 'Tangamandápio 1', '11977777778'),
('Tia Nena', '88888888889', '88888889', '1977-08-08', 'senha18', '15000018', 'São Paulo', 'SP', 'Rua Magia 5', '11988888889'),
('Cebola Pai', '99999999990', '99999990', '1978-09-09', 'senha19', '15000019', 'São Paulo', 'SP', 'Limoeiro 20', '11999999990'),
('Dona Benta', '10101010102', '10101011', '1979-10-10', 'senha20', '15000020', 'São Paulo', 'SP', 'Sítio 1', '11910101011'),

-- AUTORIZADOS
('Tio Chico', '11111111113', '11111113', '1980-01-01', 'senha21', '15000021', 'São Paulo', 'SP', 'Rua A', '11911111113'),
('Vó Anastácia', '22222222224', '22222224', '1981-02-02', 'senha22', '15000022', 'São Paulo', 'SP', 'Rua B', '11922222224'),
('Padrinho Leo', '33333333335', '33333335', '1982-03-03', 'senha23', '15000023', 'São Paulo', 'SP', 'Rua C', '11933333335'),
('Tia Rita', '44444444446', '44444446', '1983-04-04', 'senha24', '15000024', 'São Paulo', 'SP', 'Rua D', '11944444446'),
('Vizinha Ana', '55555555557', '55555557', '1984-05-05', 'senha25', '15000025', 'São Paulo', 'SP', 'Rua E', '11955555557'),
('Tio Jorge', '66666666668', '66666668', '1985-06-06', 'senha26', '15000026', 'São Paulo', 'SP', 'Rua F', '11966666668'),
('Madrinha Rosa', '77777777779', '77777779', '1986-07-07', 'senha27', '15000027', 'São Paulo', 'SP', 'Rua G', '11977777779'),
('Tio Paulo', '88888888880', '88888880', '1987-08-08', 'senha28', '15000028', 'São Paulo', 'SP', 'Rua H', '11988888880'),
('Prima Clara', '99999999991', '99999991', '1988-09-09', 'senha29', '15000029', 'São Paulo', 'SP', 'Rua I', '11999999991'),
('Vizinho Beto', '10101010103', '10101012', '1989-10-10', 'senha30', '15000030', 'São Paulo', 'SP', 'Rua J', '11910101012');
GO
SELECT * FROM pessoas;


-- PROFESSORES
INSERT INTO professores (pessoa_codigo, data_contratacao, formacao, status)
VALUES
(1,'2020-01-01','Pedagogia',1),
(2,'2020-01-01','Letras',1),
(3,'2020-01-01','Matemática',1),
(4,'2020-01-01','História',1),
(5,'2020-01-01','Artes',1),
(6,'2020-01-01','Biologia',1),
(7,'2020-01-01','Educação Física',1),
(8,'2020-01-01','Psicopedagogia',1),
(9,'2020-01-01','Música',1),
(10,'2020-01-01','Geografia',1);
SELECT * FROM professores;

-- RESPONSÁVEIS
INSERT INTO responsaveis
(pessoa_codigo, local_trabalho, telefone_trabalho, estado_civil, status)
VALUES
(11,'Oficina','1100000011','Viúvo',1),
(12,'Casa','1100000012','Viúva',1),
(13,'Escritório','1100000013','Casado',1),
(14,'Hospital','1100000014','Casada',1),
(15,'Mercado','1100000015','Casado',1),
(16,'Loja','1100000016','Solteira',1),
(17,'Correios','1100000017','Solteiro',1),
(18,'Padaria','1100000018','Casada',1),
(19,'Banco','1100000019','Casado',1),
(20,'Sítio','1100000020','Viúva',1);
SELECT * FROM responsaveis;

-- ALUNOS
INSERT INTO alunos
(nome, data_nascimento, alergias, restricoes_alimentar, necessidades_especiais)
VALUES
('Chiquinha','2019-01-15','Nenhuma','Nenhuma','Nenhuma'),
('Kiko','2019-04-30','Amendoim','Nenhuma','Nenhuma'),
('Mônica','2019-03-21','Nenhuma','Nenhuma','Força descomunal'),
('Magali','2019-05-15','Nenhuma','Evitar excesso','Nenhuma'),
('Cebolinha','2019-06-20','Nenhuma','Nenhuma','Troca R pelo L'),
('Cascão','2019-07-22','Nenhuma','Nenhuma','Medo de água'),
('Narizinho','2019-08-10','Leite','Sem lactose','Nenhuma'),
('Pedrinho','2019-09-12','Nenhuma','Nenhuma','Nenhuma'),
('Emília','2019-10-05','Nenhuma','Nenhuma','Muito falante'),
('Bidu','2019-11-01','Nenhuma','Nenhuma','Nenhuma');
SELECT * FROM alunos;


-- AUTORIZADOS
INSERT INTO autorizados_busca (codigo, aluno_codigo, grau_parentesco)
VALUES
(21,1,'Tio'),
(22,2,'Avó'),
(23,3,'Padrinho'),
(24,4,'Tia'),
(25,5,'Vizinha'),
(26,6,'Tio'),
(27,7,'Madrinha'),
(28,8,'Tio'),
(29,9,'Prima'),
(30,10,'Vizinho');
SELECT * FROM autorizados_busca;


-- RESPONSÁVEL ALUNO
INSERT INTO responsavel_aluno
(responsavel_codigo, aluno_codigo, grau_parentesco, esp_financeiro, ordem_contato)
VALUES
(11,1,'Pai',1,1),
(12,2,'Mãe',1,1),
(13,3,'Pai',1,1),
(14,4,'Mãe',1,1),
(15,5,'Pai',1,1),
(16,6,'Mãe',1,1),
(17,7,'Avô',1,1),
(18,8,'Tia',1,1),
(19,9,'Pai',1,1),
(20,10,'Avó',1,1);
SELECT * FROM responsavel_aluno;


-- TURMAS
INSERT INTO turmas
(professor_codigo, nome_turma, ano, grau)
VALUES
(1,'Turma A','2026','Jardim I'),
(2,'Turma B','2026','Jardim I'),
(3,'Turma C','2026','Jardim II'),
(4,'Turma D','2026','Jardim II'),
(5,'Turma E','2026','Maternal'),
(6,'Turma F','2026','Maternal'),
(7,'Turma G','2026','Pré'),
(8,'Turma H','2026','Pré'),
(9,'Turma I','2026','Pré'),
(10,'Turma J','2026','Jardim III');
SELECT * FROM turmas;


-- MATRÍCULAS
INSERT INTO matriculas
(aluno_codigo, turma_codigo, data_matricula, status)
VALUES
(1,1,'2026-01-10',1),
(2,2,'2026-01-10',1),
(3,3,'2026-01-10',1),
(4,4,'2026-01-10',1),
(5,5,'2026-01-10',1),
(6,6,'2026-01-10',1),
(7,7,'2026-01-10',1),
(8,8,'2026-01-10',1),
(9,9,'2026-01-10',1),
(10,10,'2026-01-10',1);
SELECT * FROM matriculas;

-- AULAS
INSERT INTO aulas_planejamentos
(professor_codigo, turma_codigo, data_aula, atividade_dinamica, descricao, status)
VALUES
(1,1,'2026-05-18','Pintura','Tintas coloridas',1),
(2,2,'2026-05-18','Leitura','Leitura infantil',1),
(3,3,'2026-05-18','Matemática','Somando maçãs',1),
(4,4,'2026-05-18','História','Contação de histórias',1),
(5,5,'2026-05-18','Massinha','Modelagem',1),
(6,6,'2026-05-18','Natureza','Plantas e flores',1),
(7,7,'2026-05-18','Corrida','Circuito motor',1),
(8,8,'2026-05-18','Música','Cantigas',1),
(9,9,'2026-05-18','Teatro','Fantoches',1),
(10,10,'2026-05-18','Geografia','Animais do mundo',1);
SELECT * FROM aulas_planejamentos;

-- FREQUÊNCIAS
INSERT INTO frequencias
(aula_planejamentos_codigo, matricula_codigo, status_presenca)
VALUES
(1,1,'P'),
(2,2,'P'),
(3,3,'P'),
(4,4,'P'),
(5,5,'P'),
(6,6,'P'),
(7,7,'P'),
(8,8,'P'),
(9,9,'P'),
(10,10,'P');
SELECT * FROM frequencias;


-- DIÁRIO DE BORDO
INSERT INTO diario_bordo
(matricula_nr, data_registro, compareceu, alimentacao, sono, humor, banheiro_fralda, observacoes)
VALUES
(1,'2026-05-18',1,'Boa','Dormiu 20 min','Feliz','Independente','Participou bem da aula.'),
(2,'2026-05-18',1,'Ótima','Dormiu 30 min','Animado','Independente','Brincou bastante.'),
(3,'2026-05-18',1,'Boa','Não dormiu','Agitado','Independente','Correu muito no recreio.'),
(4,'2026-05-18',1,'Excelente','Dormiu 40 min','Feliz','Independente','Gostou da história.'),
(5,'2026-05-18',1,'Boa','Dormiu 15 min','Calmo','Independente','Brincou com massinha.'),
(6,'2026-05-18',1,'Regular','Não dormiu','Quieto','Independente','Participou pouco.'),
(7,'2026-05-18',1,'Boa','Dormiu 50 min','Alegre','Independente','Cantou durante a aula.'),
(8,'2026-05-18',1,'Ótima','Dormiu 25 min','Animado','Independente','Gostou da música.'),
(9,'2026-05-18',1,'Excelente','Dormiu 35 min','Feliz','Independente','Adorou os fantoches.'),
(10,'2026-05-18',1,'Boa','Dormiu 20 min','Calmo','Independente','Prestou atenção na aula.');
GO
SELECT * FROM diario_bordo;