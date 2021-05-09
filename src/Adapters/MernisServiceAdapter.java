package Adapters;

import Businnes.concretes.CustomerCheckServiceDao;
import Entities.concretes.Customer;

public class MernisServiceAdapter implements CustomerCheckServiceDao{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new 
		return false;
	}
	
}
