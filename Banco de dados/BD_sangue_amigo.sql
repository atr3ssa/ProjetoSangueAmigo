show databases;

-- criação da base de dados sangue_amigo
-- create database sangue_amigo;

use sangue_amigo;

-- criação da tabela Usuario (id_usuario, nome_usuario, Cpf_usuario, email_usuario, senha_usuario, dataDeNascimento, Cep, tipoSanguineo)
create table Usuario (
id_usuario INT AUTO_INCREMENT primary key,
nome_usuario VARCHAR(100) NOT NULL,
Cpf_usuario Varchar(11) not null,
email_usuario Varchar(100) unique not null,
senha_usuario VARCHAR(20) NOT NULL,
dataDeNascimento VARCHAR(10) NOT NULL,
Cep VARCHAR(8) NOT NULL,
tipoSanguineo VARCHAR(3) not NULL
);

-- criação da tabela AgendarExames (codigoExame, local_exame, data_exame, hora_exame, opcaoExame, doador)
-- atributo doador possui chave estrangeira com referência a usuario(id_usuario)
create table AgendarExames (
codigoExame int auto_increment primary key,
local_exame VARCHAR(80) NOT NULL,
data_exame VARCHAR(10) NOT NULL,
hora_exame VARCHAR(5) NOT NULL,
opcaoExame VARCHAR(45) NOT NULL,
doador int,
foreign key (doador) references usuario(id_usuario)
);

-- criação da tabela AgendarDoacao (codigoDoacao, local_doacao, data_doacao, hora_doacao, opcaodoacao, doador)
-- atributo doador possui chave estrangeira com referência a usuario(id_usuario)
create table AgendarDoacao(
codigoDoacao int auto_increment primary key,
local_doacao VARCHAR(80) NOT NULL,
data_doacao VARCHAR(10) NOT NULL,
hora_doacao VARCHAR(5) NOT NULL,
opcaoDoacao VARCHAR(45) NOT NULL,
doador int,
foreign key (doador) references usuario(id_usuario)
);

-- Mostrar tabelas
show tables;

-- Usuario

describe usuario;
select* from usuario;

UPDATE  usuario SET nome_usuario="Ramon",senha_usuario="" WHERE id_usuario=0;

-- AgendarExames

describe agendarexames;
select* from agendarexames;


-- AgendarDoacao

describe agendardoacao;
select* from agendarexames;

select * from usuario where email_usuario="dre.emy89@gmail.com" and senha_usuario="usjt";

