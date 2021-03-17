package com.pkart.service;
import java.util.List;
import java.util.Map;

import com.pkart.model.Cart;
import com.pkart.model.Customer;
import com.pkart.model.Product;
public interface ICartService {
	boolean add(Product product,String cartId);
	
	public List<Product> getCartItems(String cartID);
	   
}
