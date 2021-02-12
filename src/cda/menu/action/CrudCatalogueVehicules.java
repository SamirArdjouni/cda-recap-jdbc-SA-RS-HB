
package cda.menu.action;

import static cda.menu.ihm.Ihm.IHM_INS;

import java.util.List;
import java.util.Scanner;

import cda.menu.model.CatalogueVehicules;

public class CrudCatalogueVehicules extends Action {

	private static final int ID = 2;
	private static final String DESC = "CRUD catalogues vehicules";
	
	Scanner sc = new Scanner(System.in);
	
	public CrudCatalogueVehicules() {
		super(ID, DESC);
	}

	@Override
	public boolean executer() {

		IHM_INS.afficher("Saisissez l'action à realiser :");
		System.out.println("1 : ajouter un vehicule :");
		System.out.println("2 : consulter le catalogue :");
		System.out.println("3 : modifier un vehicule :");
		System.out.println("4 : supprimer un vehicule :");

		int choix = IHM_INS.lireEntier();

		switch (choix) {

		
		case 1:
			System.out.println("Saisissez la marque");
			System.out.print("  < ");
			String marque = new Scanner(System.in).next();

			System.out.println("Saisissez l'année");
			System.out.print("  < ");
			String annee = sc.next();

			System.out.println("Saisissez le model");
			System.out.print("  < ");
			String model = sc.next();

			CatalogueVehicules c = this.catalogueDAO.AjouterVehicule(new CatalogueVehicules(marque, annee, model));

			if (c != null) {
				System.out.println("  > Categorie ajouté avec succès ");
			}
			break;

			
		case 2:
			List<CatalogueVehicules> catalogue = this.catalogueDAO.ConsulterCatalogue();
			if (catalogue.isEmpty()) {

				System.out.println("  > aucun véhicule n'est dans la BDD !");
			} else {
				catalogue.stream().forEach(e -> {
					System.out.println("  > " + e);
				});
			}
			break;
			
			
		case 3:
			System.out.println("Saisissez le model a modifier");
			System.out.print("  < ");
			String modeleOld = sc.next();
			
			System.out.println("Saisissez son nouveau model");
			System.out.print("  < ");
			String newModel = sc.next();
			
			System.out.println("Saisissez la marque");
			System.out.print("  < ");
			String marqueNew = sc.next();
			
			System.out.println("Saisissez sa date");
			System.out.print("  < ");
			String anneeNew = sc.next();
			
			boolean isModif = this.catalogueDAO.ModifierCatalogue(new CatalogueVehicules(modeleOld, newModel, marqueNew, anneeNew ));
			
			if (isModif) {
				System.out.println("  > " + modeleOld + " modifiée avec succès !");
			} else {
				System.out.println("  > ! ERREUR : il y a encore des villes inscrites dans la BDD concernant ce Pays");
			}
			break;
			
			
		case 4:
			System.out.println("Saisissez le modele à supprimer");
			System.out.print("  < ");
			String modeleToSupp = sc.nextLine();
			boolean removeByModel = catalogueDAO.SupprimerVehicule(modeleToSupp);
			if (removeByModel) {
				System.out.println("  > " + modeleToSupp + " supprimé avec succès !");
			} else {
				System.out.println("  > ! ERREUR : ce modéle n'appartiens a aucun véhicule !");
			}
			break;
		default:
			break;
		}
		return Boolean.TRUE;
	}
}