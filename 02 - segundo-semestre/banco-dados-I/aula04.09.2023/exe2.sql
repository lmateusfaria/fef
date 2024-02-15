CREATE TABLE funcionario (
cpf varchar(14) PRIMARY KEY,
nome varchar(50),
endereco varchar(50),
cpf_gerente varchar(14) REFERENCES funcionario(cpf)

);


INSERT INTO funcionario(cpf,nome,endereco,cpf_gerente) VALUES('000.000.000-00','Gerente 00','Rua do Gerente 00, Bairro 00 - Cidade 00','000.000.000-00');

INSERT INTO funcionario(cpf,nome,endereco,cpf_gerente) VALUES('000.000.000-02','Funcionario 02','Rua do 02, Bairro 02 - Cidade 02','000.000.000-00');

INSERT INTO funcionario(cpf,nome,endereco,cpf_gerente) VALUES('000.000.000-01','Funcionario 03','Rua do 01, Bairro 03 - Cidade 03','000.000.000-00');

SELECT * FROM funcionario;