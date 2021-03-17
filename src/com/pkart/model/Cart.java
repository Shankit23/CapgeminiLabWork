package com.pkart.model;

import java.util.ArrayList;

public class Cart {

	private String id;
	private ArrayList<Product> products;

	public Cart() {
	}

	public Cart(String id, ArrayList<Product> products) {
		super();
		this.id = id;
		this.products = products;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", products=" + products + "]";
	}

}
