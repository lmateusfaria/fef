CREATE TABLE alunos (
	ra_aluno INTEGER PRIMARY KEY,
	nome_aluno varchar(30)
);


CREATE TABLE telefones(
	cod_telefone INTEGER PRIMARY KEY,
	numero_telefone varchar(16),
	fk_ra_aluno INTEGER REFERENCES alunos(ra_aluno)
);


CREATE TABLE professores(
	cod_professor INTEGER PRIMARY KEY,
	nome_professor varchar(40),
	telefone_professor varchar(15)
);


CREATE TABLE disciplinas(
	cod_disciplina INTEGER PRIMARY KEY,
	creditos_desciplina INTEGER,
	descricao_desciplina VARCHAR(100),
	fk_cod_professor INTEGER REFERENCES professores(cod_professor)
);


CREATE TABLE alunos_disciplinas(
	cod_aluno_disciplina INTEGER PRIMARY KEY,
	fk_ra_aluno INTEGER REFERENCES alunos(ra_aluno),
	fk_cod_disciplina INTEGER REFERENCES disciplinas(cod_disciplina)
);

INSERT INTO alunos (ra_aluno,nome_aluno) VALUES (123,'Luis Mateus');

INSERT INTO telefones (cod_telefone,numero_telefone,fk_ra_aluno) VALUES (1,'(17)98832-6219',123);

INSERT INTO professores (cod_professor,nome_professor,telefone_professor) VALUES (22,'Ms. Faz de Conta','(69)10231-3654');

INSERT INTO disciplinas (cod_disciplina,creditos_desciplina,descricao_desciplina,fk_cod_professor)
VALUES (2,5,'Especialização',22);

INSERT INTO alunos_disciplinas (cod_aluno_disciplina,fk_ra_aluno,fk_cod_disciplina)
VALUES (1,123,2);

