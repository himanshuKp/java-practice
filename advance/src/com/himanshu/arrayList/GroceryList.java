package com.himanshu.arrayList;

import java.util.ArrayList;

public class GroceryList {
  private ArrayList<String> groceryList = new ArrayList<String>();
  
  protected boolean addGroceryItem(String item) {
    return groceryList.add(item);  //add item in the arraylist
  }
  

  protected void getGroceryList() {
   System.out.println("You have " +groceryList.size()+ " item in your grocery list");
   for(int count=0;count<groceryList.size();count++) {
     System.out.println(count+" : " +groceryList.get(count));
   }
  }
  

  protected String modifyGroceryItem(int position, String newItem) {
    return groceryList.set(position, newItem); //add new item at current position inplace of one exist
  }
  

  protected boolean removeGroceryItem(int position) {
    String theItem = groceryList.get(position);
      //remove item from arraylist
    if(groceryList.remove(position)!=null) {
      return true;
    }else {
      return false;
    }
  }
  

  protected String findItem(String item) {
    boolean exists = groceryList.contains(item);    //return boolean, if element exist in the arraylist
    if(exists) {
      int position = groceryList.indexOf(item);    //find position in arraylist
      if(position>=0) {
        return groceryList.get(position);
      }
    }
    return null;
  }
  

  protected int getPosition(String item) {
    return groceryList.indexOf(item);
  }

}
