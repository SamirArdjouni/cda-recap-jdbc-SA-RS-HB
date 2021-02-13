package cda.menu.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cda.Dao.EnregistrerVenteDAO;
import cda.connexion.MyConnection;
import cda.menu.model.Pieces;
import cda.menu.model.Vente;

public class EnregistrerVenteDAOImpl implements EnregistrerVenteDAO {


	@Override
	public  List<Pieces> afficherPiecesVendues(String referenceRecherchee){

		List<Pieces> piecesVendues = new ArrayList<>();

		Connection c = MyConnection.getConnection();

		if (c != null) {
			try {
				PreparedStatement statement = c.prepareStatement("SELECT IdPieces ,reference, prixUnitaire, quantite FROM pieces where reference =? order by reference;");
				statement.setString(1, referenceRecherchee);				
				ResultSet r = statement.executeQuery();
				
				
				while (r.next()) {
					piecesVendues.add(new Pieces(r.getString("reference"),r.getInt("prixUnitaire"),r.getInt("quantite")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return piecesVendues;
	}


	@Override
	public void modifierDateVente(String ancienneDate, String nouvelleDate) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void enregistrerUneVente(int reference, float prixUnitaire, int quantite) {
		// TODO Auto-generated method stub
		
	}

}
