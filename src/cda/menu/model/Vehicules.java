package cda.menu.model;

public class Vehicules{

	private int idVehicule;
	private String marque;
	private String modele;
	private int annee;
	private int idPieces;
	
	public Vehicules(String marque, String modele, int annee, int idPieces) {
		
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.idPieces = idPieces;
	}

	public int getIdVehicule() {
		return idVehicule;
	}

	public void setIdVehicule(int idVehicule) {
		this.idVehicule = idVehicule;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getIdPieces() {
		return idPieces;
	}

	public void setIdPieces(int idPieces) {
		this.idPieces = idPieces;
	}

	@Override
	public String toString() {
		return "Vehicules [idVehicule=" + idVehicule + ", marque=" + marque + ", modele=" + modele + ", annee=" + annee
				+ ", idPieces=" + idPieces + "]";
	}
}
