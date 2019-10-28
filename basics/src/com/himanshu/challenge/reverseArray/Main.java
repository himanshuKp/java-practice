package com.himanshu.challenge.reverseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Entered the array size: ");
    int count = scan.nextInt();
    scan.nextLine();
    int[] array = new int[count];
    
    for(int i=0;i<array.length;i++) {
      System.out.println("Enter number: #"+(i+1));
      array[i] = scan.nextInt();
      scan.nextLine();
    }
    scan.close();
    reverse(array);
  }

  private static void reverse(int[] array) {
    
    System.out.println("Non-reversed entered array: " +Arrays.toString(array));
    int temp;
    int[] reversedArray = array;
    for(int i=0;i<=array.length/2-1;i++) {
      temp = reversedArray[i];
      reversedArray[i] = reversedArray[(reversedArray.length-1)-i];
      reversedArray[(reversedArray.length-1)-i] = temp;
    }
    System.out.println("Reversed array is: " +Arrays.toString(reversedArray));
  }

}
