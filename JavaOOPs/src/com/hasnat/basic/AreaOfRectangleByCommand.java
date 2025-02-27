package com.hasnat.basic;

public class AreaOfRectangleByCommand {
	public static void main (String [] args) {

		

		if (args.length < 2)

		System.out.println("\nPlease enter length and breadth of rectangle");

		else 
		{
		float num1 = Float.parseFloat(args[0]);

		float num2 = Float.parseFloat(args[1]);

		System.out.println("\nArea of rectangle "+ num1+ ":"+num2+ " = "+(num1*num2));

		}

		}

}
