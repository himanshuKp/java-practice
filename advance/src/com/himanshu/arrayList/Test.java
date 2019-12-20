package com.himanshu.arrayList;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(5);
		aList.add(6);
		aList.add(7);
		aList.add(12);
		aList.add(3);
	//	aList.add("String"); //wont compile
		aList.add(8);
		
		printList(aList);
		
	}

	private static void printList(ArrayList<Integer> aList) {
		for(int index=0;index<aList.size();index++) {
			System.out.println("Item is: " +aList.get(index));
		}
		for(int obj:aList) {
			System.out.println(obj*2);
		}
	}

}
