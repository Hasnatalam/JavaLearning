package com.hasnat.polymorphism1;

public class VoiceAssistantIntegration extends SmartHomeDevice {

	public VoiceAssistantIntegration(String type ) {
		super(type);
	}
	public void executeVoiceCommand(String command) {
		if(command == "turn on") {
			turnOn();
		}
		else if(command == "turn of") {
			turnOff();
		}
		
		else if(command == "set temprature") {
			System.out.println("Setting temprature");
		}
		else if(command == "dim") {
			System.out.println("Adjusting brightness");
		}
		else {
			System.out.println("Command not recognized");
		}
	}
	

}
