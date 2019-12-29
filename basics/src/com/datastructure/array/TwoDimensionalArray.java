package com.datastructure.array;

public class TwoDimensionalArray {

//	created an empty array
	int arr[][] = null;
	
//	declaring an array and filling it with the default values
	public TwoDimensionalArray(int numberOfRows, int numberOfColumns)
	{
		this.arr = new int[numberOfRows][numberOfColumns];
		for(int row=0;row<numberOfRows;row++)
		{
			for(int col=0;col<numberOfColumns;col++)
			{
//				insert a default value to the newly created array
				arr[row][col] = 0;
			}
		}
	}
	
//	traversing through the array
	public void traverseThroughTheArray()
	{
		try {
			System.out.println("Printing the array now....");
			for(int row=0;row<arr.length;row++)
			{
				for(int col=0;col<arr[0].length;col++)
				{
					System.out.print(arr[row][col]+" ");
				}
				System.out.println();
			}
			System.out.println("\n");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("There are no elements in the array.");
		}
	}

	public void insertingInTheArray(int valueToBeInserted, int rowNumber, 
			int columnNumber) {
		try
		{
			if(arr[rowNumber][columnNumber]==0)
			{
				System.out.println("Value is successfully inserted at row: ["+rowNumber+"], "
						+ "col: ["+columnNumber+"].");
				arr[rowNumber][columnNumber] = valueToBeInserted;
			}
			else 
			{
				System.out.println("Array is already occupied by some other value");
			}
		}
		catch(Exception e)
		{
			System.out.println("Check the inserted positon where value is to be replaced, since current given"
					+ "positiong does not exist.");
		}
	}
	
//	accessing a give cell value and printing it at real time
	public void accessingValueInTheArray(int rowNumber, int colNumber)
	{
		try {
			System.out.println("Value found at given position: row: ["
					+rowNumber+"] and col: ["+colNumber+"], is " +arr[rowNumber][colNumber]);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Check the inserted positon, since it does not exist.");
		}
	}
	
//	searching a given value in the array
	public void searchingValueInTheArray(int valueToBeLookingFor)
	{
		try {
			System.out.println("Searching for the value in the array....");
			for(int row=0;row<arr.length;row++)
			{
				for(int col=0;col<arr[0].length;col++)
				{
					if(arr[row][col]==valueToBeLookingFor)
					{
						System.out.println("Value found at given position: row: ["
								+row+"] and col: ["+col+"], is " +arr[row][col]);	
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Check the inserted positon, since it does not exist.");
		}
	}
	
//	deleting the value from the given array
	public void deletingValueFromTheArray(int rowNumber,int colNumber)
	{
		try
		{
			arr[rowNumber][colNumber] = 0;
			System.out.println("Successfully deleted the value from the array given position.");
		}
		catch(Exception e)
		{
			System.out.println("Check the inserted positon, since it does not exist.");
		}
	}
	
}
