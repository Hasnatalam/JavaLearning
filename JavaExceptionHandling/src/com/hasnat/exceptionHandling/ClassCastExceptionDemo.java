package com.hasnat.exceptionHandling;

public class ClassCastExceptionDemo {
	public static void handleClassCastException() {
		Object arr[]= {"Hasnat",101,true,'A'};
		for(Object value : arr) {
			try {
				String str = (String)value;
				System.out.println(str);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		handleClassCastException();
	}

}
