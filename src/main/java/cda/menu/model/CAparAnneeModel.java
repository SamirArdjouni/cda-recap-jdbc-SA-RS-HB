package cda.menu.model;

public class CAparAnneeModel {

	private String annee;
	private String chiffreDaffaire;
	
	public CAparAnneeModel(String annee, String chiffreDaffaire) {
		this.annee = annee;
		this.chiffreDaffaire = chiffreDaffaire;
	}

	@Override
	public String toString() {
		return "CAparAnneeModel [annee=" + annee + ", chiffreDaffaire=" + chiffreDaffaire + "]";
	}
}
