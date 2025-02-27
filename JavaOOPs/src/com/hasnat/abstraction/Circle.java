package com.hasnat.abstraction;

public class Circle extends Shape{
	double radius;
	final double PI=3.14;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double area = PI*radius*radius; 
		return area;
	}

	@Override
	public void printDetails() {
		System.out.println("Type : Circle");
		System.out.println("Radius :"+radius);
	}
}
