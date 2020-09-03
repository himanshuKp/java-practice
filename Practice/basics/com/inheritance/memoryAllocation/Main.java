package com.inheritance.memoryAllocation;

public class Main {

	public static void main(String[] args) {
		
//		both the child and parent class share the same memory address
		Child child = new Child();
		child.hashCode();
		
	}

}
