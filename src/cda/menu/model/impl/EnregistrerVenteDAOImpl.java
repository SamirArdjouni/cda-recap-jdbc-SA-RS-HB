package cda.menu.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cda.Dao.EnregistrerVenteDAO;
import cda.connexion.MyConnection;
import cda.menu.model.Vente;

public class EnregistrerVenteDAOImpl implements EnregistrerVenteDAO {

	@Override
	public List<Vente> enregistrerUneVente(String date, int piece, int quantite) {

		List<Vente> vente = new ArrayList<>();

		Connection c = MyConnection.getConnection();

		if (c != null) {
			try {
				PreparedStatement statement = c.prepareStatement("SELECT * FROM vente where dateVente = ?;");
				statement.setString(1, date);
				ResultSet r = statement.executeQuery();
				
				while (r.next()) {
					vente.add(new Vente(r.getInt("IdVente"),r.getInt("quantite"),r.getString("dateVente"),r.getInt("IdPieces")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vente;
	}

}
