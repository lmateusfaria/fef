
CREATE TABLE quartos(
	numero_quarto INTEGER PRIMARY KEY,
	andar_quarto INTEGER,
	qtd_leito_quarto INTEGER
);


CREATE TABLE clientes(
	rg_cliente varchar(15) PRIMARY KEY,
	nome_cliente varchar(50),
	telefone_cliente varchar(15),
	endereco_cliente varchar(100)
);

CREATE TABLE hospedagens(
	cod_hospedagem INTEGER PRIMARY KEY,
	consumo_hospedagem FLOAT,
	data_hospedagem date,
	fk_rg_cliente varchar(50) REFERENCES clientes(rg_cliente),
	fk_numero_quarto INTEGER REFERENCES quartos(numero_quarto)
);

INSERT INTO quartos (numero_quarto,andar_quarto,qtd_leito_quarto)
VALUES (101,1,2);


INSERT INTO clientes (rg_cliente,nome_cliente,telefone_cliente,endereco_cliente)
VALUES ('45.323.659-1','17988326219','Fulano de Tal','Rua do Nada nº1, Bairro 1,');


INSERT INTO hospedagens (cod_hospedagem,consumo_hospedagem,data_hospedagem,fk_rg_cliente,fk_numero_quarto)
VALUES (222,250.5,'2023-09-05','45.323.659-1',101);
