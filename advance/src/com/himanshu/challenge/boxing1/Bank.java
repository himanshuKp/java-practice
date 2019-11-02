package com.himanshu.challenge.boxing1;

import java.util.ArrayList;

class Branch{
 private String name;
 ArrayList<Customer> customers = new ArrayList<Customer>();
 
public Branch(String name) {
  this.name = name;
  this.customers = new ArrayList<Customer>();
}
 
  protected ArrayList<Customer> getCustomers() {
  return customers;
}



protected void setCustomers(ArrayList<Customer> customers) {
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

  public String getName() {
    return name;
  }
  
}

public class Bank {
  private String name;
  ArrayList<Branch> branches = new ArrayList<Branch>();
  
  public Bank(String name, ArrayList<Branch> branches) {
    this.name = name;
    this.branches = branches;
  }

  public String getName() {
    return name;
  }
  
  public boolean newBranch(String name) {
    Branch existingBranch = findBranch(name);
    if(existingBranch==null) {
      this.branches.add(new Branch(name));
      return true;
    }
    return false;
  }
  
  public boolean addCustomer(String branchName, String customerName, double initialAmount) {
    Branch branch = findBranch(branchName);
    if(branch!=null) {
      return branch.newCustomer(customerName, initialAmount);
    }
    return false;
  }
  
  public boolean addTransaction(String branchName, String customerName, double amount) {
    Branch branch = findBranch(branchName);
    if(branch!=null) {
      return branch.addAdditionalTransaction(customerName, amount);
    }
    return false;
  }

  private Branch findBranch(String branchName) {
    for(int i=0;i<this.branches.size();i++) {
      Branch currentBranch = this.branches.get(i);
      if(currentBranch.getName().equalsIgnoreCase(branchName)) {
        return currentBranch;
      }
    }
    return null;
  }
  
  public boolean listCustomers(String branchName, boolean showTransactions) {
    Branch branch = findBranch(branchName);                 //Object -- branch if there is something else null
    if(branch != null) {
      System.out.println("Customer details for branch: " +branch.getName());
      
      ArrayList<Customer> branchCustomers = branch.getCustomers();  //store the list of all customers in an arraylist
      for(int i=0;i<branchCustomers.size();i++) {
        Customer branchCustomer = branchCustomers.get(i);   //get the position number of customer one by one in Customer object
        System.out.println("Customer Name: " +branchCustomer.getCustomerName() + "{" +i+ "]");  //get the name of employee 
        if(showTransactions) {                                                              // true if showtransanctions are there true
          System.out.println("Transanctions: ");
          ArrayList<Double> transanctions = branchCustomer.getTransactions();   //get list of all transactions of customer in an arraylist
          for(int j=0;j<transanctions.size();j++) {
            System.out.println("["+j+"]"+" Amount: " +transanctions.get(j));            //get the transanctions of the customer
          }
        }
      }
      return true;
    }else {
      return false;
    }
  }
  
}
