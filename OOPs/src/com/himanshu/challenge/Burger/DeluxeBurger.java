package com.himanshu.challenge.Burger;

public class DeluxeBurger extends Hamburger{
private String[] deluxeBurgerExtraItems = {"cucumber","soya sauce"};
	
	public DeluxeBurger(String meat) {
		super("Brown rye bread roll", meat);
	}

	@Override
	public void allItemsList() {
		for (String additionalItem : deluxeBurgerExtraItems) {
		      System.out.println("Item #"+itemNo+": "+additionalItem);
		      itemNo++;
		}
		itemNo=1;
	}
	
	@Override
	public void addAdditionalItems(int itemNumber) {
	      switch(itemNumber) {
	      case 1:
	        finalPriceWithAdditionalItems("cucumber");
	        break;
	      case 2:
	        finalPriceWithAdditionalItems("soya sauce");
	        break;
	      }
	      finalItems++;
	}
}
