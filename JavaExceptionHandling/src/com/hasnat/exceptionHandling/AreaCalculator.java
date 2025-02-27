package com.hasnat.exceptionHandling;

import java.util.Scanner;

public class AreaCalculator {

		public static double calculateArea(double length ,double weadth) {
			
			try {
				if(length<0 || weadth<0) {
					throw new IllegalArgumentException();	
				}
					
			}
			catch(IllegalArgumentException e){
				System.out.println("you have entered a negative values length :"+ length+" weadth :"+weadth);
			}
			return length*weadth;
		}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter length :");
		double len= sc.nextDouble();
		System.out.println("Enter weadth :");
		double wed = sc.nextDouble();
		System.out.println(calculateArea(len,wed));
		sc.close();
	}

}
