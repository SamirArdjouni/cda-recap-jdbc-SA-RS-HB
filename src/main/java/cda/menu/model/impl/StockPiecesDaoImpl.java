package cda.menu.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cda.Dao.StockPiecesDAO;
import cda.connexion.MyConnection;
import cda.menu.model.StockPieceModel;

public class StockPiecesDaoImpl implements StockPiecesDAO {

	@Override
	public List<StockPieceModel> affichageStockPiecesParModele() {

		List<StockPieceModel> stockPiece = new ArrayList<>();
		Connection c = MyConnection.getConnection();

		if (c != null) {
			try {

				PreparedStatement statement = c.prepareStatement("select modele,sum(quantite) as totalPiecesDispo,\r\n"
						+ "	sum(quantite*prixUnitaire) as SommeTotalePrixPiecesDispoParModele from pieces \r\n"
						+ "	natural join vehicule  \r\n" + "	natural join catalogueVehicules\r\n"
						+ "	group by modele;");
				ResultSet r = statement.executeQuery();

				while (r.next()) {

					stockPiece.add(new StockPieceModel(r.getString("modele"), r.getString("totalPiecesDispo"),
							r.getString("SommeTotalePrixPiecesDispoParModele")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return stockPiece;
	}

}
