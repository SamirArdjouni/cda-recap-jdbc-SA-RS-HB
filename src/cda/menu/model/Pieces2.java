package cda.menu.model;

public class Pieces2 {

	private int idPieces;
	private String reference;
	private String categorie;
	private String dateRecup;
	private int prixUnitaire;
	private int quantite;
	private int idVehicule;
	private String newreference;
	private String newcategorie;
	private int newprixUnitaire;
	private int newquantite;
	private int newidVehicule;

	public Pieces2(String newreference, String newcategorie, int newprixUnitaire, int newquantite, int newidVehicule,
			int idPieces) {
		this.newreference = newreference;
		this.newcategorie = newcategorie;
		this.newprixUnitaire = newprixUnitaire;
		this.newquantite = newquantite;
		this.newidVehicule = newidVehicule;
		this.idPieces = idPieces;
	}

	public Pieces2(String reference, String categorie, String dateRecup, int prixUnitaire, int quantite,
			int idVehicule) {
		this.reference = reference;
		this.categorie = categorie;
		this.dateRecup = dateRecup;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;

	}

	public Pieces2(int idPieces, String reference, String categorie, String dateRecup, int prixUnitaire, int quantite,
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

	public String getReference() {
		return reference;
	}

	public String getCategorie() {
		return categorie;
	}

	public String getDateRecup() {
		return dateRecup;
	}

	public int getPrixUnitaire() {
		return prixUnitaire;
	}

	public int getQuantite() {
		return quantite;
	}

	public int getIdVehicule() {
		return idVehicule;
	}

	public String getNewreference() {
		return newreference;
	}

	public String getNewcategorie() {
		return newcategorie;
	}

	public int getNewprixUnitaire() {
		return newprixUnitaire;
	}

	public int getNewquantite() {
		return newquantite;
	}

	public int getNewidVehicule() {
		return newidVehicule;
	}

	@Override
	public String toString() {
		return "Pieces [idPiece= " + idPieces + "\t categorie= " + categorie + "\t date= " + dateRecup
				+ "\t prixUnitaire= " + prixUnitaire + "\t quantite= " + quantite + "\t idVehicule= " + idVehicule
				+ "\t ref= " + reference + "]";
	}

}
