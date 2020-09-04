package com.polymorphism.runtime;

public class MacBookAir extends MacBook {

	@Override
	public void start() {
		System.out.println("MacBookAir start.");
	}

	@Override
	public void stop() {
		System.out.println("MacBookAir stop");
	}
	
}
