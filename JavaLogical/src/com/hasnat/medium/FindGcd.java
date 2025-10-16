package com.hasnat.medium;

public class FindGcd {
	public static void main(String[] args) {
		int arr [] = {4,8,10};
		
		int gcd = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			int a=arr[i];
			int b=gcd;
			while(b!=0) {
				int temp=b;
				b = a%b;
				a=temp;
			}
			gcd=a;
		}
		System.out.println(gcd);
	}
}
