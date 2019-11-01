package com.himanshu.challenge.boxing1;

import java.util.ArrayList;

class Branch{
 private String name;
 ArrayList<Customer> customers = new ArrayList<Customer>();
 
public Branch(String name, ArrayList<Customer> customers) {
  this.name = name;
  this.customers = customers;
}
 
  public boolean newCustomer(String customerName, double initialAmount) {
    if(findCustomer(customerName) == null) {
      this.customers.add(new Customer(customerName, initialAmount));
      return true;
    }    
    return false;
  }
  
  public boolean addAdditionalTransaction(String customerName, double amount) {
    Customer existCustomer = findCustomer(customerName);
    
    if(existCustomer != null) {
      existCustomer.addTransaction(amount);
      return true;
    }
    return false;
    
  }

  private Customer findCustomer(String customerName) {
    for(int i=0;i<this.customers.size();i++) {
      Customer checkedCustomer = this.customers.get(i);
      if(checkedCustomer.getCustomerName().equalsIgnoreCase(customerName)) {
        return checkedCustomer;
      }
    }
    return null;
  }
  
}

public class Bank {
  ArrayList<Branch> branches = new ArrayList<Branch>();
  
}
