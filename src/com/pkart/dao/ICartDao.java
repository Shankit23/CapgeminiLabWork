package com.pkart.dao;
import java.util.List;
import com.pkart.model.Product;
public interface ICartDao {
public void add(Product product, String cartId);
public List<Product> getCartItems(String cartId);
	
}
