package com.hasnat.multithreading2;

//import java.util.Scanner;

public class TicketReservationWithLembda {
	static int availableSeat = 2;

	public static void main(String[] args) {
		Runnable passenger = () -> {
			String name = Thread.currentThread().getName();
			try {
				if (availableSeat >= 1) {
				System.out.println("Seat no "+availableSeat-- +" allocated for "+ name );
				} 
				else {
				throw new SeatBookedExcepton("Sorry "+name+" seat is not  available");
				}
			}
			catch(SeatBookedExcepton e) {
				System.err.println(e.getMessage());
			}
		};
		Thread t1 = new Thread(passenger,"Hasnat");
		
		Thread t2 = new Thread(passenger,"Ibkar");
		Thread t3 = new Thread(passenger,"Salim");
		t1.start();
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
			System.out.println("Sleep method interrupted");
		}
		t2.start(); 
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
			System.out.println("Sleep method interrupted");
		}
		t3.start();
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Enter No pf person :"); int num =sc.nextInt();
		 * System.out.print("Enter name persons :"); String arr [] = new String[num];
		 * for(int i=0;i<num;i++) { arr[i]=sc.next(); ; }
		 * 
		 * for(int i=0;i<num;i++) { Thread t = new Thread(passenger,arr[i]); t.start();
		 * ; } sc.close();
		 */
	}
}
