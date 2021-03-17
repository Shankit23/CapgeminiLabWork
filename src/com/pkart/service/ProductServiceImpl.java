////Service operation regarding product operation is performed here
package com.pkart.service;

import java.util.List;

import com.pkart.dao.IProductDao;
import com.pkart.dao.ProductDaoImpl;
import com.pkart.model.Product;

public class ProductServiceImpl implements IProductService {

	private static IProductDao productDao;

	public ProductServiceImpl() {

		if (null == productDao)
			productDao = new ProductDaoImpl();

	}

	@Override
	public boolean add(Product product) {

		productDao.add(product);

		Product savedProduct = productDao.getProduct(product.getId());

		if (savedProduct != null)
			return true;
		else
			return false;

	}

	@Override
	public boolean update(int i,Product product) {
		productDao.update(i,product);
		Product updatedProduct = productDao.getProduct(product.getId());

		if (updatedProduct != null)
			return true;
		else
			return false;

	}
	

	@Override
	public Product getProduct(int productId) {
		return productDao.getProduct(productId);
	}

	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

}
