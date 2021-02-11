package cda.Dao;

import cda.menu.model.Pieces;

public interface CrudCategoriePieceDAO {

	Pieces CreerCategorie(Pieces piece);

	void ConsulterCategorie();
	
	void ModifierCategorie();
	
	void SupprimerCategorie();
	
	}
