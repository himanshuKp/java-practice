package com.collections.generic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Data<T>{
	private T myVariable;

	public Data(T myVariable) {
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}
	
}

public class App {

	public static void main(String[] args) {
		
		List<Data<String>> myList = new LinkedList<Data<String>>();
		myList.add(new Data<String>("Alpha"));
		myList.add(new Data<String>("Beta"));
		
		App app = new App();
		app.printList(myList);
	}

	private void printList(List<Data<String>> myList) {
		Iterator<Data<String>> iterate = myList.iterator();
		while(iterate.hasNext()) {
			System.out.println("Element: " +iterate.next().getMyVariable());
		}
	}

}
