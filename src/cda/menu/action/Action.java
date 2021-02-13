package cda.menu.action;

import cda.Dao.CAparAnneeDAO;
import cda.Dao.CrudCatalogueVehiculesDAO;
import cda.Dao.CrudCategoriePieceDAO;
import cda.Dao.CrudPiecesDAO;
import cda.Dao.DateVentePieceDAO;
import cda.Dao.EnregistrerVenteDAO;
import cda.Dao.StockPiecesDAO;
import cda.Dao.StockVoitureRecenteDAO;
import cda.menu.model.impl.CAparAnneeDaoImpl;
import cda.menu.model.impl.CatalogueVehiculesDaoImpl;
import cda.menu.model.impl.CategorieDaoImpl;
import cda.menu.model.impl.DateVentePieceDaoImpl;
import cda.menu.model.impl.EnregistrerVenteDAOImpl;
import cda.menu.model.impl.PiecesDAOImpl;
import cda.menu.model.impl.StockPiecesDaoImpl;
import cda.menu.model.impl.StockVoitureRecenteDAOImpl;

public abstract class Action {

	protected final int id;
	protected final String description;
	protected CrudCategoriePieceDAO catDAO;
	protected CrudCatalogueVehiculesDAO catalogueDAO;
	protected DateVentePieceDAO pieceDAO;
	protected StockPiecesDAO stockPiecesDAO;
	protected CAparAnneeDAO caparAnneeDAO;
<<<<<<< HEAD
	protected EnregistrerVenteDAO recordSaleDAO;
	protected CrudPiecesDAO crudPiecesDAO;
=======
<<<<<<< HEAD
	protected StockVoitureRecenteDAO stockVoitureRecenteDAO; 
=======
	protected EnregistrerVenteDAO recordSaleDAO;
	protected CrudPiecesDAO crudPiecesDAO;
>>>>>>> main
>>>>>>> dev-samir

	protected Action(int pId, String pDescription) {
		this.id = pId;
		this.description = pDescription;
		this.catDAO = new CategorieDaoImpl();
		this.catalogueDAO = new CatalogueVehiculesDaoImpl();
		this.pieceDAO = new DateVentePieceDaoImpl();
		this.stockPiecesDAO = new StockPiecesDaoImpl();
		this.caparAnneeDAO = new CAparAnneeDaoImpl();
<<<<<<< HEAD
=======
<<<<<<< HEAD
		this.stockVoitureRecenteDAO = new StockVoitureRecenteDAOImpl();
=======
>>>>>>> dev-samir
		this.recordSaleDAO = new EnregistrerVenteDAOImpl();
		this.crudPiecesDAO = new PiecesDAOImpl();
		this.stockVoitureRecenteDAO = new StockVoitureRecenteDAOImpl();

<<<<<<< HEAD
=======
>>>>>>> main
>>>>>>> dev-samir
	}

	public abstract boolean executer();

	public int getId() {
		return this.id;
	}

	public String getDescription() {
		return this.description;
	}
}
