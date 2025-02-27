package com.hasnat.basic;

//Convert Fahrenheit To Celsius

public class FahrenheitToCelsius{

	public static void main(String [] args){
		
		float fahrenheit = Float.parseFloat(args[0]);
		float celsius=(fahrenheit-32)*5/9;

		System.out.println("Celsius = " + celsius);
	}
}
