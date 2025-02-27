/*Define a method which returns true if the given three digit number is palindrome otherwise return false.

Write the method with the following specifications: 

Name of method : isPalindrome()
     Modifiers : public, static
   return type : boolean
      Argument : one argument of type integer

This method accepts an integer value as argument and 
return true if the given number is palindrome, else retrun false.*/

package com.hasnat.method;

import java.util.Scanner;

public class CheckingPelindromeByMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean result = isPalindrome(num);
		
		if (result) {
			System.out.println(num +" is a pelindrome no");
		}
		else {
			System.out.println(num +" is not a pelindrome no");
		}
		sc.close();
	}
	
	public static boolean isPalindrome(int x) {
		int originalNum=x;
		int reverse=0;
		while(x>0) {
			reverse=reverse*10+x%10;
			x/=10;
		}
		if (originalNum == reverse) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
