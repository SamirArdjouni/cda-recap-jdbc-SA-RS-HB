package cda.menu.action;

import static cda.menu.ihm.Ihm.IHM_INS;

import java.util.List;
import java.util.Scanner;
import cda.menu.model.Vente;

public class DateVentePiece extends Action{

	private static final int ID = 3;
	private static final String DESC = "CRUD  date vente";
	Scanner sc = new Scanner(System.in);
	
	protected DateVentePiece() {
		super(ID, DESC);
	}
	@Override
	public boolean executer() {
		IHM_INS.afficher("Saisissez la date de vente recherchée :");
		
		
		System.out.println("Saisissez la date");
		System.out.print("  < ");
//		String date_vente = sc.next();
		
		List<Vente> vente = this.pieceDAO.ConsulterDateVentePiece();
		if (vente.isEmpty()) {

			System.out.println("  > aucune pays n'est dans la BDD !");
		} else {
			vente.stream().forEach(e -> {
				System.out.println("  > " + e);
			});
		}
		
		return Boolean.TRUE;
	}

}
