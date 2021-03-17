package com.pkart.dao;

import java.util.*;

import com.pkart.model.*;

public interface ICustomerDao {

	void register(Customer customer);
	

	
	Customer getCustomer(int productId);
	
	
}
