package com.basic.arithmatics;

public class OddNumbers {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i%2==0) {
				continue;
			}
//			this will print only if above condition is false
			System.out.println(i);
		}
	}
	
}
