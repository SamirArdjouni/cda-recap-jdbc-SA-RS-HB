CREATE TABLE piece(
   Id_piece int auto_increment not null,
   reference VARCHAR(20),
   categorie VARCHAR(50),
   dateRecup DATE,
   dateVente DATE,
   prixVente INT,
   PRIMARY KEY(Id_piece)
);


CREATE TABLE vehicule(
   Id_vehicule int auto_increment not null,
   marque VARCHAR(50),
   modele VARCHAR(50),
   annee DATE,
   Id_piece int NOT null,
   PRIMARY KEY(Id_vehicule),
   FOREIGN KEY(Id_piece) REFERENCES piece(Id_piece)
);


CREATE TABLE correspondre(
   Id_piece INT,
   Id_vehicule INT,
   PRIMARY KEY(Id_piece, Id_vehicule),
   FOREIGN KEY(Id_piece) REFERENCES piece(Id_piece),
   FOREIGN KEY(Id_vehicule) REFERENCES vehicule(Id_vehicule)
);

select * from vehicule;

select * from piece;

