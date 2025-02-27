package com.hasnat.association;

public class Zomato {
	public static void main(String[] args) {
		Order order = new Order(5,"pizza",300);
		Customer customer = new Customer(1,"ab","abc",order);
		System.out.println(customer);
	}
	

	
	
}
