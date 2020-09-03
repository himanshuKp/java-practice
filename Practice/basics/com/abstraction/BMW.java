package com.abstraction;

// we cannot mark an abstract class as final
public abstract class BMW {

	void commonFunctionality() {
		System.out.println("Non abstract bmw method");
	}
	
//	cannot be marked as static
//	because we need specific implementation of abstract in child class
//	class needs to be abstract to declare a method as abstract
	abstract void accelerate();
	
	abstract void decelerate();
	
}
