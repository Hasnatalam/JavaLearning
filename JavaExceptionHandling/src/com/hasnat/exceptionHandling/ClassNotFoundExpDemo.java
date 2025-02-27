package com.hasnat.exceptionHandling;

import java.util.Scanner;

public class ClassNotFoundExpDemo {

	public ClassNotFoundExpDemo(String str) {
		try {
			Class.forName(str);
			System.out.println("Class "+str+" found :"+str);
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class " +str+ " found.");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter fully qualified claass name ");
		String str = sc.nextLine();
		
		@SuppressWarnings("unused")
		ClassNotFoundExpDemo obj = new ClassNotFoundExpDemo(str);
		sc.close();
	}

}
