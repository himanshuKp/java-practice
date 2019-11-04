package com.himanshu.practise;

public class Customer {
  
  private Double money;
  
  public Customer(Double money) {
    this.money = money;
  }

  protected Double getMoney() {
    return money;
  }

  protected void setMoney(Double money) {
    this.money = money;
  }
  
}
