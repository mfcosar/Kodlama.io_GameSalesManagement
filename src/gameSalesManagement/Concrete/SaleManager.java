package gameSalesManagement.Concrete;


import gameSalesManagement.Abstract.SaleService;
import gameSalesManagement.Entities.Campaign;
import gameSalesManagement.Entities.Game;
import gameSalesManagement.Entities.Gamer;
import gameSalesManagement.Entities.Sale;

public class SaleManager implements SaleService{
	
	@Override
	public void sellGame(Gamer gamer, Game game) {
		System.out.println("Sale added to db. Game : " + game.getName()+" saled to " + gamer.getFirstName());
		
	}
	@Override
	public void sellGameWithCampaign(Gamer gamer, Game game, Campaign campaign){
		System.out.println("Sale added to db. Game : " + game.getName()+" saled to " + gamer.getFirstName() + " with campaign : " + campaign.getName()
							+ " for " + calculateSellingPrice(game, campaign) + " TLs");
		
	}
	private double calculateSellingPrice(Game game, Campaign campaign) {
		
		double sellingPrice = game.getPrice() * (100 - campaign.getRateOfDiscount())/100;
		return sellingPrice;
		
	}

	@Override
	public void update(Sale sale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Sale sale) {
		// TODO Auto-generated method stub
		
	}

}
