package com.hasnat.inputOutput;

import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Customer implements Serializable{
	private Integer customerId;
	private String customerName;
	private Double customerBill;
	public Customer(Integer customerId, String customerName, Double customerBill) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}
	
	public Customer() {
		
	}
	public static Customer getCustomerObject() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer Id");
		int id = sc.nextInt();
		System.out.println("Enter customer Name");
		String name = sc.nextLine();
			   name = sc.nextLine();
		System.out.println("Enter customer Bill");
		Double price = sc.nextDouble();
		
		Customer c1 = new Customer(id, name, price);
		sc.close();
		return c1;	
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
	
}
