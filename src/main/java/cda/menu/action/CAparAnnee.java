package cda.menu.action;

import java.util.List;
import java.util.Scanner;

import cda.menu.model.CAparAnneeModel;

public class CAparAnnee extends Action {

	private static final int ID = 6;
	private static final String DESC = "Afficher le chiffre d'affaire par ann�e";

	Scanner sc = new Scanner(System.in);

	protected CAparAnnee() {
		super(ID, DESC);
	}

	@Override
	public boolean executer() {

		List<CAparAnneeModel> CA = this.caparAnneeDAO.afficherCAparAnnee();

		if (CA.isEmpty()) {

			System.out.println("  > aucun v�hicule n'est dans la BDD !");
		} else {
			CA.stream().forEach(e -> {
				System.out.println("  > " + e.toString());
			});
		}
		return Boolean.TRUE;
	}
}
