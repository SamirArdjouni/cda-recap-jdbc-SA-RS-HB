package cda.Dao;

import java.util.List;

import cda.menu.model.Vente;

public interface EnregistrerVenteDAO {
	


	List<Vente> enregistrerUneVente(String date, int piece, int quantite);

}
