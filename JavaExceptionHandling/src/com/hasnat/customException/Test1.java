package com.hasnat.customException;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a no");
		int no = sc.nextInt();
		try(sc){
			if(no < 0) throw new NegativeNumberException("Number is negative");
//			System.out.println("before exit");
//			System.exit(0);
			System.out.println(2/no);
			if (no==0) throw new ZeroNoException("No is zero");
		}
		catch (NegativeNumberException |ZeroNoException e) {
			System.err.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
	}
}
