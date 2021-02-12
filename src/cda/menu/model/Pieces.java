package cda.menu.model;

import java.util.Date;

public class Pieces {

	private int idPieces;
	private int reference;
	private String referenceString;
	private String categorie;
	private Date dateRecup;
	private int quantite;
	private float prixUnitaire;
	


	public Pieces(int idPieces, int reference, String categorie, Date dateRecup, int quantite) {
		
		this.idPieces = idPieces;
		this.reference = reference;
		this.categorie = categorie;
		this.dateRecup = dateRecup;
		this.quantite = quantite;
		
	}

	public Pieces(String referenceString, float prixUnitaire, int quantite) {
		this.referenceString = referenceString;
		this.prixUnitaire =prixUnitaire;
		this.quantite = quantite;
	}



	public int getIdPieces() {
		return idPieces;
	}

	public void setIdPieces(int idPieces) {
		this.idPieces = idPieces;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public Date getDateRecup() {
		return dateRecup;
	}

	public void setDateRecup(Date dateRecup) {
		this.dateRecup = dateRecup;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Pieces [idPieces=" + idPieces + ", reference=" + reference + ", categorie=" + categorie + ", dateRecup="
				+ dateRecup + ", quantite=" + quantite + "]";
	}
	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	
}
