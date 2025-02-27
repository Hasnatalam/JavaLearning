package com.hasnat.practice;

public class TestABLC {
	
	public static void primeNo(int x) {
		int c=0;
		for (int i=2;i<x;i++) {
			c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if (c==2) {
				System.out.println(i);
			
			}
		}
	}
}
