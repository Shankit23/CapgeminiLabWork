package com.pkart.dao;

import java.util.List;

import com.pkart.model.Product;

public interface IProductDao {

	void add(Product product);

	void update(int id,Product product);

	Product getProduct(int productId);

	List<Product> getAllProducts();

}
