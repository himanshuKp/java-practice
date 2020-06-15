package com.collection.treemap;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
	private String sectionNo;
	private String lectureNo;
	
	public Code(String sectionNo, String lectureNo) {
		this.sectionNo = sectionNo;
		this.lectureNo = lectureNo;
	}

	public String getSectionNo() {
		return sectionNo;
	}

	public String getLectureNo() {
		return lectureNo;
	}

	@Override
	public String toString() {
		return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
	}

	@Override
	public int compareTo(Code o) {
		String item1 = sectionNo.concat(lectureNo);
		String item2 = o.getSectionNo()+o.getLectureNo();
		return item1.compareTo(item2);
	}
	
}

public class App {

	public static void main(String[] args) {

		Map<Code, String> lecture = new TreeMap<Code, String>();
		lecture.put(new Code("L01", "S01"), "Apple");
		lecture.put(new Code("L01", "S02"), "Banana");
		lecture.put(new Code("L01", "S01"), "Oranges");
		lecture.put(new Code("L01", "S03"), "Pineapple");
		lecture.put(new Code("L01", "S04"), "Cidar");
		
		for(Map.Entry<Code, String> entry: lecture.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
	}

}
