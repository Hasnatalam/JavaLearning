package com.hasnat.Multithread;

class Foo extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Child Thread is running");
		System.out.println("It is running with seprate stack");
	}
}
public class IsAlive {
	public static void main(String[] args)throws IllegalAccessException {
		System.out.println("Main thread is started");
		Foo f = new Foo();
		
		System.out.println("Thread has not started yet so :"+f.isAlive());
		f.start();
		System.out.println("Thread has  started so :"+f.isAlive());
		//f.start();  //we can't restart a thread it will throw illeThreadState Exception
	}
}
