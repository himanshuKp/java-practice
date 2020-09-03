package com.abstraction.challenge;

public abstract class Dell implements TouchScreenLaptop {

	@Override
	public void scroll() {
		System.out.println("Dell laptop scrolling");
	}

}
