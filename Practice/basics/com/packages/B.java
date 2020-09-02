package com.packages;

public class B {

	public static void main(String[] args) {
		
		A.a1();
		
//		to access non static method we have to create
//		an instance of A 
		A objA = new A();
		objA.a2();
//		possible to access static method using an instance of class
//		although recommended to access static method in static way
		objA.a1();
		
	}
	
}
