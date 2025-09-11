package com.hasnat.interviewPurpose;

public class Reverse {
	public static void main(String[] args) {
		int num = 1234;
		int reverse=0;
		while(num>0) {
			reverse = reverse*10+num%10;
			num/=10;
		}
		System.out.println(reverse);
	}
}
