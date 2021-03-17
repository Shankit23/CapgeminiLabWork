package com.pkart.controller;
import com.pkart.model.Customer;
import com.pkart.model.Cart;
import com.pkart.model.Customer;
import com.pkart.model.Product;
import com.pkart.service.CartServiceImpl;
import com.pkart.service.CustomerServiceImpl;
import com.pkart.service.ICartService;
import com.pkart.service.ICustomerService;
import com.pkart.util.DateUtil;
import java.util.Date;
import java.util.Scanner;
import com.pkart.service.IProductService;
import com.pkart.service.ProductServiceImpl;
import com.pkart.model.Cart;
public class CustomerController {
	//In this class all the information regarding customer control function is there.
	private static ICustomerService customerService;
	private static IProductService productService;
	private static Cart cart;
	private static DateUtil dateUtil;
	private static Customer customer;
	private static Product product;
	private static ICartService cartService;
	public CustomerController()
	//All Customer relation is performed in this function
	{
		if(null==productService) {
			productService = new ProductServiceImpl();
		}
		if(null == customer) {
			customer = new Customer();
		}
		if (null == dateUtil) {
			dateUtil = new DateUtil();
		}
		if (null == customerService) {
			customerService = new CustomerServiceImpl();
		}
		if(null==cartService) {
			cartService=new CartServiceImpl();
		}
		if (null == cart) {
			cart = new Cart();
		}
		if (null == product) {
			product = new Product();
	}
	}
	public void operations() {

		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (status) {
			System.out.println("------Customer Operations----");

			System.out.println("1. Register \n 2.View Your Id \n 3. add products into cart \n 4.View Cart \n 5.Exit");
			System.out.println("Enter the choice:");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Customer id,name,email,phone,address");
				int customerId=scanner.nextInt();
				String customerName=scanner.next();
				String customerEmail=scanner.next();
				String customerPhone=scanner.next();
				String customerAddress=scanner.next();
				customer.setId(customerId);
				customer.setName(customerName);
				customer.setEMail(customerEmail);
				customer.setPhone(customerPhone);
				customer.setAddress(customerAddress);
				if (customerService.register(customer)) {
					System.out.println("Registration successfully.");
				} else {
					System.out.println(" Register not done.");
				}
				break;
			case 2:
				System.out.println("Enter your customer Id to view your registration details");
				int id=scanner.nextInt();
				customer = customerService.getCustomer(id);
				System.out.println(customer);
				break;
			case 3:
				System.out.println("enter product id");
				int pid = scanner.nextInt();
			    Product p=productService.getProduct(pid);
                System.out.println("Enter cart ID");
				String cartId=scanner.next();
			    if(cartService.add(p,cartId)){
					System.out.println("Product added in cart successfully");
				}
				else {
					System.out.println("Product not added");
				}
				break;
			case 4:
				System.out.println("Enter cart ID");
				String cartId1=scanner.next();
				System.out.println(cartService.getCartItems(cartId1));
				break;
			case 6:
				System.out.println("Exiting Customer operations.");
				status = false;
			break;
}
		}
	}
}
	
