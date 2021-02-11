
package cda.menu.action;

import static cda.menu.ihm.Ihm.IHM_INS;

public class CrudCategoriePiece extends Action {

	private static final int ID = 1;
	private static final String DESC = "CRUD categorie piece";

	public CrudCategoriePiece() {
		super(ID, DESC);
	}

	@Override
	public boolean executer() {

		IHM_INS.afficher("Saisissez l'action à realiser :");
		System.out.println("1 : créer une catégorie :");
		System.out.println("2 : consulter une catégorie :");
		System.out.println("3 : modifier une catégorie :");
		System.out.println("4 : supprimer une catégorie :");

		int choix = Integer.parseInt(IHM_INS.lireMot());

//		switch (choix) {
//		case 1:
//			PiecesDaoImpl.CreerCategorie();
//			break;
//		case 2:
//			ConsulterCategorie();
//			break;
//		case 3:
//			ModifierCategorie();
//			break;
//		case 4:
//			SupprimerCategorie();
//			break;
//		default:
//			break;
//		}

		return Boolean.TRUE;
	}

}