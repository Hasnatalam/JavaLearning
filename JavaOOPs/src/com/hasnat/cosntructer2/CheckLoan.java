package com.hasnat.cosntructer2;

public class CheckLoan {

	public static void main(String[] args) {
		Loan l1 = new Loan(10,12,10000);
		double installment= l1.calculateMonthlyPayment();
		System.out.println("Your monthly payment is "+installment );
	}

}
