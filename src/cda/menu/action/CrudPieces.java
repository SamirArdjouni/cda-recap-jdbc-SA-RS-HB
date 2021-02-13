package cda.menu.action;

import static cda.menu.ihm.Ihm.IHM_INS;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import cda.menu.model.Pieces;
import cda.menu.model.Pieces2;

public class CrudPieces extends Action {
	private static final int ID = 4;
	private static final String DESC = "CRUD catalogue pi�ce";

	Scanner sc = new Scanner(System.in);

	public CrudPieces() {
		super(ID, DESC);
	}

	@Override
	public boolean executer() {

		IHM_INS.afficher("Saisissez l'action � realiser :");
		System.out.println("1 : ajouter un pi�ce :");
		System.out.println("2 : consulter le catalogue de pi�ce :");
		System.out.println("3 : modifier un pi�ce :");
		System.out.println("4 : supprimer un pi�ce :");

		int choix = IHM_INS.lireEntier();

		switch (choix) {

		case 1:
			System.out.println("Veuillez  saisir la ref�rence du produit");
			System.out.print("  < ");
			String reference = sc.next();

			System.out.println("L'id de sa cat�gorie");
			System.out.print("  < ");
			String idCategorie = sc.next();

			System.out.println("Le prix � l'unit�");
			System.out.print("  < ");
			int prixUnitaire = sc.nextInt();

			System.out.println("La quantit�");
			System.out.print("  < ");
			int quantite = sc.nextInt();

			System.out.println("La r�ference du v�hicule dont il proviens");
			System.out.print("  < ");
			int idVehicule = sc.nextInt();

			String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

			Pieces2 c = this.crudPiecesDAO
					.AjouterPi�ce(new Pieces2(reference, idCategorie, date, prixUnitaire, quantite, idVehicule));

			if (c != null) {
				System.out.println("  > Categorie ajout� avec succ�s ");
			}
			break;

		case 2:
			List<Pieces2> catalogue = this.crudPiecesDAO.ConsulterPieces();
			if (catalogue.isEmpty()) {

				System.out.println("  > aucun pi�ce n'est dans la BDD !");
			} else {
				catalogue.stream().forEach(e -> {
					System.out.println("  > " + e);
				});
			}
			break;

		case 3:
			System.out.println("Saisissez l'Id de la pi�ce � ajouter");
			System.out.print("  < ");
			int pieceToModif = sc.nextInt();

			System.out.println("Saisissez sa r�f�rence");
			System.out.print("  < ");
			String Newref = sc.next();

			System.out.println("Saisissez sa cat�gorie");
			System.out.print("  < ");
			String newCat = sc.next();

			System.out.println("saisissez la quantit�");
			System.out.print("  < ");
			int newQuantite = sc.nextInt();

			System.out.println("Saisissez son prix :");
			System.out.print("  < ");
			int newPrixUnitaire = sc.nextInt();

			System.out.println("l'Id du v�hicule auquel elle proviens");
			System.out.print("  < ");
			int newIdVehicule = sc.nextInt();

			boolean isModif = this.crudPiecesDAO.ModifierPiece(
					new Pieces2(Newref, newCat, newPrixUnitaire, newQuantite, newIdVehicule, pieceToModif));

			if (isModif) {
				System.out.println("  > pi�ce modifi�e avec succ�s !");
			} else {
				System.out.println("  > ! ERREUR : quantit�e non modifiable");
			}

			break;

		case 4:
			System.out.println("Saisissez l'Id de la pi�ce � supprimer");
			System.out.print("  < ");
			String pieceToSupp = sc.nextLine();
			boolean removeById = crudPiecesDAO.SupprimerPiece(pieceToSupp);
			if (removeById) {
				System.out.println("  >  la pi�ce � �t� supprim� avec succ�s !");
			} else {
				System.out.println("  > ! ERREUR : nous n'avons pas cette pi�ce !");
			}
			break;
		default:
			break;
		}
		return Boolean.TRUE;
	}
}
