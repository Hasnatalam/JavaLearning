package com.hasnat.basic;

//Calculate compound interest for 3 years? Formula- amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));

public class CalculatingCompoundInterest{

	public static void main (String [] args){
	
	float principle=10000f,rate=5f;
	float amount;
	amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
	
	System.out.println("compound interest for 3 years =" + amount);
	
	}

}