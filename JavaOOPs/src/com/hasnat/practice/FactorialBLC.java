package com.hasnat.practice;

public class FactorialBLC {
	public static long calculateFactorial(int x) {
		
		if(x==0) {
			return -2;
		}
		else if(x<0) {
			return -1;
		}
		else {
		int n=x;
		while(x>1) {
			n=n*(x-1);
			x--;
		}
		return n;
		}
	}
}
