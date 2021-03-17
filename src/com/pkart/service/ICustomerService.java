package com.pkart.service;
import com.pkart.model.*;
public interface ICustomerService {
	boolean register(Customer customer);
	
	Customer getCustomer(int customerId);

}
