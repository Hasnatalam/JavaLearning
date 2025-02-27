package com.hasnat.Multithread;

public class UserThread extends Thread{
	@Override
	public void run() {
		System.out.println("Child Thread is running");
	}
}
