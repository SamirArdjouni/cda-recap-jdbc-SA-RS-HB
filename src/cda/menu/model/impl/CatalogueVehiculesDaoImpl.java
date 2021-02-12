package cda.menu.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cda.Dao.CrudCatalogueVehiculesDAO;
import cda.connexion.MyConnection;
import cda.menu.model.CatalogueVehicules;

public class CatalogueVehiculesDaoImpl implements CrudCatalogueVehiculesDAO {

	@Override
	public CatalogueVehicules AjouterVehicule(CatalogueVehicules vehicule) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement(
						"insert into CatalogueVehicules (marque, annee, modele) values (?,?,?);",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, vehicule.getMarque());
				ps.setString(2, vehicule.getAnnee());
				ps.setString(3, vehicule.getModele());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					vehicule.getIdCatalogue();
					return vehicule;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<CatalogueVehicules> ConsulterCatalogue() {

		List<CatalogueVehicules> catalogue = new ArrayList<>();
		Connection c = MyConnection.getConnection();

		if (c != null) {
			try {
				PreparedStatement statement = c
						.prepareStatement("SELECT * FROM CatalogueVehicules order by idCatalogue");
				ResultSet r = statement.executeQuery();

				while (r.next()) {
					catalogue.add(new CatalogueVehicules(r.getInt("idCatalogue"), r.getString("marque"),
							r.getString("annee"), r.getString("modele")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return catalogue;
	}

	@Override
	public boolean ModifierCatalogue(CatalogueVehicules vehicule) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				String request = "UPDATE catalogueVehicules SET marque=?,annee=?,modele=? where modele = ?;";

				PreparedStatement statement = c.prepareStatement(request);
				statement.setString(1, vehicule.getMarqueNew());
				statement.setString(2, vehicule.getAnneeNew());
				statement.setString(3, vehicule.getNewModele());
				statement.setString(4, vehicule.getModele());

				int nbrUpdated = statement.executeUpdate();
				return nbrUpdated == 1;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean SupprimerVehicule(String modele) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("DELETE FROM catalogueVehicules WHERE modele=?;");
				ps.setString(1, modele);
				ps.executeUpdate();
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
