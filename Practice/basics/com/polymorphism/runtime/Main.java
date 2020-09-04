package com.polymorphism.runtime;

public class Main {

	public static void main(String[] args) {
		Apple device1 = new MacBookPro();
		Apple device2 = new MacBookAir();
		
		device1.start();
		
		device2.start();
		
//		a custom method in child class macbookpro
//		we cannot call a method defined in child class by creating
//		a child class instance
//		using a parent class reference, we have to downcast the object
		MacBookPro proObject = (MacBookPro) device1;
		proObject.macProMethod();
		
	}

}
