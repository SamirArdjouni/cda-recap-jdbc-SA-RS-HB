
package cda.menu.action;

import static cda.menu.ihm.Ihm.IHM_INS;

import java.util.List;
import java.util.Scanner;

import cda.menu.model.Categorie;

public class CrudCategoriePiece extends Action {

	private static final int ID = 1;
	private static final String DESC = "CRUD categorie piece";
//	private CrudCategoriePieceDAO catDao;

	public CrudCategoriePiece() {
		super(ID, DESC);
	}

	@Override
	public boolean executer() {

		Scanner sc = new Scanner(System.in);

		IHM_INS.afficher("Saisissez l'action � realiser :");
		System.out.println("1 : cr�er une cat�gorie :");
		System.out.println("2 : consulter une cat�gorie :");
		System.out.println("3 : modifier une cat�gorie :");
		System.out.println("4 : supprimer une cat�gorie :");

		int choix = IHM_INS.lireEntier();

		switch (choix) {

		case 1:
			System.out.println("Saisissez la nouvelle cat�gorie");
			System.out.print("  < ");
			String newCat = sc.next();

			Categorie c = this.catDAO.CreerCategorie(new Categorie(newCat));

			if (c != null) {
				System.out.println("  > Categorie ajout� avec succ�s ");
			}
			break;

		case 2:
			List<Categorie> categorie = this.catDAO.ConsulterCategorie();
			if (categorie.isEmpty()) {

				System.out.println("  > aucune pays n'est dans la BDD !");
			} else {
				categorie.stream().forEach(e -> {
					System.out.println("  > " + e);
				});
			}
			break;
			
			
		case 3:
			System.out.println("Saisissez la cat�gorie � modifier");
			System.out.print("  < ");
			String libelleToModif = sc.next();
			
			System.out.println("Saisissez son nouveau nom");
			System.out.print("  < ");
			String libelleUpdated = sc.next();
			
			boolean isModif = this.catDAO.ModifierCategorie(new Categorie(libelleToModif,libelleUpdated));
			
			if (isModif) {
				System.out.println("  > " + libelleToModif + " modifi�e avec succ�s !");
			} else {
				System.out.println("  > ! ERREUR : il y a encore des villes inscrites dans la BDD concernant ce Pays");
			}
			break;
			
			
		case 4:
			System.out.println("Saisissez la cat�gorie �  supprimer");
			System.out.print("  < ");
			String catToSupp = sc.nextLine();
			boolean removeById = catDAO.SupprimerCategorie(catToSupp);
			if (removeById) {
				System.out.println("  > " + catToSupp + " supprim� avec succ�s !");
			} else {
				System.out.println("  > ! ERREUR : il n'y pas de categorie actuellement dans la table !");
			}
			break;
		default:
			break;
		}

		return Boolean.TRUE;
	}

}