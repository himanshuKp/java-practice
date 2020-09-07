package com.multithreading.thread;

public class Multithread extends Thread{
	
	public static void main(String[] args) {

		Multithread mt = new Multithread();
		mt.start();
		
		Thread threadName = Thread.currentThread();
		System.out.println("Current thread: "+threadName.getName());
		
		for (int i = 0; i < 10; i++) {
			System.out.println("First loop: "+i);
		}
		
	}
	
	public void run() {
		Thread threadName = Thread.currentThread();
		threadName.setName("calculation thread");
		System.out.println("Thread entered: "+threadName.getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("Second loop: "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
