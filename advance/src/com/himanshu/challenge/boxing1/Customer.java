package com.himanshu.challenge.boxing1;

import java.util.ArrayList;

public class Customer {
  private String customerName;
  ArrayList<Double> transactions = new ArrayList<Double>();
  
  public Customer(String customerName, double initialAmount) {
    this.customerName = customerName;
    addTransaction(initialAmount);          //add initialAmount to the double arraylist
  }
  
  public void addTransaction(double amount) {
    this.transactions.add(amount);
  }

  protected String getCustomerName() {
    return customerName;
  }

  protected ArrayList<Double> getTransactions() {
    return transactions;
  }
  
}
