package com.hasnat.constructor3;

public class B {
	private A obj;
	
	public B(A obj) {
		this.obj=obj;
	}
	
	public void display() {
		obj.show();
	}
}
