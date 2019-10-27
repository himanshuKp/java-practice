package com.himanshu.challenge.Burger;

import java.util.Scanner;

public class Hamburger {
  private int burgerRollType;
  private String[] additionalItems = {"lettuce","tomato","carrot","olives"};
  private String meat;
  private int additionalPrice = 5;
  private int basePrice;
  private int finalItems=0;
  private int itemNo=1;
  
  public Hamburger(int burgerRollType, String meat) {
    if(burgerRollType!=1) {
      this.burgerRollType = 2;  //deluxe burger
    }
    this.burgerRollType = burgerRollType;
    this.meat = meat;
    this.basePrice = 20;
  }
  
  public void addAdditionalItems() {
    Scanner scan = new Scanner(System.in);
    
    for (String additionalItem : additionalItems) {
      System.out.println("Item #"+itemNo+": "+additionalItem);
      itemNo++;
    }
    System.out.println("Enter element number: ");
    
    scan.nextInt();
        
    finalPriceWithAdditionalItems();
    
    scan.close();
    
  }
  
  private int finalPriceWithAdditionalItems() {
    this.basePrice += additionalPrice;
    return this.basePrice;
  }

  private int getBurgerRollType() {
    return burgerRollType;
  }

  private String[] getAdditionalItems() {
    return additionalItems;
  }

  protected int getBasePrice() {
    return basePrice;
  }
  
}
