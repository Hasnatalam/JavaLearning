package com.hasnat.lembdaExpression;
@FunctionalInterface
interface Nit
{ 
	String myInterface(String a); //abstract method
	@Override
	String toString(); //Object class method
	//void wait();
	//void notify();
}
class  Predefinedmethod implements Nit
{
	public String myInterface(String a) {
		return a+" alam";
	}
}
public class Test{
	public static void main(String[] args) {
		Nit n= new Predefinedmethod();
		System.out.println(n.myInterface("Hasnat"));
		
	}
}

interface i1{
	void m1();
	public static void m2() {
		
	}
	@SuppressWarnings("unused")
	private static void m3() {
		
	}
	public default  void m4() {
		
	}
	@SuppressWarnings("unused")
	private  void m5() {
		
	}
}