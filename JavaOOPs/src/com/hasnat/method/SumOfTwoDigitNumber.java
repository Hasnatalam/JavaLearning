/*Define a method which returns the sum of digits of the given two digit number.

Write the method with the following specifications: 

Name of method : getSumOfDigits()
     Modifiers : public, static
   return type : int
      Argument : three arguments of type integer  


This method accepts an integer value as argument and return the sum of it's digits.

Specifications: The value returned by the method getSumOfdigits() is determined by the following rules:

if the given value is in between 10 and 99, return sum of it's digits. Example: if x = 34, return 7
if the given value is negative, return -3
if the given value is greater than 99, return -2
if the given value is in between 0 and 9, return -1
*/

package com.hasnat.method;

import java.util.Scanner;

public class SumOfTwoDigitNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter two digit  number");
		int num = sc.nextInt();
		int result = getSumOfDigits(num);
		System.out.println(result);
		
		sc.close();
	}
	
	public static int getSumOfDigits(int x) {
		if(x<0) {
			return -3;
		}
		else if(x>99) {
			return -2;
		}
		else if (x>=0 && x<=9) {
			return -1;
		}
		else {
			int r=x%10;
			x/=10;
			return x+r;
		}
	}

}


