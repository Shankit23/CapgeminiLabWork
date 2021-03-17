//Service operation regarding customer operation is performed here
package com.pkart.service;
import com.pkart.dao.*;
import com.pkart.model.*;
public class CustomerServiceImpl implements ICustomerService {
	private static ICustomerDao customerDao;

	public CustomerServiceImpl() {

		if (null == customerDao)
			customerDao = new CustomerDaoImpl();

	}

	@Override
	public boolean register(Customer customer) {
		customerDao.register(customer);

		Customer registerCustomer = customerDao.getCustomer(customer.getId());

		if (registerCustomer != null)
			return true;
		else
			return false;
		
	}

	
	

	@Override
	public Customer getCustomer(int customerId) {
		return customerDao.getCustomer(customerId);
	}

	
	}


