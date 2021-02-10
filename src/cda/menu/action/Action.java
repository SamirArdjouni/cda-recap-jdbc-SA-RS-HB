package cda.menu.action;

public abstract class Action {
	
	protected final int id;
	protected final String description;
//	protected VilleDAO villeDAO;
//	protected PaysDAO paysDAO;
	
	protected Action(int pId, String pDescription) {
		this.id = pId;
		this.description = pDescription;
//		this.villeDAO = new VilleDaoImpl();
//		this.paysDAO = new PaysDaoImpl();
	}
	
	public abstract boolean executer();
	
	public int getId() {
		return this.id;
	}
	
	public String getDescription() {
		return this.description;
	}
}
