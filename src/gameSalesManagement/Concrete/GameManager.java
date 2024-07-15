package gameSalesManagement.Concrete;

import gameSalesManagement.Abstract.GameService;
import gameSalesManagement.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Game added to db: " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}

}
