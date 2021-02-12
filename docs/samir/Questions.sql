a revoir : 

2 -> insert quantité( if null, etc..);



select IdPieces, reference, categorie from pieces;  /* q1*/
select IdPieces, immat, idVehicule from pieces natural join vehiculeRecup natural join vehicule; /* q2 */
select idVehicule, marque, modele from vehicule;   /* q3 */
select IdPieces, IdVente, dateVente from pieces natural join vente; /* q4 */

select count(*) as nbPieceDispo, sum(quantite) as totalPieceDispo from pieces 
natural join vehicules group by idVehiculeConvient;  /* q5 */