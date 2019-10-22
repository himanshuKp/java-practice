package com.himanshu.challenge.vipcustomer;

public class VipCustomer {

  private String name;
  private double creditLimit;
  private String email;
  
  public VipCustomer() {
    this("Himanshu",1_00_000,"himanshu@kp.in");
  }
  
  public VipCustomer(String name, double creditLimit) {
    this(name,creditLimit,"anjik@kp.in");
  }

  public VipCustomer(String name, double creditLimit, String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public String getEmail() {
    return email;
  }
    
}
