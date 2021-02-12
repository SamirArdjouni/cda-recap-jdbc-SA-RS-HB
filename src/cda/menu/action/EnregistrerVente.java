package cda.menu.action;

import static cda.menu.ihm.Ihm.IHM_INS;

import java.util.List;
import java.util.Scanner;

import cda.menu.model.Pieces;

public class EnregistrerVente extends Action {
	private static final int ID = 4;
	private static final String DESC = "CRUD Vente Pieces";
	
	Scanner sc = new Scanner(System.in);

	protected EnregistrerVente() {
		super(ID, DESC);

	}

	@Override
	public boolean executer() {
		
		IHM_INS.afficher("On affiche la liste des pièces :");
		System.out.println("Saisissez la reference de la piece");
		String referenceRecherchee = sc.next();
		System.out.print("  < ");

//		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
//		Date dateVente =  new Date();
//		System.out.println(s.format(dateVente));
//		LocalDate dateVenteNow = java.time.LocalDate.now();
		List<Pieces> ref = this.recordSaleDAO.afficherPiecesVendues(referenceRecherchee);

		if (ref.isEmpty()) {

			System.out.println("  > la reference "+referenceRecherchee +" ne correspond à aucune vente !");
		} else {
			ref.stream().forEach(e -> {
				System.out.println("  > " + e);
			});
		}

		return Boolean.TRUE;
	}

}
