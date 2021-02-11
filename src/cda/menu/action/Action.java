package cda.menu.action;

import cda.Dao.CrudCategoriePieceDAO;
import cda.menu.model.CategorieDaoImpl;

public abstract class Action {
	
	protected final int id;
	protected final String description;
	protected CrudCategoriePieceDAO catDAO;
	
	protected Action(int pId, String pDescription) {
		this.id = pId;
		this.description = pDescription;
		this.catDAO = new CategorieDaoImpl();
	}
	
	public abstract boolean executer();
	
	public int getId() {
		return this.id;
	}
	
	public String getDescription() {
		return this.description;
	}
}
