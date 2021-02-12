package cda.Dao;

import java.util.List;

import cda.menu.model.Categorie;

public interface CrudCategoriePieceDAO {

	Categorie CreerCategorie(Categorie categorie);

	List<Categorie> ConsulterCategorie();

	boolean ModifierCategorie(Categorie categorie);

	boolean SupprimerCategorie(String libelle);

}
