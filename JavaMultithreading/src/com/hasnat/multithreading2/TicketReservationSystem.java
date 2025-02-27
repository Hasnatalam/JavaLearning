package com.hasnat.multithreading2;
class Customer implements Runnable{
	int availableSeat = 1;
	int wantedSeat;
	
	public Customer(int i) {
		wantedSeat = i;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		if(availableSeat >= wantedSeat) 
		{   
			System.out.println("Berth is located for "+name);
			availableSeat-=wantedSeat;
		}
		else {
			System.err.println("Sorry "+name+" seat is not available!!!");
		}
	}
	
}
public class TicketReservationSystem {

	public static void main(String[] args)throws Exception {
		Customer c = new Customer(1);
		
		Thread t1 = new Thread(c,"Hasnat");
		Thread t2 = new Thread(c,"Ibkar");
		try {
			t1.start();	t1.join();	

			t2.start();
		}
		catch(Exception e) {
			System.out.println("Thread is not starting");
		}
	}

}
