package com.himanshu.challenge.Burger;

import java.util.Scanner;

public class Hamburger {
  private String burgerRollType;
  private String[] additionalItems = {"lettuce","tomato","carrot","olives"};
  private String meat;
  private int additionalPrice = 1;
  private int basePrice;
  protected int finalItems=0;
  protected int itemNo=1;
  
  public Hamburger(String burgerRollType, String meat) {
    this.burgerRollType = burgerRollType;
    this.meat = meat;
    this.basePrice = 20;
  }
  
  public void addAdditionalItems(int itemNumber) {
      switch(itemNumber) {
      case 1:
        finalPriceWithAdditionalItems("lettuce");
        break;
      case 2:
        finalPriceWithAdditionalItems("tomato");
        break;
      case 3:
        finalPriceWithAdditionalItems("carrot");
        break;
      case 4:
        finalPriceWithAdditionalItems("olives");
        break;
      }
      finalItems++;
  }
  
  public void allItemsList() {
    for (String additionalItem : additionalItems) {
      System.out.println("Item #"+itemNo+": "+additionalItem);
      itemNo++;
    }
    itemNo=1;
  }
  
  protected int finalPriceWithAdditionalItems(String itemName) {
    this.basePrice += additionalPrice;
    System.out.println("Added " +itemName+ " to the existing hamburger.");
    return this.basePrice;
  }

  protected int getBasePrice() {
    return basePrice;
  }
  
}
