/*Write a java program which print the next multiple of 100 for the given number.
Program is determined by the following rules:

if the given value is negative or zero, return -1
if the given value is positive, return the next multiple of the given number. Example: if x = 123, return 200.*/

package com.hasnat.basic;

import java.util.Scanner;

public class NextMultipleOf100 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any positive no 1-999");
	int num = sc.nextInt();
	
	
	if (num > 999)
		System.err.println("Please enter between 1-999");
	else if(num > 0) {
		int  reminder = num%100;
		if(reminder>0) {
			System.out.println(num/100*100+100); 
		}
	}
	else System.err.println("-1");

	sc.close();
	}
}
