package com.hasnat.basic;

//Convert Celsius To Fahrenheit  

public class CelsiusToFahrenheit{

	public static void main(String [] args){
		
		float celsius = Float.parseFloat(args[0]);
		float fahrenheit=((9*celsius)/5)+32;

		System.out.println("Fahrenheit = " + fahrenheit);
	}
}