package com.hasnat.polymorphism1;

public class SmartHomeDevice {
	private String type;
	private boolean status;
	public SmartHomeDevice(String type) {
		super();
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	 public void turnOn() {
	        if (!status) {
	            status = true;
	            System.out.println(type + " is turned on.");
	        } else {
	            System.out.println(type + " is already turned on.");
	        }
	    }

	    // Method to turn off the device
	    public void turnOff() {
	        if (status) {
	            status = false;
	            System.out.println(type + " is turned off.");
	        } else {
	            System.out.println(type + " is already turned off.");
	        }
	    }
}

