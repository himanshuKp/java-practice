package com.himanshu.arrayList;

import java.util.ArrayList;

public class GroceryList {
  private ArrayList<String> groceryList = new ArrayList<String>();
  
  public void addGroceryItem(String item) {
    groceryList.add(item);  //add item in the arraylist
  }
  
  public String[] getGroceryList() {
//    System.out.println("You have " +groceryList.size()+ " item in your grocery list");
    String[] groceryListItems = {};
    for(int i=0;i<groceryList.size();i++) {
      groceryListItems[i] = groceryList.get(i);   //get item in the arraylist
    }
    return groceryListItems;
  }
  
  public void modifyGroceryItem(int position, String newItem) {
    groceryList.set(position, newItem); //add new item at current position inplace of one exist
    System.out.println("Grocery item " +(position+1)+ " has been modified" );
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
  
  public String findItem(String item) {
    boolean exists = groceryList.contains(item);    //return boolean, if element exist in the arraylist
    if(exists) {
      int position = groceryList.indexOf(item));    //find position in arraylist
      if(position>=0) {
        return groceryList.get(position);
      }
    }
    return null;
  }
  
  protected int getPosition(String item) {
    return groceryList.indexOf(item);
  }

  protected boolean remove(int position) {
    // TODO Auto-generated method stub
    return false;
  }
}
