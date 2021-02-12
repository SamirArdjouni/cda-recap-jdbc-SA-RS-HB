package cda.menu.action;

import cda.Dao.CrudCatalogueVehiculesDAO;
import cda.Dao.CrudCategoriePieceDAO;
import cda.Dao.DateVentePieceDAO;
import cda.menu.model.impl.CatalogueVehiculesDaoImpl;
import cda.menu.model.impl.CategorieDaoImpl;
import cda.menu.model.impl.DateVentePieceDaoImpl;

public abstract class Action {

	protected final int id;
	protected final String description;
	protected CrudCategoriePieceDAO catDAO;
	protected CrudCatalogueVehiculesDAO catalogueDAO;
	protected DateVentePieceDAO pieceDAO;

	protected Action(int pId, String pDescription) {
		this.id = pId;
		this.description = pDescription;
		this.catDAO = new CategorieDaoImpl();
		this.catalogueDAO = new CatalogueVehiculesDaoImpl();
		this.pieceDAO = new DateVentePieceDaoImpl();
	}

	public abstract boolean executer();

	public int getId() {
		return this.id;
	}

	public String getDescription() {
		return this.description;
	}
}
