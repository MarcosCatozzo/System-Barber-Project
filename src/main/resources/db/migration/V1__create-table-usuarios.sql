create table usuarios(
    id bigint not null auto_increment,
    nome varchar (50) not null,
    sobre_nome varchar (50) not null,
    email varchar (50) not null,
    logradouro varchar (100) not null,
    bairro varchar (100) not null,
    numero varchar (50) not null,

    primary key(id)
);