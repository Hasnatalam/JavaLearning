package com.hasnat.basic1;

public class FanElc {

	public static void main(String[] args) {
		Fan bajaj = new Fan();
		
		bajaj.name = "Bajaj";
		bajaj.coil = "verticle";
		bajaj.wings = 3;
		
		bajaj.fanData();
		bajaj.switchOn();
		bajaj.switchOf();
		
	}

}
