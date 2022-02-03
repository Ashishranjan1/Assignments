package Service;

import Persistence.Customer;

public interface CustomerService {

	public void addCustomer(Customer customer);
	public Customer getByCustomerId(int id);
}