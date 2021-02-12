
CREATE TABLE marque(
   Id_marque int auto_increment not null,
   nom VARCHAR(50),
   PRIMARY KEY(Id_marque)
);

CREATE TABLE categorie(
   Id_categorie int auto_increment not null,
   libelle VARCHAR(50),
   PRIMARY KEY(Id_categorie)
);

CREATE TABLE piece(
   Id_piece int auto_increment not null,
   reference VARCHAR(20),
   dateRecup DATE,
   prixUnitaire INT,
   quantite int,
   dateVente VARCHAR(50),
   Id_categorie INT NOT NULL,
   PRIMARY KEY(Id_piece),
   FOREIGN KEY(Id_categorie) REFERENCES categorie(Id_categorie)
);

CREATE TABLE modele(
   Id_vehicule int auto_increment not null,
   modele VARCHAR(50),
   annee DATE,
   Id_marque INT NOT NULL,
   PRIMARY KEY(Id_vehicule),
   FOREIGN KEY(Id_marque) REFERENCES marque(Id_marque)
);

CREATE TABLE correspondre(
   Id_piece INT,
   Id_vehicule INT,
   PRIMARY KEY(Id_piece, Id_vehicule),
   FOREIGN KEY(Id_piece) REFERENCES piece(Id_piece),
   FOREIGN KEY(Id_vehicule) REFERENCES modele(Id_vehicule)
);



