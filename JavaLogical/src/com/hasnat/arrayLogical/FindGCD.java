package com.hasnat.arrayLogical;

import java.util.Arrays;

public class FindGCD {
	public static void main(String[] args) {
		int gcd=1;
		int arr[]= {350,250,150};
		Arrays.sort(arr);
		//System.out.println(arr[0]);
		for(int i=1;i<=arr[0];i++) {
			//System.out.println(i);
			boolean flag=true;
			for(int j=0;j<arr.length;j++) {
				//150,250,350
				if(arr[j]%i!=0) {
					flag=false;break;
				}
			}
			if(flag) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}
