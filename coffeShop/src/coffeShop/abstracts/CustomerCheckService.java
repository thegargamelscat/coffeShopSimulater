package coffeShop.abstracts;

import coffeShop.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer)throws Exception;
}
