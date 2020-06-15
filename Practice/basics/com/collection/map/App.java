package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {

		Map<Integer, String> student = new HashMap<Integer, String>();
		student.put(3, "Priyanka");
		student.put(1, "Rahul");
		student.put(2, "Mia");
		
		//one way
//		for(Map.Entry<Integer,String> entry: student.entrySet()) {
//			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
//		}
		
		//second way
//		for(Integer key: student.keySet()) {
//			System.out.println("Key: "+key+" Value: "+student.get(key));
//		}
		
		//third way
		Iterator<Entry<Integer, String>> entry = student.entrySet().iterator();
		while(entry.hasNext()) {
			Entry<Integer, String> temp = entry.next();
			System.out.println("Key: "+temp.getKey()+ " Value: "+temp.getValue());
		}
		
//		System.out.println("value for a key: "+student.get(3));
	}

}
