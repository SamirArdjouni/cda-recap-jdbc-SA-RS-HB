package cda.menu.model;

import java.sql.Date;

public class Pieces {

	private int idPiece;
	private String reference;
	private String categorie;
	private Date dateRecup;
	private Date dateVente;
	private float prixVente;
	private int quantite;
	private int idVehicule;
	
	public Pieces(String reference, String categorie, Date dateRecup, Date dateVente, float prixVente, int quantite, int idVehicule) {
			
		this.reference = reference;
		this.categorie = categorie;
		this.dateRecup = dateRecup;
		this.dateVente = dateVente;
		this.prixVente = prixVente;
		this.quantite = quantite;
		this.idVehicule = idVehicule;
	}

	public int getIdPiece() {
		return idPiece;
	}

	public void setIdPiece(int idPiece) {
		this.idPiece = idPiece;
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

	public Date getDateVente() {
		return dateVente;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}

	public float getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(float prixVente) {
		this.prixVente = prixVente;
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
		return "Pieces [idPiece=" + idPiece + ", reference=" + reference + ", categorie=" + categorie + ", dateRecup="
				+ dateRecup + ", dateVente=" + dateVente + ", prixVente=" + prixVente + ", quantite=" + quantite
				+ ", idVehicule=" + idVehicule + "]";
	}


}
