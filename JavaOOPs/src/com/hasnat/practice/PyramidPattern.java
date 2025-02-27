package com.hasnat.practice;

public class PyramidPattern {

	public static void main(String[] args) {
		int num=5;
		
		for(int r=0;r<num;r++) {
			for(int c=0;c<=num-r;c++) { 
				System.out.print(" ");
			}
			for(int k=1;k<=r*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int r=num;r>0;r--) {
			for(int c=0;c<=num-r;c++) { 
				System.out.print(" ");
			}
			for(int k=1;k<=r*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}
