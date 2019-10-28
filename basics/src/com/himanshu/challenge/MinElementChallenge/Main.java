package com.himanshu.challenge.MinElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of elements you need to enter: ");
		
		int count = scan.nextInt();
		
		int[] myNumbers = readIntegers(count);

		scan.close();
		findMin(myNumbers);
		
	}

	private static void findMin(int[] findMin) {
		//one solution with sorting by decreasing order
//		int temp;
//		boolean flag = true;
//		while(flag) {
//			flag = false;
//			for(int i=0;i<findMin.length-1;i++) {
//				if(findMin[i]<findMin[i+1]) {
//					temp = findMin[i];
//					findMin[i] = findMin[i+1];
//					findMin[i+1] = temp;
//					flag = true;
//				}
//			}			
//		}
//		System.out.println("Sorted array: "+Arrays.toString(findMin));
//		System.out.println("Minimum element in array: " +findMin[findMin.length-1]);
		
		//second solution
	    int minimumElement = Integer.MAX_VALUE;
	    
	    for(int i=0;i<findMin.length;i++) {
	      if(findMin[i]<minimumElement) {
	        minimumElement = findMin[i];
	      }
	    }
	    
	    System.out.println("Entered Array: " +Arrays.toString(findMin));
	    System.out.println("Minimum element in the array is: " +minimumElement);
	}

	private static int[] readIntegers(int count) {
		System.out.println("Enter numbers to sort: ");
		int[] tempArray = new int[count];
		for(int i=0;i<count;i++) {
			tempArray[i] = scan.nextInt();
		}
		return tempArray;
	}

}
