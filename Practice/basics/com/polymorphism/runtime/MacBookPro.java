package com.polymorphism.runtime;

public class MacBookPro extends MacBook {

	@Override
	public void start() {
		System.out.println("MacBookPro start");
	}

	@Override
	public void stop() {
		System.out.println("MacBookPro stop");
	}
	
	public void macProMethod() {
		System.out.println("Macbook pro method");
	}
	
}
