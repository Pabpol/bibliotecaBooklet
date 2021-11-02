CREATE DATABASE biblioteca_booklet;
use biblioteca_booklet;

create table libro (
id INT,
titulo VARCHAR(100),
anio INT,
autor VARCHAR(100),
imprenta VARCHAR(100),
disponible BOOLEAN,
CONSTRAINT pk_libro PRIMARY KEY (id)

);

select * from libro where titulo = "el señor de los anillos"