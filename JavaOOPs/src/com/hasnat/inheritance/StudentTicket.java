package com.hasnat.inheritance;

public class StudentTicket extends Ticket {
	private boolean studentDiscount;
	public StudentTicket(String eventName, int seatNumber,double price, boolean studentDiscount) {
		super(eventName,seatNumber,price);
		this.studentDiscount = studentDiscount;
	}
	public boolean isStudentDiscount() {
		return studentDiscount;
	}
	public void setStudentDiscount(boolean studentDiscount) {
		this.studentDiscount = studentDiscount;
	}
	public void studentTicketOutput() {
		System.out.println("\nStudent Ticket:");
        System.out.println("Event: " + getEventName());
        System.out.println("Seat Number: " + getSeatNumber());
        System.out.println("Price: $" + getPrice());
        System.out.println("Student Discount: " + studentDiscount);
	}
}
