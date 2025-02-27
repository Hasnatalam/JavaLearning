package com.hasnat.practice;

//ELC
public class StudentDemo 
{
	public static void main(String[] args)
	{
		Student raj = new Student();
		
		//Initializing the object properties
		raj.rollNumber = 111;
		raj.studentName = "Raj Gourav";
		raj.studentHeight = 5.9;
		
		//call the behavior
		raj.talk();
		raj.writeExam();	
		
		System.out.println("....................");
		
		Student priya = new Student();
		
		//Initializing the Object Properties
		priya.rollNumber = 222;
		priya.studentName = "Priya";
		priya.studentHeight = 5.8;
		
		priya.talk();
		priya.writeExam();
		
	}

}
