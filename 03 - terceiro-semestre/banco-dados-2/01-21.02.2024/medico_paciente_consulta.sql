﻿
CREATE TABLE MEDICO(
	CRM INT NOT NULL PRIMARY KEY,
	NOME VARCHAR (50),
	RUA VARCHAR (50),
	NUMERO VARCHAR (5),
	BAIRRO VARCHAR (50),
	CEP VARCHAR (8),
	CIDADE VARCHAR (50),
	TELEFONES VARCHAR (100),
	ESPECIALIDADES VARCHAR (100)
	
);

INSERT INTO MEDICO(CRM,NOME,RUA,NUMERO,BAIRRO,CEP,CIDADE,TELEFONES,ESPECIALIDADES)
VALUES (1, 'SEU ZÉ', 'RUA DO TESTE','01','BAIRRO DO TESTE','15600123','FERPACITY',
	'(17)3442-0000 - (17)3442-0001','PEDIATRA');
INSERT INTO MEDICO(CRM,NOME,RUA,NUMERO,BAIRRO,CEP,CIDADE,TELEFONES,ESPECIALIDADES)
VALUES (2, 'DONA MARIA', 'RUA TESTEIRA','01','BAIRRO TESTES','15600129','VOTUCITY',
	'(17)3442-0000 - (17)3442-0001','PEDIATRA'),
	(3, 'SEU TOIN', 'RUA TESTA','02','BAIRRO TESTADO','15600120','JALESCITY',
	'(17)3442-0003 - (17)3442-0006','CLINICO GERAL');

SELECT * FROM MEDICO;
	
CREATE TABLE PACIENTE(
	CPF INT NOT NULL PRIMARY KEY,
	NOME VARCHAR (50),
	RUA VARCHAR (50),
	NUMERO VARCHAR (5),
	BAIRRO VARCHAR (50),
	CEP VARCHAR (8),
	CIDADE VARCHAR (50),
	TELEFONES VARCHAR (100),
	DATA_NASCIMENTO DATE,
	CRM_MEDICO INT REFERENCES MEDICO(CRM)
);

INSERT INTO PACIENTE(CPF,NOME,RUA,NUMERO,BAIRRO,CEP,CIDADE,TELEFONES,DATA_NASCIMENTO,CRM_MEDICO)
VALUES (1, 'RAIMUNDO', 'RUA TESTEIRA','04','BAIRRO TESTES','15600129','VOTUCITY',
	'(17)3442-0010','02-01-2010',2),
	(2, 'DANIELA', 'RUA TESTADA','03','BAIRRO TESTADO','15600120','JALESCITY',
	'(17)3442-0015','02-11-2008',3),
	(3, 'JOAQUIM', 'RUA TESTS','07','BAIRRO TESTANDO','15600128','FERPACITY',
	'(17)3442-0022','02-05-2003',1);

SELECT * FROM PACIENTE;

CREATE TABLE CONSULTA (
	DATA_ DATE,
	HORARIO VARCHAR(5),
	CPF_PACIENTE INT REFERENCES PACIENTE(CPF),
	CRM_MEDICO INT REFERENCES MEDICO(CRM)
);

INSERT INTO CONSULTA(DATA_,HORARIO,CPF_PACIENTE,CRM_MEDICO)
VALUES ('2024-11-05', '15:30',1,2),('2024-11-11', '17:30',2,3),('2024-11-02', '13:30',3,1);

SELECT * FROM CONSULTA;

