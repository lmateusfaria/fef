
CREATE TABLE estado(
    idestado SERIAL PRIMARY KEY,
    nomeestado VARCHAR(100) NOT NULL,
    siglaestado VARCHAR(2) NOT NULL
);


INSERT INTO estado(nome_estado,sigla_estado)
VALUES('São Paulo', 'SP'),('Rio de Janeiro','RJ';

select * from estado;

create table cidade (
	idcidade serial primary key,
	nomecidade varchar(100) not null,
	situacao varchar(1) not null,
	idestado int not null,
	constraint fk_estado foreign key (idestado) references estado(idestado)
);

insert into cidade (nomecidade,situacao,idestado)
values ('Fernandopolis','A',1),('Jales','A',1),('Votuporanga','A',1);

SELECT * FROM CIDADE;