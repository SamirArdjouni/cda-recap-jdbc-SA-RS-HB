package cda.menu.model;

public class Categorie {

	private int idCategorie;
	private String libelle;
	private String newLib;
	
	
	public Categorie(String libelle) {
		this.libelle = libelle;
	}
	
	public Categorie(int idCategorie, String libelle) {
		this.idCategorie = idCategorie;
		this.libelle = libelle;
	}
	
	public Categorie(String libelle, String newLib) {
		this.libelle = libelle;
		this.newLib = newLib;
	}
	

	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getLibelle() {
		return libelle;
	}

	public Categorie setLibelle(String libelle) {
		this.libelle = libelle;
		return this;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", libelle=" + libelle + "]";
	}

	public String getNewLib() {
		return newLib;
	}

	public void setNewLib(String newLib) {
		this.newLib = newLib;
	}

}
