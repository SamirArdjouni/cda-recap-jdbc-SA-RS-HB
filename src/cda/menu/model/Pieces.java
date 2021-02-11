package cda.menu.model;

import java.sql.Date;

public class Pieces {

	private int idPieces;
	private String reference;
	private String categorie;
	private Date dateRecup;
	private float prixUnitaire;
	private int quantite;
	private int idVehicule;
	
	public Pieces(int idPieces, String reference, String categorie, Date dateRecup, float prixUnitaire, int quantite,
			int idVehicule) {
		super();
		this.idPieces = idPieces;
		this.reference = reference;
		this.categorie = categorie;
		this.dateRecup = dateRecup;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
		this.idVehicule = idVehicule;
	}

	public int getIdPieces() {
		return idPieces;
	}

	public void setIdPieces(int idPieces) {
		this.idPieces = idPieces;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
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

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getIdVehicule() {
		return idVehicule;
	}

	public void setIdVehicule(int idVehicule) {
		this.idVehicule = idVehicule;
	}

	@Override
	public String toString() {
		return "Pieces [idPieces=" + idPieces + ", reference=" + reference + ", categorie=" + categorie + ", dateRecup="
				+ dateRecup + ", prixUnitaire=" + prixUnitaire + ", quantite=" + quantite + ", idVehicule=" + idVehicule
				+ "]";
	}
	





}
