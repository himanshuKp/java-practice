package com.abstraction;

// if a child class in marked as final abstract class, then 
// it needs to override all the declared abstract methods in parent
// if parent class is not abstract, no need to override all methods
public final class ThreeSeries extends BMW {

//	need to override abstract method in super class
//	if we don't want to override abstract method in super class, declare 
//	current class as abstract
	@Override
	void accelerate() {
		System.out.println("Three series acceleration");
	}

	@Override
	void decelerate() {
		System.out.println("Decelrating three series.");
	}
	
}
