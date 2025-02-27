package com.hasnat.abstraction;

public class CakeMain {
	
	public static void main(String[] args) {
		Cake c = null;
		c = new OrderedCake();
		c.showCake();
		c = new OrderedCake("round","flavour",2);
		c.showCake();
		c = new OrderedCake("round","flavour",3,"Happy Birth day");
		c.showCake();
		
		
	}
}
