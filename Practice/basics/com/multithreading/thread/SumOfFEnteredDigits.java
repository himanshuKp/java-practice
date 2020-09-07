package com.multithreading.thread;

import java.util.Scanner;

public class SumOfFEnteredDigits extends Thread{

//	entered digits
	static int enteredDigit = 0;
//	totalSum
	static int totalSum = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Calculating sum of entered 'N' numbers");
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		SumOfFEnteredDigits.enteredDigit = sc.nextInt();
		sc.close();
		
//		start thread
		SumOfFEnteredDigits sumOfFEnteredDigits = new SumOfFEnteredDigits();
		sumOfFEnteredDigits.start();
		long startTime = System.currentTimeMillis();
		try {
			sumOfFEnteredDigits.join();
		} catch (InterruptedException e) {
			System.out.println("Calculation interrupted");
		}
		
		long endTime = System.currentTimeMillis();
				
		System.out.println("Sum of "+enteredDigit+" digits is " +totalSum);
		System.out.println("Total time taken is: "+(endTime - startTime)/1000);
		
	}
	
	public void run() {
		for (int i = 0; i < SumOfFEnteredDigits.enteredDigit; i++) {
			SumOfFEnteredDigits.totalSum += i;
		}
	}

}
