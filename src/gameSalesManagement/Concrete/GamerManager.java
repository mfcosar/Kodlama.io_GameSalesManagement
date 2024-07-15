package gameSalesManagement.Concrete;

import gameSalesManagement.Abstract.GamerCheckService;
import gameSalesManagement.Abstract.GamerService;
import gameSalesManagement.Entities.Gamer;

public class GamerManager implements GamerService{

	GamerCheckService _gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this._gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void add(Gamer gamer)  throws Exception{
		
		if (_gamerCheckService.checkIfRealPerson(gamer)){
			System.out.println("Gamer added to db: " + gamer.getFirstName());
		}else 
			throw new Exception("Not a valid person");
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

}
