package cda.menu.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cda.Dao.CrudPiecesDAO;
import cda.connexion.MyConnection;
import cda.menu.model.Pieces;

public class PiecesDAOImpl implements CrudPiecesDAO {

	@Override
	public Pieces AjouterPièce(Pieces piece) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement(
						"INSERT INTO PIECES (reference, idCategorie, dateRecup, prixUnitaire, quantite, idVehicule) VALUES (?, ?, ?, ?, ?, ?);",

						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, piece.getReference());
				ps.setString(2, piece.getCategorie());
				ps.setString(3, piece.getDateRecup());
				ps.setInt(4, piece.getPrixUnitaire());
				ps.setInt(5, piece.getQuantite());
				ps.setInt(6, piece.getIdVehicule());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					return piece;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Pieces> ConsulterPieces() {
		List<Pieces> pieces = new ArrayList<>();
		Connection c = MyConnection.getConnection();

		if (c != null) {
			try {
				PreparedStatement statement = c.prepareStatement("SELECT * FROM PIECES");
				ResultSet r = statement.executeQuery();

				while (r.next()) {
					pieces.add(new Pieces(r.getInt("idPieces"), r.getString("reference"), r.getString("idCategorie"),
							r.getString("dateRecup"), r.getInt("prixUnitaire"), r.getInt("quantite"),
							r.getInt("idVehicule")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return pieces;
	}

	@Override
	public boolean ModifierPiece(Pieces piece) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				String request = "UPDATE pieces SET reference=?, idCategorie= ?, prixUnitaire=?, quantite=?, idVehicule=? where IdPieces = ?;";

				PreparedStatement statement = c.prepareStatement(request);
				statement.setString(1, piece.getNewreference());
				statement.setString(2, piece.getNewcategorie());
				statement.setInt(3, piece.getNewprixUnitaire());
				statement.setInt(4, piece.getNewquantite());
				statement.setInt(5, piece.getNewidVehicule());
				statement.setInt(6, piece.getIdPieces());

				int nbrUpdated = statement.executeUpdate();
				return nbrUpdated == 1;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean SupprimerPiece(String idPieces) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("DELETE FROM pieces WHERE idPieces=?;");
				ps.setString(1, idPieces);
				ps.executeUpdate();
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
