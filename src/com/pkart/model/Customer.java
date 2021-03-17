package com.pkart.model;

public class Customer {
	private int id;
	private String name;
	private String EMail;
	private String phone;
	private String address;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", eMail=" + EMail + ", phone=" + phone + ", address="
				+ address + "]";
	}
	public Customer(int id, String name, String EMail, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.EMail = EMail;
		this.phone = phone;
		this.address = address;
	}
	public Customer() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return EMail;
	}
	public void setEMail(String EMail) {
		this.EMail = EMail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
