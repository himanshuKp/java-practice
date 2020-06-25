package com.multithreading.create;

class MyCounter extends Thread{
	private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		countMe();
	}

	public void countMe() {
		for(int i=0;i<9;i++) {
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("The value of i is: " +i+ " and the thread number is "+threadNo);
		}
	}
}

public class App {

	public static void main(String[] args) throws InterruptedException {
		
		MyCounter m1 = new MyCounter(1);
		MyCounter m2 = new MyCounter(2);
		
		long startTime = System.currentTimeMillis();
		m1.start();
		System.out.println("*****************************");
		m2.start();
		Thread.sleep(4700);
		long endTime = System.currentTimeMillis();
		System.out.println("Total time: "+(endTime-startTime));
		
	}

}
