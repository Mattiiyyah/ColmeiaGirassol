create database banco_girassol;
go 

use banco_girassol;
go

create table alunos
(
    codigo                 int             not null identity primary key, 
    nome                   varchar(100)    not null,
    data_nascimento        date            not null,
    data_ingresso          date            not null,
    tipo_sanguineo         char(2)         not null,
    alergias               varchar(50)     not null,
    restricoes_alimentares varchar(50)     not null,
    necessidades_especiais varchar(50)     not null
)
go

create table pessoas
(
    codigo          int             not null primary key identity,
    nome            varchar(50)     not null,
    cpf             varchar(11)     not null,
    rg              varchar(8)      not null,
    data_nascimento date            not null,
    senha           varchar(50)     not null,
    cep             varchar(8)      not null,
    cidade          varchar(50)     not null,
    uf              char(2)         not null,
    email           varchar(100)    not null,
    telefone        varchar(15)     not null
)
go

create table autorizados_busca
(
    codigo          int             not null primary key references pessoas,
    aluno_codigo    int             not null references alunos,
    grau_parentesco varchar(50)     not null
)
go

create table professores
(
    pessoa_codigo       int             not null primary key references pessoas,
    data_contratacao    datetime        not null,
    formacao            varchar(50)     not null,
    status              int             not null
)
go

create table responsaveis
(
    pessoa_codigo       int             not null primary key references pessoas,
    local_trabalho      varchar(50)     not null,
    telefone_trabalho   varchar(15)     not null,
    estado_civil        varchar(50)     not null,
    status              int             not null
)
go

create table responsavel_aluno
(
    responsavel_codigo  int             not null references responsaveis,
    aluno_codigo        int             not null references alunos,
    grau_parentesco     varchar(20)     not null, 
    e_financeiro        bit             not null, 
    ordem_contato       int             not null, 
    primary key (responsavel_codigo, aluno_codigo)
)
go

create table turmas
(
    codigo              int             not null primary key identity,
    professor_codigo    int             not null references professores,
    nome_turma          varchar(50)     not null,
    ano                 varchar(50)     not null,
    grau                varchar(50)     not null
)
go

create table aulas_planejamentos
(
    codigo              int             not null identity primary key,
    professor_codigo    int             not null references professores,
    turma_codigo        int             not null references turmas,
    data_aula           date            not null,
    atividade_dinamica  varchar(200)    not null,
    descricao           varchar(200)    not null,
    status  int                         not null
)
go

create table frequencias
(
    aula_planejamentos_codigo         int             not null references aulas_planejamentos,
    matricula_codigo                  int             not null references matriculas,
    status_presenca                   char(1)         not null,
    primary key (aula_planejamentos_codigo,  matricula_codigo)
)
go

create table matriculas
(
    nr                          int             not null primary key identity,
    aluno_codigo                int             not null references alunos,
    turma_codigo                int             not null references turmas,
    data_matricula              date            not null,
    status                      int             not null
)
go

create table diario_bordo
(
    codigo              int             not null identity primary key,
    matricula_nr        int             not null references matriculas,
    data_registro       date            not null,
    compareceu          bit             not null, 
    alimentacao         varchar(50)     null, 
    sono                varchar(50)     null, 
    humor               varchar(50)     null, 
    banheiro_fralda     varchar(50)     null, 
    observacoes         varchar(500)    null,
  
    CONSTRAINT chk_logica_falta CHECK (
        (compareceu = 1) 
        OR 
        (compareceu = 0 AND alimentacao IS NULL AND sono IS NULL AND humor IS NULL AND banheiro_fralda IS NULL)
    )
)
go

-- Faz que o banco de dados não permite dois cpfs ou rgs iguais 
ALTER TABLE pessoas ADD CONSTRAINT uq_pessoas_cpf UNIQUE (cpf);
ALTER TABLE pessoas ADD CONSTRAINT uq_pessoas_rg UNIQUE (rg);

--Faz que o banco de dados não permite dois emails iguias
ALTER TABLE pessoas ADD CONSTRAINT uq_emails_endereco UNIQUE (endereco);

-- Matrícula só pode receber status 1 (Ativa), 2 (Cancelada) ou 3 (Concluída)
ALTER TABLE matriculas ADD CONSTRAINT chk_matricula_status CHECK (status IN (1, 2, 3));

-- Mensalidade só pode receber 1 (Aberta), 2 (Paga) ou 3 (Atrasada)
ALTER TABLE mensalidades ADD CONSTRAINT chk_mensalidade_status CHECK (status IN (1, 2, 3));