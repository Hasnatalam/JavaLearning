package com.hasnat.practice;


public class PelindromeBLC {

	
	public static boolean isPalindrome(int x) {
		int originalNum=x;
		int reverse=0;
		while(x>0) {
			reverse=reverse*10+x%10;
			x/=10;
		}
		if (originalNum == reverse) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
