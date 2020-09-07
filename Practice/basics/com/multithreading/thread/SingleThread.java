package com.multithreading.thread;

public class SingleThread {
	public static void main(String[] args) {
		
		SingleThread st = new SingleThread();
		st.anotherLoop();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("First loop: "+i);
		}
	}
	
	void anotherLoop() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Second loop: "+i);
		}
	}
	
}
