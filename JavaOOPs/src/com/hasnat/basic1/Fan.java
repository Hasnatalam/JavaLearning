package com.hasnat.basic1;

public class Fan {
	String name;
	String coil;
	int wings;
	
	public void fanData() {
		System.out.println("Fan brand name is  : "+name);
		System.out.println("Fan coil type is   : "+coil);
		System.out.println("No of wings in Fan : "+wings);
	}
	
	public void switchOn() {
		System.out.println("\nSwitch is on Fan is rotating.\n");
	}
	
	public void switchOf() {
		System.out.println("Switch is on Fan is rotating.");
	}
}
