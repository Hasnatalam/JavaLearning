package com.hasnat.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter first no");
			int a = sc.nextInt();
			System.out.println("Enter second no");
			int b = sc.nextInt();
			
			System.out.println("You enterd a : "+a+ " b : "+b);
			
		}
		catch(InputMismatchException e){
			System.out.println("\n\n"+e);
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println("Please enter appropriate message");
			e.printStackTrace();
		}
		sc.close();
	}

}
