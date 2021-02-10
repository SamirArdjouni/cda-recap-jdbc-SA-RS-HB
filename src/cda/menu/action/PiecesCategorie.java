package cda.menu.action;

public class PiecesCategorie extends Action {
	
	private static final int ID = 1;
	private static final String DESC = "afficher les pays";
	
	public PiecesCategorie() {
		super(ID, DESC);
	}

	@Override
	public boolean executer() {
		
		
//		List<Pieces> listPieces = this.PiecesDAO.getAll();
//
//		if (listPays.isEmpty()) {
//
//			System.out.println("  > aucune pays n'est dans la BDD !");
//		} else {
//
//			listPays.stream().forEach(e -> {
//				System.out.println("  > " + e);
//			});
//		}
		return Boolean.TRUE;
	}
	
}
