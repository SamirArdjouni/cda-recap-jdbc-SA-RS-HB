package cda.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	private static String url = "jdbc:mysql://localhost:3306/exo1?useSSL=false&serverTimezone=UTC";
	private static String utilisateur = "user1";
	private static String motDePasse = "user1pwd";
	private static Connection connexion = null;

	private MyConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		if (connexion == null) {
			new MyConnection();
		}
		return connexion;
	}

	public static void stop() {
		if (connexion != null) {
			try {
				connexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
