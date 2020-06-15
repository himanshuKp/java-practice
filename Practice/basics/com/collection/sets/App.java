package com.collection.sets;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class App {

	public static void main(String[] args) {
		
		Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		deque.add(5);
		deque.add(6);
		
		extracted(deque);
		
		System.out.println("***********************");
		
		deque.addFirst(0);
		deque.addLast(7);
		
		extracted(deque);
	}

	private static void extracted(Deque<Integer> deque) {
		for(Integer element: deque) {
			System.out.println(element);
		}
	}

}
