package com.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	private int vehicleId;

	public Vehicle(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle id: "+ vehicleId;
	}
	
}

class CarModel extends Vehicle {
	private String carModel;

	public CarModel(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	@Override
	public String toString() {
		return "CarModel: " + carModel + ", Vehicle id: " +getVehicleId();
	}
}

public class App {

	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<Vehicle>();
		list.add(new Vehicle(1));
		list.add(new Vehicle(2));
		list.add(new CarModel(3, "XZJ"));
		displayList(list);
	}

	public static void displayList(List<? super CarModel> list) {	//lowerbound
		for (Object element: list) {
			System.out.println(element);
		}
	}
	
//	public static void displayList(List<? extends Vehicle> list) {	//upperbound
//		for (Object element: list) {
//			System.out.println(element);
//		}
//	}
	
}
