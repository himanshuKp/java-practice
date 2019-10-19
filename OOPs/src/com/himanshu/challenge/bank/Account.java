package com.himanshu.challenge.bank;

public class Account {
  private String accountNumber;
  private double balance;
  private String customerName;
  private String customerEmailAddress;
  private String customerPhoneNumber;
  
  public Account() {
    this("197495",0.0,"John Doe","default@xyz.in","1234567890");
    System.out.println("Default constructor called.");
  }
  
  public Account(String accountNumber, double balance, String customerName, String customerEmailAddress,
      String customerPhoneNumber) {
    System.out.println("Account constrcutor called with parameters.");
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.customerEmailAddress = customerEmailAddress;
    this.customerPhoneNumber = customerPhoneNumber;
  }

  public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
    this("99999",11.11,customerName,customerEmailAddress,customerPhoneNumber);
  }

  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }
  public double getBalance() {
    return balance;
  }
  public void setBalance(double balance) {
    this.balance = balance;
  }
  public String getCustomerName() {
    return customerName;
  }
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }
  public void setCustomerEmailAddress(String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
  }
  public String getCustomerPhoneNumber() {
    return customerPhoneNumber;
  }
  public void setCustomerPhoneNumber(String customerPhoneNumber) {
    this.customerPhoneNumber = customerPhoneNumber;
  }
  
  public void depositFunds(double amount) {
    this.balance += amount;
    System.out.println("Deposit of " +amount+ " made. Updated balance in account is: " +Math.floor(this.balance));
  }
  
  public void withdrawFunds(double amount) {
    if(this.balance-amount>0) {
      this.balance -= amount;
      System.out.println("Withdrawal of " +amount+ " processed. Remaining balance " +Math.floor(this.balance));
    }else {
      System.out.println("Insufficient Funds");
    }
  }
  
}
