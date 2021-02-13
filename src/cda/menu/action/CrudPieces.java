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
	private static final String DESC = "CRUD catalogue pièce";

	Scanner sc = new Scanner(System.in);

	public CrudPieces() {
		super(ID, DESC);
	}

	@Override
	public boolean executer() {

		IHM_INS.afficher("Saisissez l'action à realiser :");
		System.out.println("1 : ajouter un pièce :");
		System.out.println("2 : consulter le catalogue de pièce :");
		System.out.println("3 : modifier un pièce :");
		System.out.println("4 : supprimer un pièce :");

		int choix = IHM_INS.lireEntier();

		switch (choix) {

		case 1:
			System.out.println("Veuillez  saisir la reférence du produit");
			System.out.print("  < ");
			String reference = sc.next();

			System.out.println("L'id de sa catégorie");
			System.out.print("  < ");
			String idCategorie = sc.next();

			System.out.println("Le prix à l'unité");
			System.out.print("  < ");
			int prixUnitaire = sc.nextInt();

			System.out.println("La quantité");
			System.out.print("  < ");
			int quantite = sc.nextInt();

			System.out.println("La réference du véhicule dont il proviens");
			System.out.print("  < ");
			int idVehicule = sc.nextInt();

			String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

			Pieces2 c = this.crudPiecesDAO
					.AjouterPièce(new Pieces2(reference, idCategorie, date, prixUnitaire, quantite, idVehicule));

			if (c != null) {
				System.out.println("  > Categorie ajouté avec succès ");
			}
			break;

		case 2:
			List<Pieces2> catalogue = this.crudPiecesDAO.ConsulterPieces();
			if (catalogue.isEmpty()) {

				System.out.println("  > aucun pièce n'est dans la BDD !");
			} else {
				catalogue.stream().forEach(e -> {
					System.out.println("  > " + e);
				});
			}
			break;

		case 3:
			System.out.println("Saisissez l'Id de la pièce à ajouter");
			System.out.print("  < ");
			int pieceToModif = sc.nextInt();

			System.out.println("Saisissez sa réfèrence");
			System.out.print("  < ");
			String Newref = sc.next();

			System.out.println("Saisissez sa catégorie");
			System.out.print("  < ");
			String newCat = sc.next();

			System.out.println("saisissez la quantité");
			System.out.print("  < ");
			int newQuantite = sc.nextInt();

			System.out.println("Saisissez son prix :");
			System.out.print("  < ");
			int newPrixUnitaire = sc.nextInt();

			System.out.println("l'Id du véhicule auquel elle proviens");
			System.out.print("  < ");
			int newIdVehicule = sc.nextInt();

			boolean isModif = this.crudPiecesDAO.ModifierPiece(
					new Pieces2(Newref, newCat, newPrixUnitaire, newQuantite, newIdVehicule, pieceToModif));

			if (isModif) {
				System.out.println("  > pièce modifiée avec succès !");
			} else {
				System.out.println("  > ! ERREUR : quantitée non modifiable");
			}

			break;

		case 4:
			System.out.println("Saisissez l'Id de la pièce à supprimer");
			System.out.print("  < ");
			String pieceToSupp = sc.nextLine();
			boolean removeById = crudPiecesDAO.SupprimerPiece(pieceToSupp);
			if (removeById) {
				System.out.println("  >  la pièce à été supprimé avec succès !");
			} else {
				System.out.println("  > ! ERREUR : nous n'avons pas cette pièce !");
			}
			break;
		default:
			break;
		}
		return Boolean.TRUE;
	}
}
