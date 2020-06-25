package com.multithread.synchronize.method;

class Brackets {
	
//	preferred way to provide the lock
	private Object timingLock = new Object();
	
	public void generate() {
		synchronized (timingLock) {
			for (int i = 1; i < 10; i++) {

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (i < 5) {
					System.out.print("[");
				} else {
					System.out.print("]");
				}
			}
			System.out.println();
		}

//		for (int j = 0; j < 10; j++) {
//			try {
//				Thread.sleep(20);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}
}

public class App {

	public static void main(String[] args) {
		Brackets bracket = new Brackets();
		new Thread(new Runnable() {
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 0; i < 5; i++) {
					bracket.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Thread1: " + (endTime - startTime));
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 0; i < 5; i++) {
					bracket.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Thread2: " + (endTime - startTime));
			}
		}).start();
	}

}
