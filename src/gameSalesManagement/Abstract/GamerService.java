package gameSalesManagement.Abstract;

import gameSalesManagement.Entities.Gamer;

public interface GamerService {
	
	void add(Gamer gamer) throws Exception;
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
