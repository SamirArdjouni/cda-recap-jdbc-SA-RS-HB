package cda.Dao;

import java.util.List;

import cda.menu.model.Pieces;

public interface CrudPiecesDAO {

	Pieces AjouterPi�ce(Pieces piece);

	List<Pieces> ConsulterPieces();

	boolean ModifierPiece(Pieces piece);

	boolean SupprimerPiece(String idPieces);
}
