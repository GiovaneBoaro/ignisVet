create table pacientes (

    id bigint not null auto_increment,
    nome_animal varchar(100) not null,
    idade_animal int not null,
    especie_animal varchar(100) not null,
    nome_dono varchar(100) not null,
    email_dono varchar(100) not null unique,
    telefone_dono varchar(100) not null,
    cpf_dono varchar(11) not null unique,

    primary key(id)
);