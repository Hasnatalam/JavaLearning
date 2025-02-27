package com.hasnat.basic;

public class SumAndAverageCalculatorByCommand {
	public static void main(String[] args) {
	       
	       
		float num1 = Float.parseFloat(args[0]);   
		float num2 = Float.parseFloat(args[1]);
		float num3 = Float.parseFloat(args[2]);

		float sum=num1+num2+num3;
		System.out.println("Sum of three no "+sum);
		int len = args.length;
		System.out.println("Average of three no "+(sum/len));

	        
	    }

}
