package com.hasnat.inheritance;

public class MainTicket {

	public static void main(String[] args) {
		
		Ticket regularTicket = new Ticket("Concert", 101, 50.0);
        VipTicket vipTicket = new VipTicket("VIP Concert", 201, 100.0, "Backstage Access");
        StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);
        
        
        regularTicket.regularTicketOutput();
        
        vipTicket.vipTicketOutput();
        
        studentTicket.studentTicketOutput();
	}

}
