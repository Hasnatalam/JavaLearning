package com.hasnat.association;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private Order order;
	public Customer(int customerId, String customerName, String customerAddress, Order order) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + order+ "]";
	}
	
	
	
}
