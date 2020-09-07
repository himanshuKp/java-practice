package com.multithreading.synchronization;

public class DisplayMessage {

	public synchronized void displayMessage(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Say hello, "+name);
		}
	}
	
}
