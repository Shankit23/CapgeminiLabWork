//Implementation of Customer Operation regarding storage is performed here.
package com.pkart.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.pkart.model.*;


public class CustomerDaoImpl implements ICustomerDao {
	private static Map<Integer, Customer> customers;

	public CustomerDaoImpl() {

		if (null == customers) {
			customers = new HashMap<>();
		}

	}


   
    public void register( Customer customer) {
    	customers.put(customer.getId(),customer);
    }
    public Map<Integer,Cart> viewCart(int cartId){
    	return null;
    }

	@Override
	public Customer getCustomer(int customerId) {
		return customers.get(customerId);
		
	}

	}


