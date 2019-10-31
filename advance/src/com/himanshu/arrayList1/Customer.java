package com.himanshu.arrayList1;

public class Customer {
  private String name;
  private double balance;
  
  public Customer(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }

  protected String getName() {
    return name;
  }

  protected void setName(String name) {
    this.name = name;
  }

  protected double getBalance() {
    return balance;
  }

  protected void setBalance(double balance) {
    this.balance = balance;
  }
  
}
