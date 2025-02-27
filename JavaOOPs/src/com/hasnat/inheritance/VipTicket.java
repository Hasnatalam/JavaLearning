package com.hasnat.inheritance;

public class VipTicket extends Ticket {
	private String specialAccess;
	
	public VipTicket(String eventName, int seatNumber,double price, String specialAccess) {
		super(eventName,seatNumber,price);
		this.specialAccess =specialAccess;
	}
	
	public String getSpecialAccess() {
		return specialAccess;
	}
	
	public void setSpecialAccess(String specialAccess) {
		this.specialAccess=specialAccess;
	}
	public void vipTicketOutput() {
		System.out.println("\nVIP Ticket:");
        System.out.println("Event: " + getEventName());
        System.out.println("Seat Number: " + getSeatNumber());
        System.out.println("Price: $" + getPrice());
        System.out.println("Student Discount: " + getSpecialAccess());
	}
}
