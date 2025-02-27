package com.hasnat.multithreadingTask;

public class PetrolPumpSimulation {

	public static void main(String[] args) {
		PetrolPump p = new PetrolPump();
		Car car[] = {new Car("SKODA",p),new Car("Ferrari",p),new Car("RollsRoyce",p)};
		Thread threads [] = new Thread[car.length];
		
		for(int i=0;i<car.length;i++) {
			
		threads[i] = new Thread (car[i]);}
		
		for(Thread thread : threads) {
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
