package com.hasnat.lambdaExpressionAndFunctionalInterface;
@FunctionalInterface
interface MyFunction<T,R> {
	public R apply(T t);

}
public class MyFunctionalInterface{
	public static void main(String[] args) {
		MyFunction<String, String> m = s-> "Welcome to "+s;
		
		System.out.println(m.apply("Java"));
		
	}
}
