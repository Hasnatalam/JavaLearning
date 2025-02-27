package com.hasnat.polymorphism1;

public class LightDevice extends SmartHomeDevice{

	public LightDevice(String type) {
		super(type);
	}

	public void  dim(int brightness) {
		System.out.println("Light brightness is set to " + brightness + "%.");
	}
}
