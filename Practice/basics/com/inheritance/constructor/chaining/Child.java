package com.inheritance.constructor.chaining;

public class Child extends Parent {

	Child(){
		this(19);
		System.out.println("Child default constructor");
	}
	
	Child(int x){
		super(x);
		System.out.println("Child one arg constructor");
	}
	
	public static void main(String[] args) {
		Child child = new Child();
	}
	
}
