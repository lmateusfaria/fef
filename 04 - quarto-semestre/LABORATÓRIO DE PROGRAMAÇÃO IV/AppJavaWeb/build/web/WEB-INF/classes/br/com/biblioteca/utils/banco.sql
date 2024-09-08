CREATE TABLE autor(
	id_autor SERIAL PRIMARY KEY,
	nome varchar(100)
);

CREATE TABLE editora(
	id_editora SERIAL PRIMARY KEY,
	nome_editora varchar(100) unique
);

CREATE TABLE livro(
	id_livro SERIAL PRIMARY KEY,
	titulo varchar(100),
	isbn varchar(100) unique,
	numero_paginas varchar(10),
	tipo_capa varchar(50),
	fk_id_editora integer REFERENCES editora(id_editora),
	fk_id_autor integer REFERENCES autor(id_autor)
);

