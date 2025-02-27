package com.hasnat.constructor3;

public class A {
	private int data=15;
	
	public A() {
		B obj = new B(this);
		obj.display();
	}
	
	public void show() {
		System.out.println(data);
	}
}
