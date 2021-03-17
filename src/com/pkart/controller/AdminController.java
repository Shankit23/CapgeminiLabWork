package com.pkart.controller;
import com.pkart.util.DateUtil;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.pkart.model.Product;
import com.pkart.service.IProductService;
import com.pkart.service.ProductServiceImpl;
public class AdminController {
//Admin class controls all the admin activities
	private static IProductService productService;
	private static DateUtil dateUtil;
	private static Product product;
	public AdminController() {

		if (null == productService) {
			productService = new ProductServiceImpl();
		}
		if (null == dateUtil) {
			dateUtil = new DateUtil();
		}
		if (null == product)
			product = new Product();
	}
    
	public void operations() {
//In this function we control all the basic admin operations
		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (status) {
			System.out.println("------Admin Operations----");

			System.out.println("1. Add Product \n 2.Update Product \n 3.View Product \n 4.View All Products \n 5.Exit");
			System.out.println("Enter the choice:");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("enter product id, name,price: ,quantity,manufacturedDate,expiryDate");
				int id = scanner.nextInt();
				String name = scanner.next();
				double price = scanner.nextDouble();
				int quantity = scanner.nextInt();
				Date dateOfManufacture = null;
				try {
					dateOfManufacture = dateUtil.getStringToDate(scanner.next());
				} catch (Exception e) {
					e.printStackTrace();
				}
				Date dateOfExpiry=null;
				try {
					dateOfExpiry = dateUtil.getStringToDate(scanner.next());
				} catch (Exception e) {
					e.printStackTrace();
				}
                product.setId(id);
				product.setName(name);
				product.setPrice(price);
				product.setQuantity(quantity);
                product.setDateOfManufacture(dateOfManufacture);
                product.setDateOfExpiry(dateOfExpiry);
				if (productService.add(product)) {
					System.out.println("Product added successfully.");
				} else {
					System.out.println("Product not added.");
				}
				break;

			case 2:System.out.println("enter product id you want to update details for");
			     id = scanner.nextInt();
			     boolean condition=true;
			     while(condition) {
			     System.out.println("What do you want to update");
			     System.out.println(" a.name \n b.price: \n c.quantity \n d.manufacturedDate \n e.expiryDate\n f. Exit");
			     System.out.println("Enter Choice");
			     String c=scanner.next();
			     switch(c) {
			     case "a":
			    	 System.out.println("Enter product new name");
			    	 String n=scanner.next();
			    	 product.setName(n);
			    	 if (productService.update(id,product)) {
							System.out.println("Product name updated successfully.");
						} else {
							System.out.println("Product not updated.");
						}
			    	 break;
			     case "b":
			    	 System.out.println("Enter product price");
			    	 double p=scanner.nextDouble();
			    	 product.setPrice(p);
			    	 if (productService.update(id,product)) {
							System.out.println("Product price updated successfully.");
						} else {
							System.out.println("Product not updated.");
						}
			    	 break;
			     case "c":
			    	 System.out.println("Enter product new quantity");
			    	 int q=scanner.nextInt();
			    	 product.setQuantity(q);
			    	 if (productService.update(id,product)) {
							System.out.println("Product quantity updated successfully.");
						} else {
							System.out.println("Product not updated.");
						}
			    	 break;
			     case "d":
			    	 System.out.println("Enter product new Manufacture Date");
			    	 Date dom = null;
						try {
							dom = dateUtil.getStringToDate(scanner.next());
						} catch (Exception e) {
							e.printStackTrace();
						}
			    	 product.setDateOfManufacture(dom);
			    	 if (productService.update(id,product)) {
							System.out.println("Product Manufactured date updated successfully.");
						} else {
							System.out.println("Product not updated.");
						}
			    	 break;
			     case "e":
			    	 System.out.println("Enter product new Expiry Date");
			    	 Date doe = null;
						try {
							doe = dateUtil.getStringToDate(scanner.next());
						} catch (Exception e) {
							e.printStackTrace();
						}
			    	 product.setDateOfExpiry(doe);
			    	 if (productService.update(id,product)) {
							System.out.println("Product Expiry date updated successfully.");
						} else {
							System.out.println("Product not updated.");
						}
			    	 break;
			     case "f":
						System.out.println("Exiting update operations..!");
						condition = false;
			     }
			     }
			
				 break;

			case 3:
				System.out.println("enter product id:");
				id = scanner.nextInt();
				product = productService.getProduct(id);
				System.out.println(product);
				break;
			case 4:
				List<Product> allProducts = productService.getAllProducts();

				for (Product prod : allProducts) {
					System.out.println(prod);
				}
				break;

			case 5:
				System.out.println("Exiting admin operations..!");
				status = false;

			}

		}

	}

}
