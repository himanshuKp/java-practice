package com.himanshu.threads;

/**
 * @author himanshu 
 *
 */
public class ThreadsDemo2 implements Runnable{

	/**
	 * declared basic variables used to store values
	 */
	private String mesg;
	private int count;
	private Thread thread;
	
	/**
	 * count the number of times loop to run
	 */
	@Override
	public void run() {
		while(count-- > 0)
		{
			System.out.println(mesg);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				return;
			}
		}
		System.out.println(mesg+ " thread all done.");
	}
	
	
	/**
	 * @param message, message to display
	 * @param numberOfTimes, number to times to display message
	 */
	public ThreadsDemo2(String message, int numberOfTimes)
	{
		this.mesg = message;
		this.count = numberOfTimes;
		thread = new Thread(this);
		thread.setName(mesg + " thread running.");
		thread.start();
	}
	
	public static void main(String[] args) {
		new ThreadsDemo2("Hello from thread 1", 10);
		new ThreadsDemo2("Hello from thread 2", 10);		
	}

}
