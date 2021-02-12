package cda.menu.model;

public class Vente {

	private int idVente;
	private int quantite;
	private String dateVente;
	
	public Vente(int idVente, int quantite, String dateVente) {
		this.idVente = idVente;
		this.quantite = quantite;
		this.dateVente = dateVente;
	}
	
	public Vente(String string) {
		
		this.dateVente = string;
	}

	public int getIdVente() {
		return idVente;
	}

	public void setIdVente(int idVente) {
		this.idVente = idVente;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getDateVente() {
		return dateVente;
	}

	public void setDateVente(String dateVente) {
		this.dateVente = dateVente;
	}

	@Override
	public String toString() {
		return "Vente [idVente=" + idVente + ", quantite=" + quantite + ", dateVente=" + dateVente + "]";
	}
	
}
