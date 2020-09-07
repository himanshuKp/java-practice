package com.multithreading.thread;

public class CheckProcessor implements Runnable {

	@Override
	public void run() {
		System.out.println("Check processor");
	}

	public static void main(String[] args) {
		// .start() does not supported by runnable interface 
		CheckProcessor cp = new CheckProcessor();
		Thread th = new Thread(cp);
		th.start();
	}

}
