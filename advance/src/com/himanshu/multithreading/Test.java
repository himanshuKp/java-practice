package com.himanshu.multithreading;

class MyThread extends Thread{
//	public void start()
//	{
//		super.start();
//		System.out.println("Current thread in mythread: " +currentThread().getName());
//		System.out.println("start method");
//	}
	public void run()
	{
//		System.out.println("Current thread run() method in mythread: " +currentThread().getName());
//		System.out.println("child run method");
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread name: "+Thread.currentThread().getName()+". Thread priority: " +Thread.currentThread().getPriority());
		}
	}
}

class MyRunnable implements Runnable
{
	/**
	 * run method by child thread which extends runnable interface ( only one method run())
	 */
	public void run() {
		System.out.println("Child run method");
	}
}

public class Test {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
//		set priority of the thread to specific between 1 to 10 only
		myThread.setPriority(7);
//		start new child thread, till here only one thread
		myThread.start();
//		now there are two threads, main and child
		
//		myThread.setPriority(6);
//		System.out.println("Main thread");
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread name: "+Thread.currentThread().getName()+". Thread priority: " +Thread.currentThread().getPriority());
		}
		//		System.out.println("Main method");
//		Exception in thread "main" java.lang.IllegalThreadStateException
//		myThread.start();j
		
//		by implementing runnable interface
//		MyRunnable myRunnable = new MyRunnable();
//		Thread thread1 = new Thread();
//		Thread thread2 = new Thread(myRunnable);
//		case 1: a new thread will be created, responsible for execution of
//		thread class run() method, which has empty implementation
//		thread1.start();
//		case 2: no new thread will be created
//		thread class run() method will be executed like a normal method
//		thread1.run();
//		case 3: a new thread will be created, responsible for execution of
//		myRunnable run() method
//		thread2.start();
//		case 4: a new thread won't be created and myRunnable run()
//		method will be executed like a normal method call
//		thread2.run();
//		case 5: we will get compile time error, myRunnable doesn't have
//		start capability
//		myRunnable.start(); //CE error
//		case 6: no new thread will be created and myRunnable run()
//		method will be executed like a normal method call
//		myRunnable.run();
//		System.out.println("Current thread: " +Thread.currentThread().getName());
//		change the name of current thread
//		Thread.currentThread().setName("Himanshu main thread");
//		System.out.println("Current thread: " +Thread.currentThread().getName());
//		System.out.println("Main method");
//		System.out.println(10/0);
		
	}

}
