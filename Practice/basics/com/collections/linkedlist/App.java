package com.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		
		App app = new App();
		app.printList(countries);
		System.out.println("******************");
		countries.sort(null); 	//natural order sorting
		app.printList(countries);
	}
	
	void printList(List<String> items) {
		Iterator<String> iterate = items.iterator();
		while (iterate.hasNext()) {
			String string = (String) iterate.next();
			System.out.println("Country: "+string);
		}
	}

}
