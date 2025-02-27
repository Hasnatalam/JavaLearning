package com.hasnat.basic;

public class FindingYearsMonthAndDays {

	public static void main(String[] args) {
		
		int days=Integer.parseInt(args[0]);
		System.out.print(days/365+"years");
		days%=365;
		System.out.print(days/30+"months");
		days%=30;
		System.out.println(days+"days");

	}

}
