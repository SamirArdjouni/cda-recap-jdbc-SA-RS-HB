package cda.Dao;

import java.util.List;

import cda.menu.model.Pieces;

public interface EnregistrerVenteDAO {

	List<Pieces> afficherPiecesVendues(String reference);

	void enregistrerUneVente(int reference, float prixUnitaire, int quantite);

	void modifierDateVente(String ancienneDate, String nouvelleDate);

}
