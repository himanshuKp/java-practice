

package com.datastructure.array;

import java.util.Scanner;

public class RotateByKPositon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter the number of arrays you want to create: ");
		int numberOfArrays = scanner.nextInt();
		while(numberOfArrays-- > 0) {
			System.out.print("Number of elements in the array: ");
			int numbeOfElementsInArray = scanner.nextInt();
			int[] arr = new int[numbeOfElementsInArray];	
			
			
			System.out.println("Rotate the array by positon: ");
			int rotateArrayByPosition = scanner.nextInt();
			
			System.out.println("Input elements in array: ");
			for(int position = 0;position<arr.length;position++) {
				arr[position] = scanner.nextInt();
			}
			
			try {
			rotateElementsInArray(arr,rotateArrayByPosition);
			print(arr);
			} catch(StackOverflowError e) {
				System.out.println("Invalid range of input entered.");
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param arr, passing the array 
	 * @param rotateArrayByPosition, position by which the array is to be rotated
	 */
	private static void rotateElementsInArray(int[] arr, int rotateArrayByPosition) {
			int totalElements = arr.length;
			if(rotateArrayByPosition == 0 || rotateArrayByPosition == totalElements) {
				return;
			}
			int gcd = findGcd(totalElements,rotateArrayByPosition);
			System.out.println("Value of gcd : " +gcd);
			swap(arr,gcd,rotateArrayByPosition,totalElements);
	}

	private static int findGcd(int totalElements, int rotateArrayByPosition) {
		
		if(totalElements == 0)
			return rotateArrayByPosition;
		
		if(rotateArrayByPosition == 0)
			return totalElements;
		
		if(totalElements == rotateArrayByPosition)
			return totalElements;

		if(totalElements > rotateArrayByPosition)
			return findGcd(totalElements - rotateArrayByPosition, rotateArrayByPosition);
		return (totalElements, totalElements-rotateArrayByPosition);
	
	}

	private static void swap(int[] arr, int gcd, int rotateArrayByPosition, int totalElements) {
		int d,i,j,temp;
		for(i=0;i<gcd;i++)	//outer loop
		{
			j=i;
			temp = arr[i];
			while(true)	//inner loop
			{
				d = (j+rotateArrayByPosition)%totalElements;
				
				if(d==i)
					break;
				
				arr[j] = arr[d];
				j = d;
			}
			arr[j] = temp;
		}
	}

	private static void print(int[] arr) {
//		System.out.println("Output elements of arrays: ");
		StringBuilder outputElementsOfArray = new StringBuilder();
		for(int position = 0;position<arr.length;position++)
		{
			outputElementsOfArray.append(arr[position]+" ");
		}
		System.out.println(outputElementsOfArray);
	}

}