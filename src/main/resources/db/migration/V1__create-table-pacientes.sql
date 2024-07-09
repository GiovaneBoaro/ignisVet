create table pacientes (

    id bigint not null auto_increment,
    nomeAnimal varchar(100) not null,
    idadeAnimal int not null,
    especieAnimal varchar(100) not null,
    nomeDono varchar(100) not null,
    emailDono varchar(100) not null unique,
    telefoneDono varchar(100) not null,
    cpfDono varchar(11) not null unique,

    primary key(id)
);