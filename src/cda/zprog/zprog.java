package cda.zprog;

import static cda.menu.ihm.Ihm.IHM_INS;

import java.util.TreeMap;

import cda.menu.action.Action;
import cda.menu.action.LesActions;

public class zprog {

	public static void main(String[] args) {
		TreeMap<Integer, Action> actions = new TreeMap<>();
		ajouterAction(actions, LesActions.ACTION_INTROUVABLE);
		ajouterAction(actions, LesActions.QUITTER);
		ajouterAction(actions, LesActions.CRUD_CATEGORIE_PIECE);
		ajouterAction(actions, LesActions.CRUD_CATALOGUE_VEHICULES);
		ajouterAction(actions, LesActions.DATE_VENTE_PIECE);
		ajouterAction(actions, LesActions.STOCK_PIECES);
		ajouterAction(actions, LesActions.CA_PAR_ANNEE);
		ajouterAction(actions, LesActions.ENREGISTRER_VENTE);

		boolean vContinuer;
		int vActionSaisie;
		do {
			IHM_INS.afficher("\n*******************\nsaisissez une action");
			for (Action action : actions.values()) {
				IHM_INS.afficher("\t" + action.getId() + ")- " + action.getDescription());
			}
			vActionSaisie = IHM_INS.lireEntier();
			vContinuer = actions.getOrDefault(vActionSaisie, LesActions.ACTION_INTROUVABLE).executer();
		} while (vContinuer);
	}

	private static void ajouterAction(TreeMap<Integer, Action> actions, Action pAction) {
		actions.put(pAction.getId(), pAction);
	}
}