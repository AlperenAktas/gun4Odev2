package DataAccess.abstracts;

import Entities.concretes.Customer;

public interface CustomerDao {
	void save(Customer customer) throws Exception;
}
