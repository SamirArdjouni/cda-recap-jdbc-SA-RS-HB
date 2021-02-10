package cda.menu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cda.Dao.PiecesDAO;
import cda.connexion.MyConnection;

public class PiecesDaoImpl implements PiecesDAO {

	public List<Pieces> getAll() {
		
		List<Pieces> Pieces = new ArrayList<>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {

				PreparedStatement statement = c.prepareStatement(
						"SELECT idPiece, reference, categorie, marque, modele FROM pieces natural join vehicules");
				ResultSet r = statement.executeQuery();

				while (r.next()) {
					Pieces.add(new Pieces(r.getString("reference"), r.getString("categorie"), r.getDate("dateRecup"),
							r.getDate("dateVente"), r.getFloat("prixVente"), r.getInt("quantite"),
							r.getInt("idVehicule")));
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return Pieces;
	}
//}
//	@Override
//	public Pieces save(Pieces pays) {
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				PreparedStatement ps = c.prepareStatement("insert into pays (nomPays,nbHabitant) values (?,?); ",
//						PreparedStatement.RETURN_GENERATED_KEYS);
//				ps.setString(1, pays.getNomPays());
//				ps.setLong(2, pays.getNbHabitant());
//				ps.executeUpdate();
//				ResultSet resultat = ps.getGeneratedKeys();
//				if (resultat.next()) {
//					pays.getIdPays(resultat.getInt(1));
//					return pays;
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public Pieces findByName(String nomPays) {
//		Pieces pays = null;
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				PreparedStatement ps = c.prepareStatement("select * from pays where nomPays = ?; ");
//				ps.setString(1, nomPays);
//				ResultSet r = ps.executeQuery();
//				if (r.next()) {
//					pays = new Pieces(r.getInt("idPays"), r.getString("nomPays"), r.getInt("nbHabitant"));
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return pays;
//	}
//
//	@Override
//	public boolean removeById(String nomPays) {
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//
//			try {
//				Statement statement = c.createStatement();
//				ResultSet resultatVille = statement.executeQuery("select nomVille from ville natural join pays where nomPays = '"+ nomPays + "';");
//
//				if (resultatVille.next()) {
//					return false;
//				} else {
//					PreparedStatement ps = c.prepareStatement("DELETE FROM pays WHERE nomPays=?");
//					ps.setString(1, nomPays);
//					ps.executeUpdate();
//					return true;
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return false;
//	}
//
//	
//	@Override
//	public boolean update(Pieces nomPays) {
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				String request = "UPDATE pays SET nomPays=?, nbHabitant=? WHERE idPays=?";
//				PreparedStatement statement = c.prepareStatement(request);
//				
//				statement.setString(1, nomPays.getNomPays());
//				statement.setLong(2, nomPays.getNbHabitant());
//				statement.setInt(3, nomPays.getIdPays());
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

//
//	public List<Pieces> getAllCountry(String Answer) {
//		List<Pieces> Pays = new ArrayList<>();
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				PreparedStatement statement = c.prepareStatement("select * from pays where nomPays ='" + Answer + "'");
//				ResultSet r = statement.executeQuery();
//				while (r.next()) {
//					Pays.add(new Pieces(r.getInt("idPays"), r.getString("nomPays"), r.getInt("nbHabitant")));
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return Pays;
//	}
//
//	@Override
//	public List<Object> findMostPopulatedCountry_biggestCity() {
//		List<Object> tableau = new ArrayList<Object>();
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				PreparedStatement statement = c.prepareStatement(
//						"select nomPays,nomVille, max(superficie) as superficie, max(nbHabitant) as nbHabitant from pays natural join ville;");
//				ResultSet r = statement.executeQuery();
//				while (r.next()) {
//					tableau.add(new TopVilleAndCountry(r.getString("nomPays"), r.getString("nomVille"),
//							r.getFloat("superficie"), r.getInt("nbHabitant")));
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return tableau;
//	}

}