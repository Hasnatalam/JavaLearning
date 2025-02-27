package com.hasnat.exceptionHandling;

import java.util.Scanner;

public class DivisionExample {

	public static void performDivision(int dividend ,int divisior) {
		try{
			System.out.println("Result of division is "+dividend/divisior);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception caught "+"dividend :"+dividend+" divisior :"+divisior);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2= sc.nextInt();
		performDivision(num1,num2);
		sc.close();
	}

}
