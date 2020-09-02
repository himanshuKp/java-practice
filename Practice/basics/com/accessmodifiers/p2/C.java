package com.accessmodifiers.p2;

import com.accessmodifiers.p1.A;

public class C extends A {

	public static void main(String[] args) {
		C objC = new C();
		System.out.println(objC.c);
		System.out.println(objC.d);
		
//		only public member can be accessed
		A objA = new A();
		System.out.println(objA.d);
	}

}
