package com.hasnat.practice;

//BLC
public class Student 
{
	//Object Properties
 int rollNumber;   
 String studentName;
 double studentHeight;
 
 //Object Behavior
 public void talk()
 {
	   System.out.println("My roll Number is :"+rollNumber);
	   System.out.println("My name is :"+studentName);
	   System.out.println("and My Height is :"+studentHeight);	   
 }
 
 public void writeExam()
 {
	   System.out.println("I am "+studentName+". I write exam weekly");
 }	
}
