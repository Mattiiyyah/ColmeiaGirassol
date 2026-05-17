create database banco_girassol;
go 

use banco_girassol;
go

create table alunos
(
    codigo                 int             not null identity primary key, 
    nome                   varchar(100)    not null,
    data_nascimento        date            not null,
    alergias               varchar(50)     not null,
    restricoes_alimentar   varchar(50)     not null,
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
    endereco        varchar(100)    not null, 
    telefone        varchar(15)     not null  
)
go

create table autorizados_busca
(
    codigo          int             not null primary key references pessoas(codigo),
    aluno_codigo    int             not null references alunos(codigo),
    grau_parentesco varchar(50)     not null
)
go

create table professores
(
    pessoa_codigo       int             not null primary key references pessoas(codigo),
    data_contratacao    varchar(50)     not null,
    formacao            varchar(50)     not null,
    status              int             not null
)
go

create table responsaveis
(
    pessoa_codigo       int             not null primary key references pessoas(codigo),
    local_trabalho      varchar(50)     not null,
    telefone_trabalho   varchar(15)     not null, -- Oficializado no diagrama
    estado_civil        varchar(50)     not null,
    status              int             not null
)
go

create table responsavel_aluno
(
    responsavel_codigo  int             not null references responsaveis(pessoa_codigo),
    aluno_codigo        int             not null references alunos(codigo),
    grau_parentesco     varchar(20)     not null, 
    esp_financeiro      bit             not null, 
    ordem_contato       int             not null, 
    primary key (responsavel_codigo, aluno_codigo)
)
go

create table turmas
(
    codigo              int             not null primary key identity,
    professor_codigo    int             not null references professores(pessoa_codigo),
    nome_turma          varchar(50)     not null,
    ano                 varchar(50)     not null,
    grau                varchar(50)     not null
)
go

create table aulas_planejamentos
(
    codigo              int             not null identity primary key,
    professor_codigo    int             not null references professores(pessoa_codigo),
    turma_codigo        int             not null references turmas(codigo),
    data_aula           date            not null,
    atividade_dinamica  varchar(200)    not null,
    descricao           varchar(200)    not null,
    status              int             not null
)
go

create table matriculas
(
    nr             int          not null primary key identity,
    aluno_codigo   int          not null references alunos(codigo),
    turma_codigo   int          not null references turmas(codigo),
    data_matricula varchar(50)  not null,
    status         int          not null
)
go

create table frequencias
(
    aula_planejamentos_codigo         int             not null references aulas_planejamentos(codigo),
    matricula_codigo                  int             not null references matriculas(nr),
    status_presenca                   char(1)         not null,
    primary key (aula_planejamentos_codigo,  matricula_codigo)
)
go

create table diario_bordo
(
    codigo              int             not null identity primary key,
    matricula_nr        int             not null references matriculas(nr),
    data_registro       varchar(50)     not null,
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

-- Constraints para garantir unicidade
ALTER TABLE pessoas ADD CONSTRAINT uq_pessoas_cpf UNIQUE (cpf);
ALTER TABLE pessoas ADD CONSTRAINT uq_pessoas_rg UNIQUE (rg);
ALTER TABLE pessoas ADD CONSTRAINT uq_pessoas_endereco UNIQUE (endereco); -- Opcional, mas útil caso endereço seja usado como e-mail

-- Matrícula só pode receber status 1 (Ativa), 2 (Cancelada) ou 3 (Concluída)
ALTER TABLE matriculas ADD CONSTRAINT chk_matricula_status CHECK (status IN (1, 2, 3));