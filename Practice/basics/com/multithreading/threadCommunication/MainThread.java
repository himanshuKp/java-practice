package com.multithreading.threadCommunication;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

		CalculateSum cs = new CalculateSum();
		cs.start();
		
//		if we do not hold lock on child object, 
//		IllegalMonitorStateException is thrown
		synchronized (cs) {
			System.out.println("Main thread is waiting for child thread to complete calculation.");
			cs.wait();
			System.out.println("Main thread received notification from child.");
			System.out.println("Total sum: "+cs.total);
		}
	}

}
