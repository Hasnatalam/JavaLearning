package com.hasnat.basic;

public class ActualSalarayCalculation {
	public static void main(String [] args) {
		int basicSalary = Integer.parseInt(args[0]);
		System.out.println("Your Basic salary is    "+basicSalary);
		System.out.println("HRA                      "+(basicSalary*15/100));
		System.out.println("Conveyance allowance     "+(basicSalary*15/100));
		System.err.println("Entertainment allowance  "+(basicSalary*15/100));
		System.err.println("Total salary is         "+((basicSalary*15/100)+(basicSalary*15/100)+(basicSalary*10/100)+basicSalary));
	}
}
