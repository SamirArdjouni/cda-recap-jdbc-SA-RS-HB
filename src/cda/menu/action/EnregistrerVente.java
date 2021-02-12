package cda.menu.action;

import static cda.menu.ihm.Ihm.IHM_INS;

import java.util.List;
import java.util.Scanner;

import cda.menu.model.Categorie;
import cda.menu.model.Vente;

public class EnregistrerVente extends Action {
	private static final int ID = 4;
	private static final String DESC = "Enregistrer une vente";
	
	Scanner sc = new Scanner(System.in);

	protected EnregistrerVente() {
		super(ID, DESC);

	}

	@Override
	public boolean executer() {
		
		IHM_INS.afficher("Enregistrer une vente :");
		System.out.println("Saisissez la date");
		String date = sc.next();
		System.out.print("  < ");
		List<Categorie> categorie = catDAO.ConsulterCategorie();
		if (categorie.isEmpty()) {

			System.out.println("  > aucune pays n'est dans la BDD !");
		} else {
			categorie.stream().forEach(e -> {
				System.out.println("  > " + e);
			});
		}
		System.out.println("Saisissez l'Id de la piece");
		int piece = sc.nextInt();
		System.out.print("  < ");
		System.out.println("Saisissez la quantite");
		int quantite = sc.nextInt();
		System.out.print("  < ");

		
		List<Vente> vente = this.recordSaleDAO.enregistrerUneVente(date, piece, quantite);

		if (vente.isEmpty()) {

			System.out.println("  > la date ne correspond à aucune vente !");
		} else {
			vente.stream().forEach(e -> {
				System.out.println("  > " + e);
			});
		}

		return Boolean.TRUE;
	}

}
