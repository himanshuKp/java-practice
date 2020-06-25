package com.multithread.synchronize;

public class App {

	public static int counter = 0;

	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i < 1001; i++) {
					App.counter++;
				}
				System.out.println("Value of counter in thread1 "+App.counter);
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i < 1001; i++) {
					App.counter++;
				}
				System.out.println("Value of counter in thread2 "+App.counter);
			}
		});

		thread1.start();
		thread2.start();
		
		Thread.sleep(2100);

		System.out.println(App.counter);
	}

}
