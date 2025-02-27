package com.hasnat.abstraction;

public class Triangle extends Shape {
	double base;
	double height;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		double area= 0.5*base*height;
		return area;
	}

	@Override
	public void printDetails() {
		System.out.println("Type : Triangle");
		System.out.println("Base :"+base);
		System.out.println("Height :"+height);
	}

}
