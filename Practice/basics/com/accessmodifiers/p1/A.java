package com.accessmodifiers.p1;

public class A {

	private int a = 10;
			int b = 20;
	protected int c = 30;
	public int d = 40;
	
	public static void main(String[] args) {
		
		A objA = new A();
		System.out.println(objA.a);
		System.out.println(objA.b);
		System.out.println(objA.c);
		System.out.println(objA.d);
		
	}

}
