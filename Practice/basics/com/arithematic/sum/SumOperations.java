package com.arithematic.sum;

import java.util.Scanner;

public class SumOperations {

	public static void main(String[] args) {
		System.out.println("Enter two numbers: \n");
//		create scanner object to read input data
		Scanner sc = new Scanner(System.in);
		
//		nextInt() scans the next input of the scanner as a int
		int firstDigit = sc.nextInt();
		int secondDigit = sc.nextInt();
		
//		if we don't close, java will not garbage collect the scanner object
//		and we will have memory leaks
		sc.close();
		
		int sumOfDigits = firstDigit + secondDigit;
		System.out.println("Sum of digits is: " +sumOfDigits);
	}
	
}
