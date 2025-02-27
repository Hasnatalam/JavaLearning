package com.hasnat.basic;

public class SumOfTwoDigitIntegerByCommand {
	public static void main(String [] args) {
		
	int num = Integer.parseInt(args[0]);
	int num2=num%10;num/=10;
	
	System.out.println("Sum of two digit integer ="+(num+num2));
	System.out.println();
	
	}
}
