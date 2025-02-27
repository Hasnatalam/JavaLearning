package com.hasnat.inheritance;

public class Cylinder extends Circle
{
	private double height;
	
	public Cylinder () {
		
	}

	public Cylinder (double radius, double height ) {
		super(radius);
		this.height=height;
	}

	public double getVolume() {
		
		double volume = 2*super.getPI()*super.getRadius()*(super.getRadius()+height);
		return volume;
	}
}
