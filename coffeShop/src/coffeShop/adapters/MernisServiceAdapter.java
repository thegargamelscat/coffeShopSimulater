package coffeShop.adapters;

import java.rmi.RemoteException;

import coffeShop.abstracts.CustomerCheckService;
import coffeShop.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		KPSPublicSoapProxy kpsPublicSaopProxy = new KPSPublicSoapProxy();

		return kpsPublicSaopProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
				customer.getDateOfBirth().getYear());
	}

}
