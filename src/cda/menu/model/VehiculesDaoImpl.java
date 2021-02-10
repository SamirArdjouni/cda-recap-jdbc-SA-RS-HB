package cda.menu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cda.Dao.VehiculesDAO;
import cda.connexion.MyConnection;

public class VehiculesDaoImpl implements VehiculesDAO {

	@Override
	public List<Vehicules> getAll() {
		List<Vehicules> Vehicules = new ArrayList<>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {

				PreparedStatement statement = c.prepareStatement(
						"SELECT idPiece, reference, categorie, marque, modele FROM pieces natural join vehicules");
				ResultSet r = statement.executeQuery();

				while (r.next()) {
					Vehicules.add(new Vehicules(r.getString("reference"), r.getString("categorie"), r.getDate("dateRecup"),
							r.getDate("dateVente"), r.getFloat("prixVente"), r.getInt("quantite"),
							r.getInt("idVehicule")));
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return Vehicules;
	}

//	@Override
//	public Ville save(Ville ville) {
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				PreparedStatement ps = c.prepareStatement("insert into ville (nomVille,superficie) values (?,?); ",
//						PreparedStatement.RETURN_GENERATED_KEYS);
//				ps.setString(1, ville.getNomVille());
//				ps.setLong(2, (long) ville.getSuperficie());
//				ps.executeUpdate();
//				ResultSet resultat = ps.getGeneratedKeys();
//				if (resultat.next()) {
//					ville.getIdVille(resultat.getInt(1));
//					return ville;
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public Ville findByName(String nomVille) {
//		Ville ville = null;
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				PreparedStatement ps = c.prepareStatement("select * from ville where nomVille = ?; ");
//				ps.setString(1, nomVille);
//				ResultSet r = ps.executeQuery();
//				if (r.next()) {
//					ville = new Ville(r.getString("nomVille"), r.getInt("superficie"), r.getInt("idPays"));
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return ville;
//	}
//
//	@Override
//	public boolean removeById(String nomVille) {
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				PreparedStatement ps = c.prepareStatement("DELETE FROM ville WHERE nomVille=?");
//				ps.setString(1, nomVille);
//				int nbDeleted = ps.executeUpdate();
//				return nbDeleted == 1;
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return false;
//	}
//
//	@Override
//	public boolean update(Ville ville) {
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				String request = "UPDATE ville SET nomVille=?, superficie=? WHERE idVille=?";
//
//				PreparedStatement statement = c.prepareStatement(request);
//				statement.setString(1, ville.getNomVille());
//				statement.setLong(2, (long) ville.getSuperficie());
//				statement.setInt(3, ville.getIdVille());
//				
//				int nbrUpdated = statement.executeUpdate();
//				return nbrUpdated == 1;
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return false;
//	}
//
//	public List<Ville> getAll() {
//		List<Ville> Ville = new ArrayList<>();
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				
//				PreparedStatement statement = c.prepareStatement("SELECT * FROM ville");
//				ResultSet r = statement.executeQuery();
//
//				while (r.next()) {
//					Ville.add(new Ville(r.getString("nomVille"), r.getFloat("superficie"), r.getInt("idPays")));
//				}
//				
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return Ville;
//	}
//	
//	public List<Ville> getAllCity(String Answer) {
//		List<Ville> ville = new ArrayList<>();
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				PreparedStatement statement = c.prepareStatement("select * from ville where nomVille ='" + Answer + "'");
//				ResultSet r = statement.executeQuery();
//				while (r.next()) {
//					ville.add(new Ville(r.getString("nomVille"), r.getInt("superficie"), r.getInt("idPays")));
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return ville;
//	}
}