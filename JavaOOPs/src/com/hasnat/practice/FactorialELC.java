package com.hasnat.practice;

import java.util.Scanner;

public class FactorialELC {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any no");
		int num =sc.nextInt();
		sc.close();
		long result =FactorialBLC.calculateFactorial(num);
		System.out.println("Factorial of "+num+" is "+result);
	}

}
