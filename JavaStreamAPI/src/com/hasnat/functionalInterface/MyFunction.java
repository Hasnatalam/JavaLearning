package com.hasnat.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MyFunction {
	public static void main(String[] args) {
		Function<String,String> function = str->str+" from function";
		System.out.println(function.apply("Hello World"));
		Function<Integer,Integer> square = n-> n*n;
		System.out.println(square.apply(10));
		
		BiFunction<Integer,Integer,Integer> multiplication = (n1,n2)->n1*n2;
		System.out.println(multiplication.apply(2, 4));
		BiFunction<Integer,String,String> alphaNumeric = (n,str)->n+" "+str;
		System.out.println(alphaNumeric.apply(1, "Hasnat"));
		
		UnaryOperator<String> unary= str-> str+" UnaryOperator";
		System.out.println(unary.apply("Hello World"));
		
		BinaryOperator<String> binary = (str1,str2)->str1+" "+str2+" BinaryOperator";
		System.out.println(binary.apply("Hello", "world"));
		
	}
}
