package com.practice.animal;

public class Animal {
	private int height;
	private int weight;
	private String animalType;
	private String bloodType;
	
	public Animal() {
//		super();
	}

	public Animal(int height, int weight, String animalType, String bloodType) {
//		super();
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getAnimalType() {
		return animalType;
	}

	public String getBloodType() {
		return bloodType;
	}
		
}
