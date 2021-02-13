package cda.menu.model;

public class Pieces {

	private int reference;
	private float prixUnitaire;
	private int quantite;
	private int idVehicule;
	private String referenceString;

	public Pieces(String referenceString, float prixUnitaire, int quantite) {
		this.referenceString = referenceString;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public int getReference() {
		return reference;
	}

	public int getQuantite() {
		return quantite;
	}

	public int getIdVehicule() {
		return idVehicule;
	}

	public String getReferenceString() {
		return referenceString;
	}

}
