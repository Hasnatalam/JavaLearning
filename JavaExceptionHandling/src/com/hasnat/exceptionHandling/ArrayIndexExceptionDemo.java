package com.hasnat.exceptionHandling;

public class ArrayIndexExceptionDemo {
	public static void main(String[] args) {

		int arr[] = new int[2];

		try {
			System.out.println(arr[3]);
		} 
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e);
		}

	}
}
