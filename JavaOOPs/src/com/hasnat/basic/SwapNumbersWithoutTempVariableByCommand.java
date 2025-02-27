package com.hasnat.basic;

public class SwapNumbersWithoutTempVariableByCommand {
	public static void main(String[] args) {
		
		float num1 = Float.parseFloat(args[0]);
	        float num2 = Float.parseFloat(args[1]);
		
		System.out.println("Original values num1= " + num1 + " num2 = " + num2);
		num1+=num2;	num2=num1-num2;	num1=num1-num2;	
	  
	        System.out.println("wapped values num1= " + num1 + " num2 = " + num2);

	        
	    }

}
