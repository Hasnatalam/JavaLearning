package com.hasnat.multiThreadingtask2;

public class User {
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;
	
	
	
	public User(String name, VaccineEligibility eligibility, DoseBooking doseBooking) {
		super();
		this.name = name;
		this.eligibility = eligibility;
		this.doseBooking = doseBooking;
	}
	public void bookDose() {
		if(eligibility.isEligiable()) {
			try {
				doseBooking.bookDose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else System.out.println("Sorry "+this.name+" You are not eligible for vacination");
	}
	public void isDoseBooked() {
		if(doseBooking.isDoseBooked()) {
			System.out.println(this.name+" your vacination appintment booked ");
		}
	}
	
}
