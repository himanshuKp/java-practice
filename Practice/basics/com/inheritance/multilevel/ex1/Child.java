package com.inheritance.multilevel.ex1;

public class Child extends Parent {

	int c,d;

	public Child(int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;
	}
	
	void fieldValues() {
		System.out.println("Parent a: "+this.a);
		System.out.println("Parent b: "+this.b);
		System.out.println("Child c: "+this.c);
		System.out.println("Child d: "+this.d);
	}
	
}
