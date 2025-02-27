package com.hasnat.basic;

//Calculate the total surface area of a cylinder? Formula- 2 pi square r * 2 pi r h (take the pi as 3.14).

public class SurfaceAreaOfCylinder{

	public static void main(String [] args){
		
		float radius = Float.parseFloat(args[0]);
		float height = Float.parseFloat(args[1]);
		System.out.println("Surface area of a cylinder = " + (2*3.14*radius*(radius+height)));
	}

}