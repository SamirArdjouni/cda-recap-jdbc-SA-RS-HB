package cda.menu.model;

public class CatalogueVehicules {
	
	private int idCatalogue;
	private String marque;
	private String annee;
	private String modele;
	private String newModele;
	private String marqueNew;
	private String anneeNew;
	
	
	public CatalogueVehicules(int idCatalogue, String marque, String annee, String modele) {
		
		this.idCatalogue = idCatalogue;
		this.marque = marque;
		this.annee = annee;
		this.modele = modele;
	}
	
	public CatalogueVehicules(String marque, String annee, String modele) {
		
		this.marque = marque;
		this.annee = annee;
		this.modele = modele;
	}
	public CatalogueVehicules(String modele, String newModele, String marqueNew, String anneeNew) {
		
		this.modele = modele;
		this.marqueNew = marqueNew;
		this.anneeNew = anneeNew;
		this.newModele = newModele;
	}
		

	public int getIdCatalogue() {
		return idCatalogue;
	}

	public void setIdCatalogue(int idCatalogue) {
		this.idCatalogue = idCatalogue;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public String getModele() {
		return modele;
	}
	
	public String getNewModele() {
		return newModele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	@Override
	public String toString() {
		return "CatalogueVehicules [idCatalogue=" + idCatalogue + ", marque=" + marque + ", annee=" + annee
				+ ", modele=" + modele + "]";
	}

	public String getMarqueNew() {
		return marqueNew;
	}

	public void setMarqueNew(String marqueNew) {
		this.marqueNew = marqueNew;
	}

	public String getAnneeNew() {
		return anneeNew;
	}

	public void setAnneeNew(String anneeNew) {
		this.anneeNew = anneeNew;
	}

	public void setNewModele(String newModele) {
		this.newModele = newModele;
	}
	
}
