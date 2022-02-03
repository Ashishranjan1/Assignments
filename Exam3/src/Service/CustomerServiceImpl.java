package Service;


import java.sql.Date;

import Persistence.Customer;
import Persistence.CustomerDaoImpl;



public class CustomerServiceImpl implements CustomerService{

	private CustomerDaoImpl customerdao;
	public CustomerServiceImpl()
	{
		customerdao=new CustomerDaoImpl();
	}
	@Override
	public void addCustomer(Customer customer) {
		customerdao.addCustomer(new Customer("Naveen","Mumbai","9081717111",new Date(2000-03-01)));
	}

	@Override
	public Customer getByCustomerId(int id) {
		return customerdao.getByCustomerId(1);
	}

}