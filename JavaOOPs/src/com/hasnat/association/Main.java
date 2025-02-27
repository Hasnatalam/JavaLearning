package com.hasnat.association;

public class Main {

	public static void main(String[] args) {
		Address address = new Address("a", "b", "c");
		Employee employee = new Employee(1, "hasnat", address);
		
		System.out.println(employee);
	}

}