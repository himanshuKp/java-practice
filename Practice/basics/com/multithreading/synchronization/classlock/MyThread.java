package com.multithreading.synchronization.classlock;

public class MyThread extends Thread{

	String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		DisplayMessage.displayMessage(name);
	}
	
}
