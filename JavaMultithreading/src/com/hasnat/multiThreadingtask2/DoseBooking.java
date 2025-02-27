package com.hasnat.multiThreadingtask2;

public class DoseBooking {
	private boolean booked;
	
	public void bookDose() throws Exception {
		if(booked) {
			throw new Exception("Dose is already booked");
		}
		else booked = true;
	}
	public boolean isDoseBooked() {
		return booked;
	}
}
