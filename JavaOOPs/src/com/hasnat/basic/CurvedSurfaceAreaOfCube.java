package com.hasnat.basic;

//calculate the curved surface area of a cube? Formula-6*side Square.

public class CurvedSurfaceAreaOfCube{

	public static void main(String [] args){
	
		float side = Float.parseFloat(args[0]);
		System.out.println("Curved surface area of a cube = " + (side*side*6));		

	}
}
