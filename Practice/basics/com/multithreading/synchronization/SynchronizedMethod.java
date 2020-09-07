package com.multithreading.synchronization;

public class SynchronizedMethod {

	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();
		MyThread t1 = new MyThread(dm, "Himanshu");
		MyThread t2 = new MyThread(dm, "Pratibha");
		
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
