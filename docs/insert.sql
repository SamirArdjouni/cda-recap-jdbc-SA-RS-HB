INSERT INTO catalogueVehicules (marque,modele,annee) VALUES ('renault', 'megane', '2018-11-12');
INSERT INTO catalogueVehicules (marque,modele,annee) VALUES ('renault', 'scenic', '2019-10-02');
INSERT INTO catalogueVehicules (marque,modele,annee) VALUES ('peugeot', '208', '2020-12-30');
INSERT INTO catalogueVehicules (marque,modele,annee) VALUES ('renault', 'clio', '2019-02-21');
INSERT INTO catalogueVehicules (marque,modele,annee) VALUES ('bmw', '318', '2021-12-12');
INSERT INTO catalogueVehicules (marque,modele,annee) VALUES ('bmw', 'megane', '2017-04-22');

INSERT INTO vehicule (immat,idCatalogue) VALUES ('DT-244-LT', 5);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('PR-504-NT', 5);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('QA-103-IR', 5);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('CS-945-VC', 2);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('GT-812-XC', 2);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('VC-401-ML', 5);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('NR-002-IJ', 4);
INSERT INTO vehicule (immat,idCatalogue) VALUES ('FG-523-TC', 1);

insert into categorie (libelle) values ('carosserie');
insert into categorie (libelle) values ('mecanique');
insert into categorie (libelle) values ('electricité');

INSERT INTO PIECES (reference, idCategorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('parechoc_avant-B7200', 1, '2019-12-12', 128, 20, 1);
INSERT INTO PIECES (reference, idCategorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('embrayage', 2, '2017-12-09', 300, 10, 3);
INSERT INTO PIECES (reference, idCategorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('batterie-18W', 3, '2019-12-10', 78, 10, 4);
INSERT INTO PIECES (reference, idCategorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Lampe-B4',  3, '2018-10-21', 35, 11, 1);
INSERT INTO PIECES (reference, idCategorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Auto-radio', 3, '2020-06-23', 128, 20, 6);
INSERT INTO PIECES (reference, idCategorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Suspension-H15C', 2, '2021/08/04', 125, 7, 7);
INSERT INTO PIECES (reference, idCategorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Moteur-VW-15L', 2, '2017/11/09', 650, 5, 4);
INSERT INTO PIECES (reference, idCategorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Radiateur-Strong-2000', 2, '2019/01/06', 250, 8, 1);
INSERT INTO PIECES (reference, idCategorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Reservoir-HDBlue', 2, '2016/03/07', 210, 13, 3);
INSERT INTO PIECES (reference, idCategorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Plaquette de freins-HCBV', 2, '2017/04/06', 120, 21, 2);
INSERT INTO PIECES (reference, idCategorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES ('Courroie-TD720', 2, '2020/12/03', 350, 4, 7);


insert into vente (quantite, dateVente, IdPieces) values (7,'2020/12/03',1);
insert into vente (quantite, dateVente, IdPieces) values (2,'2020/12/03',2);
insert into vente (quantite, dateVente, IdPieces) values (4,'2020/12/03',3);
insert into vente (quantite, dateVente, IdPieces) values (2,'2020/12/03',4);
insert into vente (quantite, dateVente, IdPieces) values (5,'2020/12/03',5);

