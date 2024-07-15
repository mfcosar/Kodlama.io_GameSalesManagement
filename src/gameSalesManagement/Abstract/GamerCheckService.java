package gameSalesManagement.Abstract;

import gameSalesManagement.Entities.Gamer;

public interface GamerCheckService {
	boolean checkIfRealPerson(Gamer gamer);
}
