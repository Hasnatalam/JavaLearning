package com.hasnat.exceptionHandling;

import java.util.Scanner;

public class GreaterMarksExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int computer;
		int physics;
		int math;
		int chemistry;
		int hindi;
		try(sc){
			
			System.out.print("Enter computer marks :");
			computer = sc.nextInt();
			if (computer<0 ||computer>100 ) {
				throw new GreaterMarksException("Please enter valid computer marks ");
			}
			System.out.print("Enter pysics marks :");
			physics = sc.nextInt();
			if (physics<0 ||physics>100 ) {
				throw new GreaterMarksException("Please enter valid physics marks ");
			}
			
			System.out.print("Enter math marks :");
			math = sc.nextInt();
			if (math<0 ||math>100 ) {
				throw new GreaterMarksException("Please enter valid math marks ");
			}
			
			System.out.print("Enter chemistry marks :");
			chemistry = sc.nextInt();
			if (chemistry<0 ||chemistry>100 ) {
				throw new GreaterMarksException("Please enter valid chemistry marks ");
			}
			
			System.out.print("Enter Hindi marks :");
			hindi = sc.nextInt();
			if (hindi<0 ||hindi>100 ) {
				throw new GreaterMarksException("Please enter valid hindi marks");
				
			}
			int totalMarks = computer+math+physics+chemistry+hindi;
			int average = totalMarks/5;
			System.out.println("Your total marks is "+totalMarks);
			System.out.println("and your average is "+average);
			
		}
		
		catch(GreaterMarksException e) {
			System.err.println(e.getMessage());
		}
		
		
	}

}
