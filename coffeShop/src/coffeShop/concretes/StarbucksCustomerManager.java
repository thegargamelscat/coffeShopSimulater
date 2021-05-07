package coffeShop.concretes;

import coffeShop.abstracts.BaseCustomerManager;
import coffeShop.abstracts.CustomerCheckService;
import coffeShop.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) throws Exception {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			throw new Exception("Not a valid person");
		}
	}
	
}
