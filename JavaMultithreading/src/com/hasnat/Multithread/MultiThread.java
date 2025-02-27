package com.hasnat.Multithread;

class Test extends Thread
{
	int a; //1 ->2
	public void run() {
		a++;
	}
}
public class MultiThread
{
	public static void main(String[] args) throws InterruptedException {
		Test test = new Test();
		test.run();
		System.out.println(test.a); //1
		test.start();
		test.join();
		System.out.println(test.a); //2
		Thread t=Thread.currentThread();
		System.out.println(t);
		System.out.println(test);
		System.out.println(test.isAlive());
		System.out.println(test.getName());		
	}
}
