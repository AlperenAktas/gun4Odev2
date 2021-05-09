package Businnes.concretes;

import Entities.concretes.Customer;

public interface CustomerCheckServiceDao {
	boolean CheckIfRealPerson(Customer customer);
}
