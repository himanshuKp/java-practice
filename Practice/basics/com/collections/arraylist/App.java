package com.collections.arraylist;

import java.util.ArrayList;

public class App {

	static ArrayList<String> listNames = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listNames.add("Himanshu");
		listNames.add("Chand");
		listNames.add("Test");
		listNames.add("Check");
		listNames.add("Ravi");
//		System.out.println(listNames);
		App app = new App();
		app.displayName(listNames);
		app.replaceName(3, "Deepti");
		app.displayName(listNames);
	}
	
	void displayName(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);			
		}
	}
	
	void replaceName(int position, String newName) {
		listNames.set(position, newName);
	}
	

}
