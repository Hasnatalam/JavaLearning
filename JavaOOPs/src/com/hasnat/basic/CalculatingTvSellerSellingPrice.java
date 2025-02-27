package com.hasnat.basic;

public class CalculatingTvSellerSellingPrice {

	public static void main(String [] args) {
		
		float buyingPrice = 32500f;
		float vat = buyingPrice*12.7f/100;
		float serviceCharge = buyingPrice*3.87f/100;
		float profit = buyingPrice*27/100;
		
		System.out.println("Selling price = "+(buyingPrice+vat+serviceCharge+profit));
	}

}
