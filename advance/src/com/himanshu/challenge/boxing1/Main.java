package com.himanshu.challenge.boxing1;

public class Main {

  public static void main(String[] args) {
 // You job is to create a simple banking application.
    // There should be a Bank class
    // It should have an arraylist of Branches
    // Each Branch should have an arraylist of Customers
    // The Customer class should have an arraylist of Doubles (transactions)
    // Customer:
    // Name, and the ArrayList of doubles.
    // Branch:
    // Need to be able to add a new customer and initial transaction amount.
    // Also needs to add additional transactions for that customer/branch
    // Bank:
    // Add a new branch
    // Add a customer to that branch with initial transaction
    // Add a transaction for an existing customer for that branch
    // Show a list of customers for a particular branch and optionally a list
    // of their transactions
    // Demonstration autoboxing and unboxing in your code
    // Hint: Transactions
    // Add data validation.
    // e.g. check if exists, or does not exist, etc.
    // Think about where you are adding the code to perform certain actions
    
    Bank bank = new Bank("RBI");
    
    bank.addBranch("Delhi");
    
    bank.addCustomer("Delhi", "HK", 50.11);
    bank.addCustomer("Delhi", "RAJ", 2220.1);
    bank.addTransaction("Delhi", "HK", 321.1);
    
    bank.addBranch("Mumbai");
    
    bank.addTransaction("Delhi", "HK", 321.0);
    
    bank.listCustomers("Delhi", true);
    
  }

}
