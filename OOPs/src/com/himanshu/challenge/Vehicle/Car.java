package com.himanshu.challenge.Vehicle;

public class Car extends Vehicle{
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	
	private int currentGear;

	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	
	private void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.changeGear(): "
				+ "Changed to " +this.currentGear+ " gear.");
	}
	
	private void changeVelocity(int speed, int direction) {
		move(speed, direction);
		System.out.println("Car.changeVelocity: "
				+ "Vehicle " +speed+" direction " +direction);
	}
}
