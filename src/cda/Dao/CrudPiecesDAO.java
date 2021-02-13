package cda.Dao;

import java.util.List;

import cda.menu.model.Pieces2;

public interface CrudPiecesDAO {

	Pieces2 AjouterPièce(Pieces2 piece);

	List<Pieces2> ConsulterPieces();

	boolean ModifierPiece(Pieces2 piece);

	boolean SupprimerPiece(String idPieces);
}
