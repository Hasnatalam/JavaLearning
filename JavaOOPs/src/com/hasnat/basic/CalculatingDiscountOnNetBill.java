package com.hasnat.basic;

public class CalculatingDiscountOnNetBill {

	public static void main(String[] args) {
		
		double bill = Double.parseDouble(args[0]);
		//int bill = 5000,discount=0;
		double discount=0f;
		if(bill<=5000 && bill>0) {
			discount=bill*5/100;
			System.out.println("You got 10% discount");
		}

		else if(bill>5000&&bill<=10000) {
			discount=bill*10/100;
			System.out.println("You got 10% discount");
		}
		else if(bill>10000) {
			discount=bill*15/100;
			System.out.println("You got 15% discount");
		}
		
		System.out.println("Discount = "+discount);
		System.out.println("Payable amount = "+(bill-discount));
	}

}
