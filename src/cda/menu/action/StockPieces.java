package cda.menu.action;

public class StockPieces extends Action {

	private static final int ID = 5;
	private static final String DESC = "Pieces et somme totale des prix pièces disponible par modele";

	public StockPieces() {
		super(ID, DESC);
	}

	@Override
	public boolean executer() {

		String[] tab = this.stockPiecesDAO.affichageStockPiecesParModele();
		for (int i = 0; i < tab.length; i++) {
			System.out.println("modele: " + tab[i] 
					+ "\t  totalPiecesDispo: " + tab[i]
					+ "\t  SommeTotalePrixPiecesDispoParModele: " + tab[i]);
		}

		return Boolean.TRUE;
	}
}