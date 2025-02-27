package com.hasnat.cosntructer2;

public class Loan {
	private double interestRate ;
	private int durationMonths ;
	private double principal ;
	public Loan(double interestRate, int durationMonths, double principal) {
		super();
		if(interestRate == 0||durationMonths==0||principal==0) {
			System.err.println("Error");
		}
		else {
		this.interestRate = interestRate;
		this.durationMonths = durationMonths;
		this.principal = principal;
		}
		
	} 
	public double calculateMonthlyPayment() {
		double durationInYear = durationMonths/12;
		double interasteAmount = principal*(interestRate*durationInYear)/100;
		double totalAmount= principal+interasteAmount;
		return totalAmount/durationMonths;
	}
	public double getInterestRate() {
		return interestRate;
	}
	
	public int getDurationMonths() {
		return durationMonths;
	}
	
	public double getPrincipal() {
		return principal;
	}
	
	
	
}
