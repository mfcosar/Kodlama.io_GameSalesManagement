package gameSalesManagement.Abstract;

import gameSalesManagement.Entities.Game;

public interface GameService {
	
	void add(Game game);
	void update(Game game);
	void delete(Game game);

}
