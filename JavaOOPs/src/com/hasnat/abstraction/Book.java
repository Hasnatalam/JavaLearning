/*Program: 2
Create an abstract class Book class with following specifications:-
Instance Variables: 
title : String
Methods: 
setTitle(String): void : abstract , 
getTitle() :String
	
Create a sub classes of  Book called MyBook class with following specifications 
Methods: 
override setTitle from parent class.
        This method takes the book title as parameter and assigns it into the instance variable of parent class.
override getTitle from parent class.
 This method returns the name of the book in the format mentioned below in Sample Output.
Sample Input
A tale of two cities
Sample Output
The title of my book is: A tale of two cities
A class Testing is given to you with a main method. Use this class to test your solution's classes and methods.*/
package com.hasnat.abstraction;

public abstract class Book {
	String title;
	public abstract void setTitle(String books);
	
	public String getTitle() {
		return title;
	}
	
}
