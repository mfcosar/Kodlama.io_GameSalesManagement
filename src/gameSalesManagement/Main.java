package gameSalesManagement;

import java.time.LocalDate;

import gameSalesManagement.Abstract.GamerCheckService;
import gameSalesManagement.Adapters.MernisServiceAdapter;
import gameSalesManagement.Concrete.GameManager;
import gameSalesManagement.Concrete.GamerCheckManager;
import gameSalesManagement.Concrete.GamerManager;
import gameSalesManagement.Concrete.SaleManager;
import gameSalesManagement.Concrete.CampaignManager;
import gameSalesManagement.Entities.Campaign;
import gameSalesManagement.Entities.Game;
import gameSalesManagement.Entities.Gamer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Gamer gamer1 = new Gamer(1, "Engin", "Demiroğ",  LocalDate.of(1985,1,6) , "28861499108", "engindemirog@birmail.com");
		Game game1 = new Game(1, "ComputerGameFootball", 100, "A mini football match for 6 players", 6);
		
		GamerCheckService gamerCheckService = new GamerCheckManager(); // fake service
		GamerCheckService gamerCheckService2 = new MernisServiceAdapter(); //real check
		
		GamerManager gamerManager = new GamerManager(gamerCheckService2);
		gamerManager.add(gamer1);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign(1, "Summer Discount", "Till the end of August all games 5 % discount", 5, true);
		campaignManager.add(campaign1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sellGame(gamer1, game1);
		if (campaign1.isValid())
			saleManager.sellGameWithCampaign(gamer1, game1, campaign1);
		
		
		

	}

}
