package cda.menu.model;

public class Vehicule {

	private int idVehicule;
	private String immat;
	
	public Vehicule(int idVehicule, String immat) {
		this.idVehicule = idVehicule;
		this.immat = immat;
	}

	public int getIdVehicule() {
		return idVehicule;
	}

	public void setIdVehicule(int idVehicule) {
		this.idVehicule = idVehicule;
	}

	public String getImmat() {
		return immat;
	}

	public void setImmat(String immat) {
		this.immat = immat;
	}

	@Override
	public String toString() {
		return "Vehicule [idVehicule=" + idVehicule + ", immat=" + immat + "]";
	}
}
