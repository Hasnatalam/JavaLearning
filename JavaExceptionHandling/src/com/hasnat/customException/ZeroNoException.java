package com.hasnat.customException;

@SuppressWarnings("serial")
public class ZeroNoException extends RuntimeException{
	public ZeroNoException(String msg){
		super(msg);
	}
}
