package cda.menu.action;

import java.util.List;

import cda.menu.model.StockPieceModel;

public class StockPieces extends Action {

	private static final int ID = 5;
	private static final String DESC = "Pieces et somme totale des prix pièces disponible par modele";

	public StockPieces() {
		super(ID, DESC);
	}

	@Override
	public boolean executer() {

		List<StockPieceModel> stockPiece = this.stockPiecesDAO.affichageStockPiecesParModele();
		if (stockPiece.isEmpty()) {

			System.out.println("  > aucun véhicule n'est dans la BDD !");
		} else {
			stockPiece.stream().forEach(e -> {
				System.out.println("  > " + e.toString());
			});
		}
		return Boolean.TRUE;
	}
}