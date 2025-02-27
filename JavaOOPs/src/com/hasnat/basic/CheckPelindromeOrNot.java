/*print the given three digit number is palindrom or not 

Program is determined by the following rules:

if the given number is an three digit number, Example: if x = 232, print 1. if x = 345, print 0
if 1 then print a message that the number is palindrome
if 0 then print a message that the number is not a palindrome
if the given number is negative or zero, print -1
if -1 then print a message that the given number is -ve kindly provide the +ve number only
if the given number is not an three digit number, print -2
if -2 then print the message that this program can check the operation for the 3 number only.*/

package com.hasnat.basic;

import java.util.Scanner;

public class CheckPelindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.close();
		int temp = num,i;
		int reverse = 0;
		boolean result ;
		boolean isNegative = false ;
		boolean isThreeDigit = true;
		for(i=0; temp>0; i++) {
			reverse = reverse*10+(temp%10);
			temp/=10;
		}
		//System.out.println(reverse +"\t"+ temp +"\t"+ num +"\t"+ i);
		if(num==reverse && i==3) {
			System.out.println("1");
			result=true;
		}
		else {
			System.out.println("1");
			result=false;
		}
		
		if(result) {
			System.out.println("Pelindrome");
		}
		else System.out.println("Not a pelindrome");
		
		if(num<=0) {
			isNegative=true;
			System.out.println("-1");
		}
		if(isNegative)
			System.out.println("The given number is -ve kindly provide the +ve number only.");
		
		if(i!=3) {
			isThreeDigit=false;
			System.out.println("-2");
		}
		if(!isThreeDigit)System.out.println("This program can check the operation for the 3 number only.");
		
		
		sc.close();

	}
}














