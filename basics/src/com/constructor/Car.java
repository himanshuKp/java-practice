package com.constructor;

public class Car {
	int seats;
	int wheels;
	double weight;
	double mileage;
	
	Car(){
		mileage = 5;
	}
	
	Car(int wheels){
		this.wheels = wheels;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(4);
		System.out.println("Wheels: " + c2.wheels);
	}
	
}
