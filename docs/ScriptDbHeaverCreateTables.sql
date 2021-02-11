CREATE TABLE catalogueVehicules(
   idCatalogue INT auto_increment not null,
   marque VARCHAR(50),
   modele VARCHAR(50),
   annee DATE,
   PRIMARY KEY(idCatalogue)
);

INSERT INTO catalogueVehicules (marque,modele,annee) VALUES ('renault', 'megane', '01.05.2015');
INSERT INTO catalogueVehicules (marque,modele,annee) VALUES ('renault', 'scenic', '01.07.2018');
INSERT INTO catalogueVehicules (marque,modele,annee) VALUES ('peugeot', '208', '01.05.2019');
INSERT INTO catalogueVehicules (marque,modele,annee) VALUES ('renault', 'clio', '01.05.20133');
INSERT INTO catalogueVehicules (marque,modele,annee) VALUES ('bmw', '318', '01.07.2020');
INSERT INTO catalogueVehicules (marque,modele,annee) VALUES ('bmw', 'megane', '01.02.2015');

select * from catalogueVehicules;





CREATE TABLE vehicule(
   idVehicule INT auto_increment not null,
   immat VARCHAR(50),
   idCatalogue INT NOT NULL,
   PRIMARY KEY(idVehicule),
   FOREIGN KEY(idCatalogue) REFERENCES catalogueVehicules(idCatalogue)
);

INSERT INTO vehicule (immat,idCatalogue) VALUES ('DT-244-LT', 5);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('PR-504-NT', 5);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('QA-103-IR', 5);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('CS-945-VC', 2);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('GT-812-XC', 2);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('VC-401-ML', 5);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('NR-002-IJ', 4);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('FG-523-TC', 1);

select * from vehicule;




CREATE TABLE PIECES(
   IdPieces INT auto_increment not null,
   reference VARCHAR(50),
   categorie VARCHAR(50),
   dateRecup DATE,
   prixUnitaire INT,
   quantite INT,
   idVehicule INT NOT NULL,
   PRIMARY KEY(IdPieces),
   FOREIGN KEY(idVehicule) REFERENCES vehicule(idVehicule)
);

INSERT INTO PIECES (reference, categorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('parechoc_avant-B7200','carosserie', 5/1/2021, 128, 20, 1);
INSERT INTO PIECES (reference, categorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('embrayage','mécanique', 5/1/2021, 300, 10, 3);
INSERT INTO PIECES (reference, categorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('batterie-18W','electricité', 5/1/2021, 78, 10, 4);
INSERT INTO PIECES (reference, categorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Lampe-B4', 'electricité',  5/1/2021, 35, 11, 1);
INSERT INTO PIECES (reference, categorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Auto-radio','electricité', 5/1/2021, 128, 20, 6);
INSERT INTO PIECES (reference, categorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Suspension-H15C','mécanique', 5/1/2021, 125, 7, 7);
INSERT INTO PIECES (reference, categorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Moteur-VW-15L','mécanique', 5/1/2021, 650, 5, 4);
INSERT INTO PIECES (reference, categorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Radiateur-Strong-2000','mécanique', 5/1/2021, 250, 8, 1);
INSERT INTO PIECES (reference, categorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Reservoir-HDBlue','mécanique', 5/1/2021, 210, 13, 3);
INSERT INTO PIECES (reference, categorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Plaquette de freins-HCBV','mécanique', 5/1/2021, 120, 21, 2);
INSERT INTO PIECES (reference, categorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Courroie-TD720','mécanique', 5/1/2021, 350, 4, 7);

select * from pieces;






CREATE TABLE vente(
   IdVente INT auto_increment not null,
   quantite INT,
   dateVente DATE,
   IdPieces INT,
   PRIMARY KEY(IdVente),
   FOREIGN KEY(IdPieces) REFERENCES PIECES(IdPieces)
);

insert into vente (quantite, dateVente, IdPieces) values (7,11/02/2021,1);
insert into vente (quantite, dateVente, IdPieces) values (2,11/02/2021,2);
insert into vente (quantite, dateVente, IdPieces) values (4,11/02/2021,3);
insert into vente (quantite, dateVente, IdPieces) values (2,11/02/2021,4);
insert into vente (quantite, dateVente, IdPieces) values (5,11/02/2021,5);

select * from vente;






select IdPieces, reference, categorie from pieces;  /* q1*/
select IdPieces, immat, idVehicule from pieces natural join vehiculeRecup natural join vehicule; /* q2 */
select idVehicule, marque, modele from vehicule;   /* q3 */
select IdPieces, IdVente, dateVente from pieces natural join vente; /* q4 */

select count(*) as nbPieceDispo, sum(quantite) as totalPieceDispo from pieces 
natural join vehicules group by idVehiculeConvient;  /* q5 */









