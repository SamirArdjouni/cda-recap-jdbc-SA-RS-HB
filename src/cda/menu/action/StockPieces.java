package cda.menu.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cda.connexion.MyConnection;

public class StockPieces extends Action {

	private static final int ID = 5;
	private static final String DESC = "Pieces et somme totale des prix pièces disponible par modele";

	public StockPieces() {
		super(ID, DESC);
	}

	
	@Override
	public boolean executer() {

		return Boolean.TRUE;
	}


	private void extracted() {
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

					System.out.println("modele: " + tab[0] 
							+ 	"\t  totalPiecesDispo: " + tab[1] 
							+	"\t  SommeTotalePrixPiecesDispoParModele: " + tab[2]);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}