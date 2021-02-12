package cda.menu.model;

import java.util.Date;

public class Pieces {

	private int idPieces;
	private String reference;
	private String categorie;
	private Date dateRecup;
	private int quantite;
	
	public Pieces(int idPieces, String reference, String categorie, Date dateRecup, int quantite) {
		
		this.idPieces = idPieces;
		this.reference = reference;
		this.categorie = categorie;
		this.dateRecup = dateRecup;
		this.quantite = quantite;
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
	
}
