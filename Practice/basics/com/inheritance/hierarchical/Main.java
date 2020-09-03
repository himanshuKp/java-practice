package com.inheritance.hierarchical;

public class Main {

	public static void main(String[] args) {
		
//		call the child car object
		Car child1 = new Car();
		System.out.println(child1.fuel());
		
//		call the child bike object
//		super method not overridden
		Bike child2 = new Bike();
//		inherited properties of parent class
		System.out.println(child2.fuel());
	}
	
}
