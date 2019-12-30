package com.datastructure.array;

/**
 * returning an array from a method
 *
 */
public class ReturnArrayFromMethod {

	public static void main(String[] args) {
		
		int arr[] = m1();

		for(int count=0;count<arr.length;count++)
		{
			System.out.println(arr[count]);
		}
	}
	
	private static int[] m1() {
		return new int[] {1,2,3};
	}

}
