//Implementation of Cart Operation regarding storage is performed here.
package com.pkart.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pkart.model.Product;
import com.pkart.model.Cart;

public class CartDaoImpl implements ICartDao {
	Map<String,List<Product>> cartItems;
	List<Product> products=new ArrayList<Product>();
	
	public CartDaoImpl() {
	if(null==cartItems) {
		cartItems=new HashMap<String,List<Product>>();
	}		
	}
	@Override
	public void add(Product product, String cartId) {
		products.add(product);
		cartItems.put(cartId, products);
		
	}

	@Override
	public List<Product> getCartItems(String cartId) {
		
		return cartItems.get(cartId);
	}

	
}
