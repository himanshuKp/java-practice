package com.himanshu.dsalgo.recursion;

public class Fibonacci {

  public static void main(String[] args) {
      int n = 8;
      System.out.println("Fibonacci of : " +n+ " is " +fibonacci(n));
  }

  private static int fibonacci(int n) {
    if(n<1)
      return 0;
    else if((n==1)||(n==2))
      return (n-1);
    else 
      return fibonacci(n-1)+fibonacci(n-2);
  }

}
