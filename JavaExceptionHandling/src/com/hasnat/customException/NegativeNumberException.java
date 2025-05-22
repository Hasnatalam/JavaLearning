package com.hasnat.customException;

@SuppressWarnings("serial")
public class NegativeNumberException extends Exception{
	public NegativeNumberException(String msg) {
		super(msg);
	}
}
