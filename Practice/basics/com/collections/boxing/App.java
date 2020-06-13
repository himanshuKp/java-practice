package com.collections.boxing;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number = new ArrayList<Integer>();
//		number.add(243);				// autoboxing
//		System.out.println(number.get(0));  //unboxing
		
		number.add(Integer.valueOf(20));	//boxing
		System.out.println(number.get(0));	//unboxing
	}

}
