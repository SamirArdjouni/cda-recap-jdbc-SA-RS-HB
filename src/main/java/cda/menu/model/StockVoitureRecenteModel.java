package cda.menu.model;  // sam

public class StockVoitureRecenteModel {
	
	private String modele; 
	private String annee; 
	private String quantite;
	private String marque;
	private String immat;
	
	
	
	public StockVoitureRecenteModel(String modele, String annee, String quantite, String marque, String immat) {
		this.modele = modele;
		this.annee = annee;
		this.quantite = quantite;
		this.marque = marque;
		this.immat = immat;
	}



	@Override
	public String toString() {
//		return "Le modele est: " + modele + "\t annee:" + annee + "\t quantite:" + quantite	+ "\t marque:" + marque + "\t immat:" + immat ;
		return "marque: " + marque + " \tLe modele est: " + modele + "\t annee:" + annee  ;
	}
	
	

}
