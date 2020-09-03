package com.inheritance.hierarchical;

public class Car extends Vehicle {

	@Override
	String fuel() {
		System.out.println("Car child class "+this);
		return "Diesel";
	}
	
}
