package cda.menu.model;

public class Pieces {

	private int idPieces;
	private int reference;
	private String referenceString;
	private String categorie;
	private String dateRecup;
	private int prixUnitaire;
	private int quantite;
	private float prixUnitaire;
	private int idVehicule;
	private String newreference;
	private String newcategorie;
	private int newprixUnitaire;
	private int newquantite;
	private int newidVehicule;



	public Pieces(String newreference, String newcategorie, int newprixUnitaire, int newquantite, int newidVehicule, int idPieces) {
		this.newreference = newreference;
		this.newcategorie = newcategorie;
		this.newprixUnitaire = newprixUnitaire;
		this.newquantite = newquantite;
		this.newidVehicule = newidVehicule;
		this.idPieces = idPieces;
	}

	public Pieces(String reference, String categorie, String dateRecup, int prixUnitaire, int quantite,
			int idVehicule) {
		this.reference = reference;
		this.categorie = categorie;
		this.dateRecup = dateRecup;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
		
	}

	public Pieces(String referenceString, float prixUnitaire, int quantite) {
		this.referenceString = referenceString;
		this.prixUnitaire =prixUnitaire;
		this.quantite = quantite;
		this.idVehicule = idVehicule;
	}
	
	public Pieces(int idPieces, String reference, String categorie, String dateRecup, int prixUnitaire, int quantite,
			int idVehicule) {
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

	public String getDateRecup() {
		return dateRecup;
	}

	public void setDateRecup(String dateRecup) {
		this.dateRecup = dateRecup;
	}

	public int getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(int prixUnitaire) {
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

	public String getNewreference() {
		return newreference;
	}


	public void setNewreference(String newreference) {
		this.newreference = newreference;
	}


	public String getNewcategorie() {
		return newcategorie;
	}


	public void setNewcategorie(String newcategorie) {
		this.newcategorie = newcategorie;
	}


	public int getNewprixUnitaire() {
		return newprixUnitaire;
	}


	public void setNewprixUnitaire(int newprixUnitaire) {
		this.newprixUnitaire = newprixUnitaire;
	}


	public int getNewquantite() {
		return newquantite;
	}


	public void setNewquantite(int newquantite) {
		this.newquantite = newquantite;
	}


	public int getNewidVehicule() {
		return newidVehicule;
	}


	public void setNewidVehicule(int newidVehicule) {
		this.newidVehicule = newidVehicule;
	}


	@Override
	public String toString() {
		return "Pieces [idPiece= " + idPieces + "\t categorie= " + categorie + "\t date= "
				+ dateRecup + "\t prixUnitaire= " + prixUnitaire + "\t quantite= " + quantite + "\t idVehicule= " + idVehicule+ "\t ref= " + reference 
				+ "]";
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

}
