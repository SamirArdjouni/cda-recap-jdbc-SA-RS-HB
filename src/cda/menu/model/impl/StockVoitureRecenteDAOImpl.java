package cda.menu.model.impl;  //sam
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cda.Dao.StockVoitureRecenteDAO;
import cda.connexion.MyConnection;
import cda.menu.model.StockVoitureRecenteModel;

public class StockVoitureRecenteDAOImpl implements StockVoitureRecenteDAO{

	@Override
	public List<StockVoitureRecenteModel> affichageStockVehiculeRecent() {
		
		List<StockVoitureRecenteModel> stockVehiculeRecent= new ArrayList<>();
		Connection c = MyConnection.getConnection();

		if (c != null) {
			try {
				PreparedStatement statement = c.prepareStatement("select marque, modele, annee, immat, quantite from cataloguevehicules join vehicule join pieces group by annee order by annee desc limit 3;");
				ResultSet r = statement.executeQuery();

				while (r.next()) {
					stockVehiculeRecent.add(new StockVoitureRecenteModel(r.getString("marque"), r.getString("modele"), r.getString("annee"), r.getString("immat"), r.getString("quantite")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return stockVehiculeRecent;
	}

}
