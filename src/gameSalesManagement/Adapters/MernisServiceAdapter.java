package gameSalesManagement.Adapters;

import gameSalesManagement.Abstract.GamerCheckService;
import gameSalesManagement.Entities.Gamer;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		// Gerçek Mernis sistemeine bağlanıp doğrulamayı yapan kodlar buraya gelmeli
		// MernisServiceReference folder altındaki KPSPublic SoapClient .. vs
		// return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName().toUpperCase(),user.getLastName().toUpperCase(),user.getDateOfBirth().getYear());
		return true;
	}

}
