package cda.menu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cda.Dao.CrudCategoriePieceDAO;
import cda.connexion.MyConnection;

public class CategorieDaoImpl implements CrudCategoriePieceDAO {

	@Override
	public Categorie CreerCategorie(Categorie categorie) {

		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement(
						"insert into categorie (libelle) values (?);",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, categorie.getLibelle());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					categorie.getIdCategorie();
					return categorie;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Categorie> ConsulterCategorie() {

		List<Categorie> categorie = new ArrayList<>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement statement = c.prepareStatement("SELECT * FROM categorie order by idCategorie");
				ResultSet r = statement.executeQuery();

				while (r.next()) {
					categorie.add(new Categorie(r.getInt("idCategorie"), r.getString("libelle")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return categorie;
	}

	@Override
	public boolean ModifierCategorie(Categorie categorie) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				String request = "UPDATE categorie SET libelle=? where libelle = ?";

				PreparedStatement statement = c.prepareStatement(request);
				statement.setString(1, categorie.getNewLib());
				statement.setString(2, categorie.getLibelle());

				int nbrUpdated = statement.executeUpdate();
				return nbrUpdated == 1;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public boolean SupprimerCategorie(String libelle) {

		Connection c = MyConnection.getConnection();
		if (c != null) {

			try {
				PreparedStatement ps = c.prepareStatement("DELETE FROM categorie WHERE libelle=?");
				ps.setString(1, libelle);
				ps.executeUpdate();
				return true;

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
