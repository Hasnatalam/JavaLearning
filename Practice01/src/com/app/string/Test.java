package com.app.string;

public class Test {
	public static void main(String[] args) {
		for(int i=0;i<1000;i++) {
			System.out.print("Checking Display ................"+i*i);
			if (i%5==0) {
				System.out.println();
			}
		}
	}
}
