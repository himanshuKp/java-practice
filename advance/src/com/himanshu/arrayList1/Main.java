package com.himanshu.arrayList1;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer("Himanshu",32.11);
    Customer anotherCustomer;
    anotherCustomer = customer;
    anotherCustomer.setBalance(10.11);
    System.out.println("Balance of customer " +customer.getName()+ " is " +customer.getBalance()); //because to save memory anotherCustomer already referred
    //to the same address of customer after anotherCustomer = customer.
    
    
  }
}
