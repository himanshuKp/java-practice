package com.himanshu.challenge.sortInput;

import java.util.Arrays;
import java.util.Scanner;

//import com.sun.tools.javac.code.Attribute.Array;

//sort numbers input by the user in descending order

public class Main {
	
	private static Scanner scan = new Scanner(System.in);
	static int[] inputSize;
	public static void main(String[] args) {
		System.out.println("How many numbers you need in sorted order (descending) ? ");
		int numbers = scan.nextInt();
		inputSize = getIntegers(numbers);
		
		printArray();
		
		sortArray();
		printArray();
	}

	private static void sortArray() {
		//copy array method
//		Hint int[] sortedArray = Arrays.copyOf(inputSize, inputSize.length);
		
		boolean isSorted = true;
		System.out.println("\n Sorted numbers are: \n");
		while(isSorted) {
			isSorted = false;
			for(int i=0;i<inputSize.length-1;i++) {
				if(inputSize[i]<inputSize[i+1]) {
					int temp = inputSize[i];
					inputSize[i] = inputSize[i+1];
					inputSize[i+1] = temp;
					isSorted=true;
				}
			}
		}
	}

	private static void printArray() {
		for(int i=0;i<inputSize.length;i++) {
			System.out.println("Input Value #"+i+": "+inputSize[i]);
		}
	}

	private static int[] getIntegers(int numbers) {
		System.out.println("Enter " +numbers+" numbers: \n");
		int[] values = new int[numbers];
		for(int i=0;i<values.length;i++) {
			values[i] = scan.nextInt();
		}
		return values;
	}
}
