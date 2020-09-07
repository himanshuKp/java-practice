package com.exception.custom;

public class Main {

	public static void main(String[] args) {
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				throw new MyThreadException("MY custom exception");
			}	
		
	}
	
}
