//Service operation regarding cart operation is performed here
package com.pkart.service;

import java.util.List;
import java.util.Map;

import com.pkart.model.Cart;
import com.pkart.model.Customer;
import com.pkart.model.Product;
import com.pkart.dao.CartDaoImpl;
import com.pkart.dao.ICartDao;
public class CartServiceImpl implements ICartService {
private static ICartDao cartDao;
	
	public CartServiceImpl() {
		if(cartDao==null) {
			cartDao=new CartDaoImpl();
		}
	}

	@Override
	public boolean add(Product product, String cartId) {
		cartDao.add(product,cartId);
		return true;
		
	}

	@Override
	public List<Product> getCartItems(String  cartId) {
		return cartDao.getCartItems(cartId);	
	}

	

}
