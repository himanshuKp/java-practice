package com.inheritance.constructor.chaining;

public class Parent {

	Parent(){
		System.out.println("Parent default constructor");
	}
	
	Parent(int x){
		this();
		System.out.println("Parent one arg constructor");
	}
	
}
