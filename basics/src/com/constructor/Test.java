package com.constructor;

public class Test {
	
	Test(){
		System.out.println(this);
		System.out.println(this.hashCode());
	}
	
	public static void main(String[] args) {
		Test t = new Test();
	}
}
