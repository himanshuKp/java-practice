package com.himanshu.multithreading;

class MyThread extends Thread{
	public void start()
	{
		super.start();
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("child run method");
	}
}

class MyRunnable implements Runnable
{
	public void run() {
		System.out.println("Child run method");
	}
}

public class Test {

	public static void main(String[] args) {
//		MyThread myThread = new MyThread();
//		myThread.start();
//		System.out.println("Main method");
//		Exception in thread "main" java.lang.IllegalThreadStateException
//		myThread.start();j
		
//		by implementing runnable interface
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
		System.out.println("Main method");
	}

}
