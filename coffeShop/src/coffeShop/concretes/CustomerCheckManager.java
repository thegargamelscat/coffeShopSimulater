package coffeShop.concretes;

import coffeShop.abstracts.CustomerCheckService;
import coffeShop.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer){
		
		return true;
	}
	
}
