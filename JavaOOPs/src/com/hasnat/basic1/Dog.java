//BLC
package com.hasnat.basic1;

public class Dog {
	
	String name ;
	int age ;
	double height ;
	
	public void getDogInformation() {
		System.out.println("Dog name is "+name);
		System.out.println("Dog age is "+age);
		System.out.println("Dog height is "+height);
	}
	public void bark(){
		System.out.println("The dog name is "+name+" "+name+" barks at night daily");
	}
}
