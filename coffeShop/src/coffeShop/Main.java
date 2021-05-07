package coffeShop;

import java.time.LocalDate;

import coffeShop.abstracts.BaseCustomerManager;
import coffeShop.adapters.MernisServiceAdapter;
import coffeShop.concretes.NeroCustomerManager;
import coffeShop.concretes.StarbucksCustomerManager;
import coffeShop.entities.Customer;

public class Main {

	public static void main(String[] args)throws Exception {
		Customer recep = new Customer();
		recep.setId(1);
		recep.setFirstName("Recep");
		recep.setLastName("Azman");
		recep.setDateOfBirth(LocalDate.of(1997, 12, 18));
		recep.setNationalityId("39161157834");
		
		
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(
				new Customer(
						1,
						"Recep",
						"Azman",
						LocalDate.of(1997,12,18),	//Doðum Tarihi YYYY/AA/GG formatýnda.
						"39161157834"));
						
	}
}
