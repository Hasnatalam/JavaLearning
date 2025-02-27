/*Create an abstract class Student with the following attributes.
Instance Variables: 
studentName: protected String
studentClass: protected String
totalNoOfStudents : protected static int
Instance Methods:
abstract public : getPercentage( ) with return type int 
static Method :
public static int getTotalNoStudents( )
Constructors:
No Argument constructor is a MUST.
Parameter constructor must initialize name and class and it also increase totalNoOfStudents.

Create a class ScienceStudent that inherits from Student. 
Add the following attributes
Instance variables:
physicsMarks: private int
chemistryMarks: private int
mathsMarks: private int
Methods:
Override, getPercentage() method to compute and return the percentage of marks(Max marks for a subject :100)

Create a class HistoryStudent that inherits from Student. 
Add the following attributes.
Instance variables: 
historyMarks: private int
civicsMarks: private int (Max Marks for a subject : 100)
Method:
Override getPercentage() method to computed and return the percentage of marks(Max marks for a subject :100)



Create an ELC class StudentTester with main method, use this class to test your code.
Test all the three classes and the abstract method implementation with different inputs.*/
package com.hasnat.abstraction;

public abstract class Student {
	protected String studentname;
	protected String studentClass;
	protected static int totalNumberOfClass;
	public abstract int getPercentage();
	public static int getTotalNoStudents() {
		return totalNumberOfClass;
	}
	
	public Student() {
		
	}

	public Student(String studentname, String studentClass) {
		super();
		this.studentname = studentname;
		this.studentClass = studentClass;
		totalNumberOfClass++;
	}
	
}













