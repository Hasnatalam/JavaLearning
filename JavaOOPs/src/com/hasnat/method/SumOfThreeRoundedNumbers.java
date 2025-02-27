/*Define a method which returns the sum of three rounded numbers.
 *  If the right most digit of the number is less than 5, 
 *  then round off it's value to the previous multiple of 10 
 *  otherwise if the right most digit of the number is greater or equal to 5, 
 *  then round off to the next multiple of 10. 

Write the method with the following specifications: 

Name of method : sumOfRoundedValues()
     Modifiers : public, static
   return type : int
      Argument : three arguments of type integer  

This method accepts three integer values as argument and return the sum of three rounded numbers.
Example
if a = 23, b = 34, c = 66
   20 + 30 + 70 = 120
if a = 23, b = 37, c = 55
   20 + 40 + 60 = 120
Arguments: three argument of type integer
Return Type: an integer value 

Specifications: The value returned by the method sumOfRoundedValues() is determined by the following rules:

if any of the given number is negative or zero, return -1.
if any of the given numbers right most digit is of the number is less than 5, then round off it's value to the previous multiple of 10 
otherwise if the right most digit of the number is greater or equal to 5, then round off to the next multiple of 10. */
package com.hasnat.method;

import java.util.Scanner;

public class SumOfThreeRoundedNumbers {
	public static void main(String[] args) {
	
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter first numbers");
		int num1 = sc.nextInt();
		System.out.println("Enter second numbers");
		int num2 = sc.nextInt();
		System.out.println("Enter third numbers");
		int num3= sc.nextInt();
		
		if (num1<1 ||num2<1 ||num3<1) {
			System.out.println("-1");
		}
		
		else {
			int result =sumOfRoundedValues(num1, num2, num3);
			System.out.println(result);
		}
		sc.close();
	}
		
		public static int sumOfRoundedValues(int x, int y, int z) {
			if(x%10<5) {
				x=x/10*10;
			}
			else {
				x=(x/10+1)*10;
			}
			if(y%10<5) {
				y=y/10*10;
			}
			else {
				y=(y/10+1)*10;
			}
			if(z%10<5) {
			z=z/10*10;
			}
			else {
				z=(z/10+1)*10;
			}
			//System.out.println(x+y+z);
			int sum=x+y+z;
			return sum;
			
		
		
	}
}




