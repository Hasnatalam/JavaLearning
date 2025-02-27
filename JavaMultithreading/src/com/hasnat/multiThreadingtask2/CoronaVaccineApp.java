package com.hasnat.multiThreadingtask2;

public class CoronaVaccineApp {
	public static void main(String[] args) {
		VaccineEligibility v1 = new VaccineEligibility(17, true);
		DoseBooking d1 = new DoseBooking();
		VaccineEligibility v2 = new VaccineEligibility(19, true);
		DoseBooking d2 = new DoseBooking();

		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				User u1 = new User("Scott", v1, d1);
				u1.bookDose();
				u1.isDoseBooked();
			}
		};
		

		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				User u1 = new User("John", v2, d2);
				u1.bookDose();
				u1.isDoseBooked();
			}
		};
		new Thread(r1).start();
		new Thread(r2).start();
	}
}
