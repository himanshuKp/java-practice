package com.himanshu.arrayList1;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
//    Customer customer = new Customer("Himanshu",32.11);
//    Customer anotherCustomer;
//    anotherCustomer = customer;
//    anotherCustomer.setBalance(10.11);
//    System.out.println("Balance of customer " +customer.getName()+ " is " +customer.getBalance()); //because to save memory anotherCustomer already referred
//    //to the same address of customer after anotherCustomer = customer.
    
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);
    
    for(int i=0;i<arrayList.size();i++) {
      System.out.println(i+" : "+arrayList.get(i));
    }
    
    //adding element at position 2;
    arrayList.add(2,5);
  
    for(int i=0;i<arrayList.size();i++) {
      System.out.println(i+" : "+arrayList.get(i));
    }
  }
}
