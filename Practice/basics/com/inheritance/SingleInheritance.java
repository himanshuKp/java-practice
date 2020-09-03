package com.inheritance;

public class SingleInheritance {

	void m1() {
		System.out.println("Inside m1");
	}
	
	public static void main(String[] args) {
		SingleInheritance si = new SingleInheritance();
		si.m1();
		System.out.println(si.hashCode());
		System.out.println(si.getClass());
	}
	
}
