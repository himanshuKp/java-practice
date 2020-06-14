package com.collections.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Names implements Comparable<Names>{
	
	String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Names obj) {
		if (name.length() == obj.name.length()) {
			return 0;
		} else if (name.length() < obj.name.length()) {
			return -1;
		} else {
			return 1;
		}
	}
	
}

public class App {

	public static void main(String[] args) {
		List<Names> elements = new LinkedList<Names>();
		elements.add(new Names("India"));
		elements.add(new Names("USA"));
		elements.add(new Names("Poland"));
		elements.add(new Names("Egypt"));
		elements.add(new Names("Thailand"));
		
				
		App app = new App();
		app.printList(elements);
//		System.out.println("******************");
//		countries.sort(null); 	//natural order sorting
//		app.printList(countries);
//		System.out.println("******************");
//		Collections.reverse(countries);
//		app.printList(countries);
	
//		Integer a = 1;
//		Integer b = 1;
//		
//		System.out.println(a.compareTo(b));
		
		Collections.sort(elements);
		app.printList(elements);
	}
	
	void printList(List<Names> items) {
		Iterator<Names> iterate = items.iterator();
		while (iterate.hasNext()) {
			System.out.println("Country: "+iterate.next());
		}
	}
	
	

}
