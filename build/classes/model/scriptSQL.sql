CREATE DATABASE obrasMuseo; 

USE obrasMuseo;

CREATE TABLE autor(
id INT AUTO_INCREMENT,
nombre VARCHAR (30),
apellido VARCHAR (30),
rut VARCHAR (30),
nacionalidad VARCHAR (30),
PRIMARY KEY(id)
);



CREATE TABLE encargadoDeSala(
id INT AUTO_INCREMENT,
nombre VARCHAR (30),
rut VARCHAR (30),
profesion VARCHAR (30),
anioDeIngresoAlMuseo INT,
PRIMARY KEY(id)
);


CREATE TABLE sala(
id INT AUTO_INCREMENT,
nombre VARCHAR (30),
cantidadDeLamparasInstaladas INT,
temperaturaDeSala INT,
tieneCierreCentralizado BOOLEAN,
tieneAlaramaContraIncendio BOOLEAN,
encargadoDeSala_fk INT,
FOREIGN KEY (encargadoDeSala_fk) REFERENCES encargadoDeSala (id),
PRIMARY KEY(id)
);


CREATE TABLE tecnica(
id INT AUTO_INCREMENT,
nombreTecnica VARCHAR (30),
PRIMARY KEY(id)
);





CREATE TABLE genero(
id INT AUTO_INCREMENT,
nombreGenero VARCHAR (30),
PRIMARY KEY(id)
);

CREATE TABLE tamanio(
id INT AUTO_INCREMENT,
ancho INT,
alto INT,
PRIMARY KEY(id)
);




CREATE TABLE obra(
id INT AUTO_INCREMENT,
autor_fk INT,
tecnica_fk INT,
genero_fk INT,
anioDeCreacion INT,
nombreDePintura VARCHAR (30),
tamanio_fk INT,
ubicacion INT,
FOREIGN KEY (autor_fk) REFERENCES autor (id),
FOREIGN KEY (tecnica_fk) REFERENCES tecnica (id),
FOREIGN KEY (genero_fk) REFERENCES genero (id),
FOREIGN KEY (tamanio_fk) REFERENCES tamanio (id),
PRIMARY KEY(id)
);


INSERT INTO tecnica VALUES (NULL, 'Acuarela');
INSERT INTO tecnica VALUES (NULL, 'Oleo');
INSERT INTO tecnica VALUES (NULL, 'Fresco');
INSERT INTO tecnica VALUES (NULL, 'Temple');
INSERT INTO tecnica VALUES (NULL, 'Puntillismo');

INSERT INTO genero VALUES (NULL,'Retrato');
INSERT INTO genero VALUES (NULL,'Desnudo');
INSERT INTO genero VALUES (NULL,'Naturaleza Muerta');
INSERT INTO genero VALUES (NULL,'Pintura Paisajista');
INSERT INTO genero VALUES (NULL,'Pintura Historica');

INSERT INTO encargadoDeSala VALUES(NULL,'Geronimo','20898088-3','Guardia',2000);
INSERT INTO encargadoDeSala VALUES(NULL,'Veronica','20558088-3','Doctora',2001);
INSERT INTO encargadoDeSala VALUES(NULL,'Julio','20898066-1','Tesorero',2016);


INSERT INTO sala VALUES (NULL, 'El Aque',3,21,TRUE,TRUE,1);
INSERT INTO sala VALUES (NULL, 'El Infierno',5,22,FALSE,TRUE,2);
INSERT INTO sala VALUES (NULL, 'Septimo Cielo',4,19,TRUE,FALSE,3);



INSERT INTO autor VALUES (NULL,'Giorgio', 'Picasso', '30555066-1', 'Italiano');
INSERT INTO autor VALUES (NULL,'Alejandro', 'Magno', '20555022-1', 'Griego');
INSERT INTO autor VALUES (NULL,'Andre', 'Bonaparte', '20555011-1', 'Frances');

INSERT INTO tamanio VALUES (NULL,20,30);
INSERT INTO tamanio VALUES (NULL,25,35);
INSERT INTO tamanio VALUES (NULL,15,40);
INSERT INTO tamanio VALUES (NULL,50,60);

INSERT INTO obra VALUES (NULL,1,1,5,1650,'El suplicio',1,1);
INSERT INTO obra VALUES (NULL,1,2,3,1640,'La tragedia',2,1);
INSERT INTO obra VALUES (NULL,2,1,4,1750,'Conquista',3,2);
INSERT INTO obra VALUES (NULL,3,4,4,1751,'Divinidad',4,3);




-- DROP DATABASE obrasMuseo;