package cda.menu.model;

public class StockPieceModel {

	private String modele; 
	private String totalPiecesDispo; 
	private String SommeTotalePrixPiecesDispoParModele;
	
	public StockPieceModel(String modele, String totalPiecesDispo, String sommeTotalePrixPiecesDispoParModele) {
		this.modele = modele;
		this.totalPiecesDispo = totalPiecesDispo;
		SommeTotalePrixPiecesDispoParModele = sommeTotalePrixPiecesDispoParModele;
	}

	@Override
	public String toString() {
		return "StockPieceModel [\t modele=" + modele + "\t totalPiecesDispo=" + totalPiecesDispo
				+ "\t SommeTotalePrixPiecesDispoParModele=" + SommeTotalePrixPiecesDispoParModele + "\t]";
	}
}
