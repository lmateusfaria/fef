CREATE TABLE soldado(
rm integer primary key,/*chave primaria*/
nome varchar(50),
data_nascimento date
);

CREATE TABLE armas(
serie integer,
calibre integer,
registo integer,
rm_soldado integer,

CONSTRAINT pk_armas PRIMARY KEY(serie),
CONSTRAINT fk_soldado FOREIGN KEY(rm_soldado) REFERENCES soldado(rm)
);

CREATE TABLE soldado_limpa_armas(
id_soldado_limpa_armas INTEGER,
rm_soldado INTEGER REFERENCES soldado(rm),
serie_arma INTEGER REFERENCES armas(serie)
);

INSERT INTO soldado(rm,nome,data_nascimento) VALUES (3,'Tchê','2005-05-01');

SELECT * FROM soldado;

INSERT INTO armas(serie,calibre,registo,rm_soldado) VALUES (13,32,1001,1);

INSERT INTO armas(serie,calibre,registo,rm_soldado) VALUES (22,40,1022,3);

INSERT INTO armas(serie,calibre,registo,rm_soldado) VALUES (55,38,1055,2);

SELECT * FROM armas;

INSERT INTO soldado_limpa_armas(id_soldado_limpa_armas,rm_soldado,serie_arma) VALUES (1,1,13);

INSERT INTO soldado_limpa_armas(id_soldado_limpa_armas,rm_soldado,serie_arma) VALUES (2,3,22);

INSERT INTO soldado_limpa_armas(id_soldado_limpa_armas,rm_soldado,serie_arma) VALUES (3,2,55);

SELECT * FROM soldado_limpa_armas;
