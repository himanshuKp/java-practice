package com.multithreading.threadCommunication;

public class CalculateSum extends Thread{

	int total;

	@Override
	public void run() {
		
		System.out.println("Child thread is calculating the sum.");
		
		synchronized(this){
			for (int i = 0; i < 10; i++) {
				total += i;
			}
			this.notify();
		}
		
	}
	
	
	
}
