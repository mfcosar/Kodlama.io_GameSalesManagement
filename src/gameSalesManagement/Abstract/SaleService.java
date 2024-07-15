package gameSalesManagement.Abstract;

import gameSalesManagement.Entities.Campaign;
import gameSalesManagement.Entities.Game;
import gameSalesManagement.Entities.Gamer;
import gameSalesManagement.Entities.Sale;

public interface SaleService {
	
	void sellGame(Gamer gamer, Game game);
	void sellGameWithCampaign(Gamer gamer, Game game, Campaign campaign);
	void update(Sale sale);
	void delete(Sale sale);

}
