package com.himanshu.practise;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    /*
     * Customer customer = new Customer(11.11); Customer anotherCustomer;
     * anotherCustomer = customer; // anotherCustomer.setMoney(9.9); //change
     * customer (instance) value as well // customer.setMoney(9.9); anotherCustomer
     * = new Customer(9.9); //diff value for both instance
     * 
     * System.out.println("Customer 1: " +customer.getMoney());
     * System.out.println("Another customer: " +anotherCustomer.getMoney());
     */
    
    ArrayList<Integer> intList = new ArrayList<Integer>();
    intList.add(1);
    intList.add(3);
    intList.add(4);
    intList.add(5);
    intList.add(6);
    
    for(int i=0;i<intList.size();i++) {
      System.out.println("["+i+"]" +" Value: " +intList.get(i)); 
    }
    
    System.out.println("-------------------------------------------");
    intList.add(1,2);
    
    for(int i=0;i<intList.size();i++) {
      System.out.println("["+i+"]" +" Value: " +intList.get(i)); 
    }
    
  }

}
