package com.multithreading.synchronization.classlock;

public class DisplayMessage {

	public synchronized static void displayMessage(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Say hello, "+name);
		}
	}
	
}
