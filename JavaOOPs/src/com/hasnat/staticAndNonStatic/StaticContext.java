package com.hasnat.staticAndNonStatic;



public class StaticContext {
	
	int a;
	
	
	{
		System.out.println(a);
	}
	
	StaticContext(){
		this(5);
		System.out.println("StaticContext.StaticContext()- 0 args");
	}
	StaticContext(int i){
		i=a;
		System.out.println("StaticContext.StaticContext()- 1 args");
	}


	public static void main(String[] args) {
		StaticContext staticContext = new StaticContext();
		StaticContext staticContext1 = new StaticContext();
		throw new ArithmeticException();
	}
	
	
}


