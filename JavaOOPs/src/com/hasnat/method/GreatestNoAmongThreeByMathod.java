/*Define a method which returns the greatest number among three numbers.

Write the method with the following specifications: 

Name of method : getGretest()
     Modifiers : public, static
   return type : int
      Argument : three arguments of type integer  

This accepts Three integer values as argument and return the greatest value.

Arguments: three arguments of type integer
Return Type: an integer value 

Specifications: The value returned by the method getGreatest() is dEnter First no ");
		int num1 = sc.nextInt();
		Systemetermined by the following rules:

if any of the given numbers are negative, return -1.
if any of the given numbers are zero, return -2.
if the given numbers are positive, return the greatest.*/
package com.hasnat.method;

import java.util.Scanner;

public class GreatestNoAmongThreeByMathod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no ");
		int num1 = sc.nextInt();
		System.out.println("Enter second no ");
		int num2 = sc.nextInt();
		System.out.println("Enter third no ");
		int num3 = sc.nextInt();
		sc.close();
		int greatest=getGretest(num1,num2,num3);
		System.out.println("The greatest no is "+ greatest);
		
	}
	
	public static int getGretest(int x, int y, int z) {
		
		
		
		 if (x>y && x>z) {
			return x;
		}
		else if (y>z && y>x) {
			return y;
		}
		else return z;
	}

}
