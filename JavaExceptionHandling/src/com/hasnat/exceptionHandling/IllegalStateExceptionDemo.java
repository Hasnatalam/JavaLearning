package com.hasnat.exceptionHandling;

public class IllegalStateExceptionDemo {

	static void throwIllegalException( ) { 
		try{ 
			throw new IllegalStateException("MyException"); 
		} catch(IllegalStateException objA){
			System.err.println("caught:" +objA); 
		}
	    }
	
	public static void main(String[] args) {
		System.out.println("Calling throwIllegalException from main method:");
		IllegalStateExceptionDemo.throwIllegalException();
	}

}
 