package com.hasnat.inheritance;

public class Circle {
	private double radius;
	private final double PI = 3.14;
	
	public Circle() {

	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public double getArea() {
		if (radius<1) {
			return -1.0;
		}
		else {

			return (PI*radius*radius);
		}
	}
	
	public double getRadius() {
		return radius;
	}
	public double getPI() {
		return PI;
	}
}
