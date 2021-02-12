package cda.menu.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cda.Dao.StockPiecesDAO;
import cda.connexion.MyConnection;

public class StockPiecesDaoImpl implements StockPiecesDAO {

	@Override
	public String[] affichageStockPiecesParModele() {

		String[] tab = new String[3];
		Connection c = MyConnection.getConnection();

		if (c != null) {
			try {

				PreparedStatement statement = c.prepareStatement("select modele,sum(quantite) as totalPiecesDispo,\r\n"
						+ "	sum(quantite*prixUnitaire) as SommeTotalePrixPiecesDispoParModele from pieces \r\n"
						+ "	natural join vehicule  \r\n" + "	natural join catalogueVehicules\r\n"
						+ "	group by modele;");
				ResultSet r = statement.executeQuery();

				while (r.next()) {
					String modele = r.getString(1);
					String totalPiecesDispo = r.getString(2);
					String SommeTotalePrixPiecesDispoParModele = r.getString(3);
					tab[0] = modele;
					tab[1] = totalPiecesDispo;
					tab[2] = SommeTotalePrixPiecesDispoParModele;

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return tab;
	}

}
