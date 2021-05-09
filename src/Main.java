import java.util.GregorianCalendar;

import Businnes.concretes.NeroCustomerManager;
import DataAccess.concretes.BaseCustomerManager;
import Entities.concretes.Customer;


public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setBirthDate(new GregorianCalendar(1990,8,23).getTime());
		customer.setFirstName("alperen");
		customer.setLastName("aktaþ");
		customer.setId(9);
		customer.setNationalityId("1354663");
		
		
		
	}

}
