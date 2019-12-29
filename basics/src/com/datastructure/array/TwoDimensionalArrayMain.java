package com.datastructure.array;

public class TwoDimensionalArrayMain {

	public static void main(String[] args) {
		
		TwoDimensionalArray currentArray = new TwoDimensionalArray(5, 5);
		currentArray.traverseThroughTheArray();
		
//		inserting a new value at a particular position
		currentArray.insertingInTheArray(1,0,3);
		currentArray.traverseThroughTheArray();
		
		currentArray.insertingInTheArray(1,0,38);
		currentArray.traverseThroughTheArray();
		
//		accessing the value at particular position in the array
		currentArray.accessingValueInTheArray(3, 4);
		
		currentArray.insertingInTheArray(3, 2, 2);
		currentArray.traverseThroughTheArray();
		
		currentArray.searchingValueInTheArray(3);
		
		currentArray.deletingValueFromTheArray(2, 2);
		currentArray.traverseThroughTheArray();
	}

}
