package com.himanshu.challenge.vipcustomer;

public class Main {

  public static void main(String[] args) {
    
    VipCustomer vipCustomer = new VipCustomer("Anjali",2_00_000);
    System.out.println("Name: " +vipCustomer.getName() + " Credit Limit: " +vipCustomer.getCreditLimit()+ " Email: " +vipCustomer.getEmail());
    
  }

}
