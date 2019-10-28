package com.himanshu.challenge.Burger;

public class HealthyBurger extends Hamburger {
	private String[] healthyBurgerExtraItems = {"cucumber","soya sauce"};
	
	public HealthyBurger(String meat) {
		super("Brown rye bread roll", meat);
	}

	@Override
	public void allItemsList() {
		for (String additionalItem : healthyBurgerExtraItems) {
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
