package com.hasnat.basic1;

import java.util.Scanner;

public class Product {
	String brand;
	String model;
	int price;
	
	public void setProductData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile brand name :");
		brand = sc.nextLine();
		System.out.println("Enter mobile model name :");
		model = sc.nextLine();
		System.out.println("Enter mobile price  :");
		price = sc.nextInt();
		sc.close();
		
	}
	public void getProductInfo() {
		
		System.out.println("Mobile brand is : "+brand);
		System.out.println("Mobile model is : "+model);
		System.out.println("Mobile price is : "+price);
	}
}
