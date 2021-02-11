CREATE TABLE catalogueVehicules(
   idCatalogue INT auto_increment not null,
   marque VARCHAR(50),
   modele VARCHAR(50),
   annee DATE,
   PRIMARY KEY(idCatalogue)
);

CREATE TABLE vehicule(
   idVehicule INT auto_increment not null,
   immat VARCHAR(50),
   idCatalogue INT NOT NULL,
   PRIMARY KEY(idVehicule),
   FOREIGN KEY(idCatalogue) REFERENCES catalogueVehicules(idCatalogue)
);

CREATE TABLE categorie(
   idCategorie INT  auto_increment not null,
   libelle VARCHAR(50) NOT NULL,
   PRIMARY KEY(idCategorie),
   UNIQUE(libelle)
);

CREATE TABLE PIECES(
   IdPieces INT auto_increment not null,
   reference VARCHAR(50),
   idCategorie INT,
   dateRecup DATE,
   prixUnitaire INT,
   quantite INT,
   idVehicule INT NOT NULL,
   PRIMARY KEY(IdPieces),
   FOREIGN KEY(idVehicule) REFERENCES vehicule(idVehicule),
   FOREIGN KEY(idCategorie) REFERENCES categorie(idCategorie)
);

CREATE TABLE vente(
   IdVente INT auto_increment not null,
   quantite INT,
   dateVente DATE,
   IdPieces INT,
   PRIMARY KEY(IdVente),
   FOREIGN KEY(IdPieces) REFERENCES PIECES(IdPieces)
);

insert into categorie (libelle) values ('ok');

select * from catalogueVehicules;
select * from vehicule;
select * from pieces;
select * from vente;
select * from categorie ;

