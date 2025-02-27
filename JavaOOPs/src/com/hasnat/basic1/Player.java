package com.hasnat.basic1;


public class Player {
	String name;
	int jerseyNo;
	String sport;
	
	public void details() {
		System.out.println("Player Name is : "+name);
		System.out.println("Player Jersey no is : "+jerseyNo);
	}
	public void sports() {
		System.out.println(name+" plays "+sport);
	}
	
}
