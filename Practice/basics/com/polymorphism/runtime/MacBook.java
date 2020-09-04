package com.polymorphism.runtime;

public class MacBook implements Apple {

	@Override
	public void start() {
		System.out.println("Start MacBook");
	}

	@Override
	public void stop() {
		System.out.println("Stop MacBook");
	}

}
