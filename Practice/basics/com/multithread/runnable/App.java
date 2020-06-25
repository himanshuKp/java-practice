package com.multithread.runnable;

class MyClass implements Runnable {
	private int myCounter;

	public MyClass(int myCounter) {
		this.myCounter = myCounter;
	}

	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("Value of i is "+i+" and the thread no is "+myCounter);
		}
	}
	
}

public class App {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new MyClass(1));
		Thread thread2 = new Thread(new MyClass(2));
		
		thread1.start();
		thread2.start();
		
	}

}
