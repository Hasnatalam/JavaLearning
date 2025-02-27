package com.hasnat.Multithread;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("main thread started");
		UserThread ut = new UserThread();
		ut.start();
		System.out.println("main thred is ended");
	}

}
