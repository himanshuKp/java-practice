package com.collections.genericmethod;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Data {
	public <E> void printListData(List<E> list) {
		for (E element: list) {
			System.out.println(element);
		}
	}
	
	public <E> void printArrayData(E[] arrayData) {
		for (E element: arrayData) {
			System.out.println(element);
		}
	}
}

public class App {

	public static void main(String[] args) {
		Data data = new Data();
		
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		data.printListData(list1);
		
		List<String> list2 = new LinkedList<String>();
		list2.add("String");
		list2.add("Testing");
		data.printListData(list2);
	}

}
