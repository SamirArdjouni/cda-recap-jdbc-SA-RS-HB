package cda.menu.action;  //sam


import java.util.List;

import cda.menu.model.StockVoitureRecenteModel;



public class StockVoitureRecente extends Action{

	private static final int ID = 8;
	private static final String DESC = "Stock disponible pour les 3voitures les plus recente";

	protected StockVoitureRecente() {
		super(ID, DESC);
	}

	@Override
	public boolean executer() {
		 
		List<StockVoitureRecenteModel> voitureRecenteParModel = this.stockVoitureRecenteDAO.affichageStockVehiculeRecent();

		if (voitureRecenteParModel.isEmpty()) {

			System.out.println("  > Le véhicule est: ");
		} else {
			voitureRecenteParModel.stream().forEach(e -> {
				System.out.println("  > " + e.toString());
			});
		}
		return Boolean.TRUE;
	}
}

	
	

