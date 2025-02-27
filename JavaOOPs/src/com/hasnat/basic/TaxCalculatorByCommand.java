package com.hasnat.basic;

public class TaxCalculatorByCommand {
	 public static void main(String[] args) {
	        float amt = Float.parseFloat(args[0]);
	        double rate = Double.parseDouble(args[1]);
	        
	      
	        System.out.println("Taxable income :"+amt);
	        System.out.println("Tax rate :"+rate+" %");
	        System.out.println("Texable Amount Rs :"+(amt*rate/100));
	        
	    }

}
