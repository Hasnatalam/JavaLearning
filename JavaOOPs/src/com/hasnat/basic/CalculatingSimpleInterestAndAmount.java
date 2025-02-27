package com.hasnat.basic;

public class CalculatingSimpleInterestAndAmount {

	public static void main(String[] args) {
		
		 int principle = Integer.parseInt(args[0]);
		 float interestRate = Float.parseFloat(args[1]);
		 int time = Integer.parseInt(args[2]);
		 
		 float interestAmount;
		 
		 interestAmount = principle*interestRate*time/100;
		 
		 System.out.println("Interest amount = "+interestAmount);
		 System.out.println("Total amount = "+(interestAmount+principle));

	}

}
