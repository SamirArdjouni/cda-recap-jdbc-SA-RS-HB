CREATE TABLE catalogueVehicules(
   idCatalogue INT auto_increment not null,
   marque VARCHAR(50),
   modele VARCHAR(50),
   annee DATE,
   PRIMARY KEY(idCatalogue)
);

UPDATE catalogueVehicules SET marque='bmw',annee='2021/08/04', modele='serie 5' where modele = 'serie 5';
DELETE FROM CatalogueVehicules WHERE modele='samir';
insert into CatalogueVehicules (marque, annee, modele) values ('bmw','2018-05-12','serie 5');

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

/*- sortir un tableau listant le nombre et la somme totale des prix pièces disponibles
 (pas encore vendues)  par modèle de véhicule*/

 /*sortir un tableau listant le nombre et la somme totale des des prix pièces disponibles(pas encore vendues)
par modèle de véhicule ---> - sortir un tableau listant le nombre et la somme totale du prix des pièces
 disponibles(pas encore vendues)  par modèle de véhicule.*/

select modele,sum(quantite) as totalPiecesDispo,
	sum(quantite*prixUnitaire) as SommeTotalePrixPiecesDispoParModele from pieces 
	natural join vehicule  
	natural join catalogueVehicules
	group by modele;

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

