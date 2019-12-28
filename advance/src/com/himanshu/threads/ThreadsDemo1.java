package com.himanshu.threads;

/**
 * @author root
 *
 */
public class ThreadsDemo1 extends Thread{

	private String msg;
	private int count;
	
	/**
	 * run does the work, print a message, "Count" number of times loop has run
	 */
	public void run() {
		while(count-- > 0)
		{
			System.out.println(msg);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
				return;
			}
		}
		System.out.println(msg+" all done.");
	}
	
	/**
	 * @param msg, message to display
	 * @param count, how many times to display it
	 */
	public ThreadsDemo1(String msg, int count) {
	this.msg = msg;
	this.count = count;
	System.out.println(msg+ " runner thread");
	}

	
	public static void main(String[] args) {
		new ThreadsDemo1("Hello from X",10).start();
		new ThreadsDemo1("Hello from Y",10).start();
	}
}
