package com.hasnat.polymorphism1;

public class MainSmartHome {
	public static void main(String[] args) {
		VoiceAssistantIntegration vi = new VoiceAssistantIntegration("Voice Assistant");
		vi.executeVoiceCommand("turn on");
		vi.executeVoiceCommand("set temprature");
		vi.executeVoiceCommand("dim");
		vi.executeVoiceCommand("turn of");
	}
}
