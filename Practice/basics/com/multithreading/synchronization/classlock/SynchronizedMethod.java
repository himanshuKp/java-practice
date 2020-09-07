package com.multithreading.synchronization.classlock;

public class SynchronizedMethod {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("Himanshu");
		MyThread t2 = new MyThread("Pratibha");
		
		t1.start();
		sleepThread();
		System.out.println("End of first thread");
		sleepThread();
		
		t2.start();
		sleepThread();
		System.out.println("End of second thread");
		sleepThread();
	
	}

	private static void sleepThread() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
