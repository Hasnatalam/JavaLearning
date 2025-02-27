/*sum of digits of the given two digit number. program determined by the following rules:
if the given value is in between 10 and 99, return sum of it's digits. Example: if x = 34, print 7
if the given value is negative, print -3
if the given value is greater than 99, print -2
if the given value is in between 0 and 9, print -1*/
package com.hasnat.basic;

import java.util.Scanner;  

public class SumOfTwoDigitNumberUsingScannerClass {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any no between 10-99 :");
		int num = sc.nextInt();
		
		if(num > 9 && num < 100) {
			int lastDigit=num%10;
			num/=10;
			System.out.println("Sum of two digit num = "+(num+lastDigit));
		}
		else if(num < 0) System.out.println("-3");
		else if(num > 99) System.out.println("-2");
		else  System.out.println("-1");
		sc.close();
	}
}
