package com.himanshu.challenge.boxing;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    for(int count = 0;count<10;count++) {
      list.add(count);
    }
    
    int sumOddNumber = sumOfOddNumber(list);
    System.out.println("Sum of odd numbers: " +sumOddNumber);
  }

  private static int sumOfOddNumber(ArrayList<Integer> list) {
    int sum = 0;
    for(Integer i:list) {
      
      if(i%2!=0) {
        sum+=i;
      }
    }
    
    return sum;
    
  }
}
