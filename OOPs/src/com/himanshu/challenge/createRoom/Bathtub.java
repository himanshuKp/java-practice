package com.himanshu.challenge.createRoom;

public class Bathtub {
  private String company;
  private String type;
  
  public Bathtub(String company, String type) {
    this.company = company;
    this.type = type;
  }
  
  public void myBathtub() {
    System.out.println("We have a " +getType()+ " type of bathroom from company " +getCompany());
  }

  private String getCompany() {
    return company;
  }

  private String getType() {
    return type;
  }
    
}
