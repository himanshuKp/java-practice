package com.basic.arithmatics;

public class EvenNumbers {

	public static void main(String[] args) {

		int x = 1;
		do {
//			find the even numbers
			if (x%2==0) {
				System.out.println(x);
			}
			x++;
		}while(x<=30);
		
	}

}
