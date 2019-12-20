package com.himanshu.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class ExceptionGeneralNotes {

	//static int count;
	//int i;
	
//	run every time an object is created
//	static and instance variables can be accessed
/*	{
		System.out.println("Instance initializer");
		i = 5;
		count = count + 1;
		System.out.println("Count when instance initializer is called: " +count);
	}
*/
	
//	run only when class is first loaded
//	only static variables can be accessed
/*	static 
	{
		System.out.println("Static initializer");
//		i=6; //compile error
		count = count+1;
		System.out.println("Count when static initializer is run is: " +count);
	}
	*/
	public static void main(String[] args) {
		
//		try with resource
//		when try block ends resources are automatically released
//		no need to create separate finally block;
	/*	try(BufferedReader br = new BufferedReader(new FileReader("File_path")))
		{
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	*/	
		
	/*	int marks5[] = {25,23,12,54,12};
		System.out.println(marks5);
		System.out.println(Arrays.toString(marks5));
		
		int matrix3[][] = {{25,23,12,54,12},{25,12,54,12}};
		System.out.println(matrix3);
		System.out.println(Arrays.deepToString(matrix3));
		*/
		
	/*	int[] number1 = {1,2,3};
		int[] number2 = {2,3,4};
		int[] number3 = {1,2,3};
		System.out.println(Arrays.equals(number1, number3));
		*/
		
		ExceptionGeneralNotes e = new ExceptionGeneralNotes();
	/*	ExceptionGeneralNotes e1 = new ExceptionGeneralNotes();
		ExceptionGeneralNotes e2 = new ExceptionGeneralNotes();
		*/
	//	e.tokenize("ab;cd;ef;g",";");
	}

//	splitting a string into several string by using delimeter
/*	private void tokenize(String string, String string2) {
		// TODO Auto-generated method stub
		String[] tokens = string.split(string2);
		System.out.println(Arrays.toString(tokens));
	}
*/
	
	
}
