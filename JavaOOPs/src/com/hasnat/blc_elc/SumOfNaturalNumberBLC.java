package com.hasnat.blc_elc;

public class SumOfNaturalNumberBLC {
	public static String sumOfNaturalNumber(int num) {
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum+=i;
		}
		return ""+sum;
	}
}
