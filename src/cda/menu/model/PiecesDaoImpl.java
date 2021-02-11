package cda.menu.model;

import cda.Dao.CrudCategoriePieceDAO;

public class PiecesDaoImpl implements CrudCategoriePieceDAO {

	@Override
	public Pieces CreerCategorie(Pieces piece) {
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				PreparedStatement ps = c.prepareStatement("insert into pays (nomPays,nbHabitant) values (?,?); ",
//						PreparedStatement.RETURN_GENERATED_KEYS);
//				ps.setString(1, piece.getNomPays());
//				ps.setLong(2, piece.getNbHabitant());
//				ps.executeUpdate();
//				ResultSet resultat = ps.getGeneratedKeys();
//				if (resultat.next()) {
//					piece.getIdPays(resultat.getInt(1));
//					return piece;
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		return null;
	}

	@Override
	public void ConsulterCategorie() {

	}

	@Override
	public void ModifierCategorie() {

	}

	@Override
	public void SupprimerCategorie() {

	}

}