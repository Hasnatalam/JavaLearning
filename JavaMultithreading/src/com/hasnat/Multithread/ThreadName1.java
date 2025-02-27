package com.hasnat.Multithread;
class ThreadStuff extends Thread{
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name+" Thread is running.....");
	}
}
public class ThreadName1 {
	public static void main(String[] args) {
		Thread t = new Thread();
		
		t.setName("Parent");
		ThreadStuff ts1 = new ThreadStuff();
		ThreadStuff ts2 = new ThreadStuff();
		ts1.setName("child1");
		ts2.setName("child2");
		ts1.start();  ts2.start();
		System.out.println(Thread.currentThread().getName()+" Thread is running!!");
	}
}
