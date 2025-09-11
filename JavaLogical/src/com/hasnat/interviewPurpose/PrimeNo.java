package com.hasnat.interviewPurpose;

public class PrimeNo {
	public static void main(String[] args) {
		int n =2;
		if (n==1) { System.out.println(n+" is not a prime");return;}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(n+" is not a prime no");
				return;
			}
		}
		System.out.println(n+" is a prime no");
	}
}
