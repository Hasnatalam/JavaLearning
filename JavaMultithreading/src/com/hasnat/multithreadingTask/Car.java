package com.hasnat.multithreadingTask;

public class Car implements Runnable {
	private String name;
	private PetrolPump petrolPump;
	
	public Car(String name,PetrolPump petrolPump) {
		super();
		this.name = name;
		this.petrolPump = petrolPump;
	}

	@Override
	public void run() {
		petrolPump.refillCar(name);
	}

}
