package cda.menu.action;

import static cda.menu.ihm.Ihm.IHM_INS;

final class Quitter extends Action {

	private static final int ID = 0;
	private static final String DESC = "quitter le programme";

	Quitter() {
		super(ID, DESC);
	}

	@Override
	public boolean executer() {
		IHM_INS.afficher("A bientot !");
		return Boolean.FALSE;
	}

}
