package com.hasnat.exceptionHandling;

@SuppressWarnings("serial")
public class GreaterMarksException extends RuntimeException{
	public GreaterMarksException(String message){
		super(message);
	}
}
