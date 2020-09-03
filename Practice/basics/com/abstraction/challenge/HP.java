package com.abstraction.challenge;

// an abstract class need not to implement all the methods in
// the implemented interface
public abstract class HP implements TouchScreenLaptop {

	@Override
	public void scroll() {
		System.out.println("HP laptop scrolling");
	}

}
