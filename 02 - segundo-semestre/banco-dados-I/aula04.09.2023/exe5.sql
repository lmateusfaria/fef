CREATE TABLE caminhoes(
	codigo_caminhao INTEGER PRIMARY KEY,
	marca_caminhao varchar(50),
	modelo_caminhao varchar(50),
	ano_caminhao INTEGER
);


CREATE TABLE motoristas (
	rg_motorista varchar(11) PRIMARY KEY,
	nome_motorista varchar(50),
	idade_motorista INTEGER,
	endereco_motorista varchar(100)
);

CREATE TABLE produtos (
	cod_barras_produto INTEGER PRIMARY KEY,
	nome_produto varchar(80),
	marca_produto varchar(80),
	fabricante_produto varchar(80)
	
);

CREATE TABLE motoristas_caminhoes(
	cod_motorista_caminhao INTEGER PRIMARY KEY,
	data_viagem date,
	fk_rg_motorista varchar(11) REFERENCES motoristas(rg_motorista),
	fk_codigo_caminhao INTEGER REFERENCES caminhoes(codigo_caminhao)
);

CREATE TABLE produtos_caminhoes(
	cod_produto_caminhao INTEGER PRIMARY KEY,
	data_entrega date,
	fk_cod_barras_produto INTEGER REFERENCES produtos(cod_barras_produto),
	fk_codigo_caminhao INTEGER REFERENCES caminhoes(codigo_caminhao)
);

INSERT INTO caminhoes (codigo_caminhao,marca_caminhao,modelo_caminhao,ano_caminhao)
VALUES (171,'Scania','Bicudin',2023);

INSERT INTO motoristas (rg_motorista,nome_motorista,idade_motorista,endereco_motorista)
VALUES ('11122233344','Fulano de Tal',45,'Rua do Fulano de Tal');

INSERT INTO produtos (cod_barras_produto,nome_produto,marca_produto,fabricante_produto)
VALUES (1001023546,'Oléo de CBD','Lombrados','4i20 LTDA');


INSERT INTO motoristas_caminhoes (cod_motorista_caminhao,data_viagem,fk_rg_motorista,fk_codigo_caminhao)
VALUES (13,'2023-09-05','11122233344',171);


INSERT INTO produtos_caminhoes (cod_produto_caminhao,data_entrega,fk_cod_barras_produto,fk_codigo_caminhao)
VALUES (13,'2023-09-07',1001023546,171);
