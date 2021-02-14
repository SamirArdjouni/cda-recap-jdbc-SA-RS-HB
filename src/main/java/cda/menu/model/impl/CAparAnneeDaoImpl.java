package cda.menu.model.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cda.Dao.CAparAnneeDAO;
import cda.connexion.MyConnection;
import cda.menu.model.CAparAnneeModel;

public class CAparAnneeDaoImpl implements CAparAnneeDAO {

	@Override
	public List<CAparAnneeModel> afficherCAparAnnee() {

		List<CAparAnneeModel> CA = new ArrayList<>();

		Connection c = MyConnection.getConnection();

		if (c != null) {
			try {

				PreparedStatement statement = c.prepareStatement("select year(dateVente) as année , "
						+ "sum(vente.quantite * prixUnitaire) as chiffreDaffaire from vente \r\n"
						+ "				join pieces\r\n" + "				group by year(dateVente)\r\n"
						+ "				order by année desc;");

				ResultSet r = statement.executeQuery();

				while (r.next()) {
					CA.add(new CAparAnneeModel(r.getString("année"), r.getString("chiffreDaffaire")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return CA;
	}

}
