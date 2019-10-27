package com.himanshu.challenge.Burger;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Hamburger ham = new Hamburger(1, "Chicken");
    System.out.println("Base burger price: " +ham.getBasePrice());
    
    ham.addAdditionalItems();
    
    
    
    System.out.println("Final price to pay: " +ham.getBasePrice());
  }

}
