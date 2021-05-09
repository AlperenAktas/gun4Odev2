package DataAccess.concretes;

import DataAccess.abstracts.CustomerDao;
import Entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerDao{

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Saved to database: "+customer.getFirstName());
	}

}
