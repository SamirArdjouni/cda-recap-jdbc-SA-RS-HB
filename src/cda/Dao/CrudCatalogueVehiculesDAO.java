package cda.Dao;

import java.util.List;

import cda.menu.model.CatalogueVehicules;

public interface CrudCatalogueVehiculesDAO {

	CatalogueVehicules AjouterVehicule (CatalogueVehicules vehicule);

	List<CatalogueVehicules> ConsulterCatalogue();

	boolean ModifierCatalogue(CatalogueVehicules vehicule);

	boolean SupprimerVehicule (String libelle);

}
