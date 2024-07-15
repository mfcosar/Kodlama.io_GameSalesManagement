package gameSalesManagement.Concrete;

import gameSalesManagement.Abstract.GamerCheckService;
import gameSalesManagement.Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		// TODO Auto-generated method stub
		return true;
	}

	// burda Mernis'e bağlanmak gerekiyor:
	// https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL   
}
