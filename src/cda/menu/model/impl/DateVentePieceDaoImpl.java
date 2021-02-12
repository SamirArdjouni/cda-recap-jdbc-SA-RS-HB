package cda.menu.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cda.Dao.DateVentePieceDAO;
import cda.connexion.MyConnection;
import cda.menu.model.CatalogueVehicules;
import cda.menu.model.Vente;

public class DateVentePieceDaoImpl implements DateVentePieceDAO{

	@Override
	public List<Vente> ConsulterDateVentePiece() {
		List<Vente> vente = new ArrayList<>();
		Connection c = MyConnection.getConnection();
		
		if (c != null) {
			try {
				PreparedStatement statement = c.prepareStatement("SELECT * FROM vente where dateVente = ?;");
				ResultSet r = statement.executeQuery();

				while (r.next()) {
					vente.add(new Vente(r.getString("dateVente")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vente;
	}

}
