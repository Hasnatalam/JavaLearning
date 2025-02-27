package com.hasnat.multithreadingTask;

public class PetrolPump {
	
	public synchronized void refillCar(String carName) {
		System.out.println(carName+" has Started refilling");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(carName+" has Completed refilling\n");
	}
}
