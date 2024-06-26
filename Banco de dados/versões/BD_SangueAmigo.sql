-- mostrar databases --
show databases;
-- create database SangueAmigo;

-- usar database sangueamigo
use sangueamigo;

-- -----------------------------------
-- Tabela Usuario
-- -----------------------------------

CREATE TABLE IF NOT EXISTS `Usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `nome_usuario` VARCHAR(45) NOT NULL,
  `senha_usuario` VARCHAR(8) NOT NULL,
  `dataDeNascimento` VARCHAR(10) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `tipoSanguineo` VARCHAR(3) NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB;

-- -----------------------------------------
-- Tabela AgendarDoacao
-- -----------------------------------------

CREATE TABLE IF NOT EXISTS `AgendarDoacao` (
  `codigoDoacao` VARCHAR(45) NOT NULL,
  `local_doacao` VARCHAR(45) NOT NULL,
  `data_doacao` VARCHAR(8) NOT NULL,
  `hora_doacao` VARCHAR(5) NOT NULL,
  `opcaoDoacao` VARCHAR(45) NOT NULL,
  `Usuario_id_usuario` INT NOT NULL,
  PRIMARY KEY (`Usuario_id_usuario`, `codigoDoacao`),
  INDEX `fk_AgendarDoacao_Usuario_idx` (`Usuario_id_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_AgendarDoacao_Usuario`
    FOREIGN KEY (`Usuario_id_usuario`)
    REFERENCES `Usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------
-- Tabela AgendarExames
-- -----------------------------------------

CREATE TABLE IF NOT EXISTS `AgendarExames` (
  `codigoExame` VARCHAR(45) NOT NULL,
  `local_exame` VARCHAR(45) NOT NULL,
  `data_exame` VARCHAR(8) NOT NULL,
  `hora_exame` VARCHAR(5) NOT NULL,
  `OpcaoExame` VARCHAR(45) NOT NULL,
  `Usuario_id_usuario` INT NOT NULL,
  PRIMARY KEY (`Usuario_id_usuario`, `codigoExame`),
  CONSTRAINT `fk_AgendarExames_Usuario1`
    FOREIGN KEY (`Usuario_id_usuario`)
    REFERENCES `Usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- Add novas colunas na tabela Usuario

Alter table usuario add column email Varchar(45) not null;
Alter table usuario add column CPF_aluno Varchar(15) not null;

-- Renomear colunas na tabela Usuario 
Alter table usuario
rename column email to email_usuario,
rename column CPF_aluno to cpf_usuario;

-- Descreva a Tabela Usuario

describe usuario;
describe agendardoacao;
describe agendarexames;

select* from usuario;

alter table agendardoacao drop column codigoDoacao;
Alter table agendardoacao add column codigodoacao int not null;
-- teste
INSERT INTO usuario (nome_usuario, datadeNascimento, endereco, tipoSanguineo, email_usuario, cpf_usuario, senha_usuario) VALUES ('ana','01012000','av bandeirantes','B-','anabanana@gmail.com','12323434545','12345678')
INSERT INTO agendardoacao (local_doacao, data_doacao, hora_doacao, opcaoDoacao, codigodoacao) VALUES ('Cotia','12/04','14:00','plaquetas','0')


