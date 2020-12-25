DROP TABLE IF EXISTS livros;

CREATE TABLE livros (

id INTEGER PRIMARY KEY AUTO_INCREMENT,
   titulo VARCHAR(50) NOT NULL,
   descricao VARCHAR(1000),
   referencia VARCHAR(1000) NOT NULL,
   cadastro DATE NOT NULL

);

INSERT INTO livros(titulo, descricao, referencia, cadastro)
VALUES ('PS. EU TE AMO', 'filme de romance', 'Romance', CURRENT_DATE());
