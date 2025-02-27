package com.hasnat.Multithread;
class AllTestThread extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		String name = t.getName();
		System.out.println(name+"Before sleep");
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			System.out.println("Can,t apply sleep");
		}
	}
}
public class UseOfAllMethodForMultiThread {
	public static void main(String[] args) {
		AllTestThread thread = new AllTestThread();
		thread.setName("Test Thread");
		thread.start();
		
	}
	
}
