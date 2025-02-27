package com.hasnat.polymorphism1;

public class MainSmart {
	public static void main(String[] args) {
        // Creating a LightDevice object to call the methods
        LightDevice light = new LightDevice("Light");
        light.turnOn();
        light.dim(50);

        // Creating a ThermostatDevice object to call the methods
        ThermostatDevice thermostat = new ThermostatDevice("Thermostat");
        thermostat.turnOn();
        thermostat.setTemperature(22);

        // Turning off the devices
        light.turnOff();
        thermostat.turnOff();
    }
	
}
