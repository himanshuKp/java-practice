package com.collections.stack;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>();	//follows lifo
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		myStack.push(6);
//		System.out.println("Top element: "+myStack.peek());
//		
//		for (Integer integer : myStack) {
//			System.out.println(integer);
//		}
		
		if(myStack.isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("Stack is not empty");
		}
		
		System.out.println(myStack.search(8));
	}

}
