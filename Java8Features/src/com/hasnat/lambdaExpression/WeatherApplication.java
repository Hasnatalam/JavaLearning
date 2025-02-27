package com.hasnat.lambdaExpression;

import java.util.Scanner;
import java.util.function.Function;

public class WeatherApplication {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operataion \nFor Fahrenheit : F\nFor Celisius : C");
		char operation = sc.next().charAt(0);
		double value = sc.nextDouble();
		
		Function <Double,Double> celsius = v ->(value-32)/1.8;
		
		Function <Double,Double> fahrenheit = v ->(value*1.8+32);
		
		if(operation == 'F'||operation == 'f'){
		System.out.println(celsius.apply(value));
		}
		else if(operation == 'C'||operation == 'c'){
			System.out.println(fahrenheit.apply(value));
			}
		else System.err.println("Enter correct operation");
		sc.close();
		
	}
}