package Businnes.concretes;

import DataAccess.concretes.BaseCustomerManager;
import Entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckServiceDao customerCheckService;
	private BaseCustomerManager base;
	
	
	
	public StarbucksCustomerManager(CustomerCheckServiceDao customerCheckService) {
		this.customerCheckService = customerCheckService;
	}



	@Override
	public void save(Customer customer) throws Exception {
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			base.save(customer);
		}else {
			throw  new Exception("Not a valid person");
		}
		
	}

	
}
