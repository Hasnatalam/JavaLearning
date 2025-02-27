package com.hasnat.constructor3;

public class PanCard {
	private String panId;
	
	public PanCard() {
		this.panId="DOVRS3493K";
		//Person p1=new Person(this);
	}
	
	public void display() {
		System.out.println("Pan Id = "+panId);
	}
}
