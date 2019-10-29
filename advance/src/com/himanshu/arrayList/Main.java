package com.himanshu.arrayList;

import java.util.Scanner;

public class Main {

  private static Scanner scan = new Scanner(System.in);
  private static GroceryList groceryList = new GroceryList();
  
  public static void main(String[] args) {
      
    boolean quit = false;
    int choice = 0;
    printInstructions();
    while(!quit) {
      System.out.println("Enter your choice: ");
      choice = scan.nextInt();
      switch (choice) {
      case 0: 
        printInstructions();
        break;
      case 1: 
        groceryList();
        break;
      case 2:
        newItem();
        break;
      case 3:
        modifyItem();
        break;
      case 4:
        removeItem();
        break;
      case 5:
        searchForItem();
        break;
      case 6:
        quit = true;
        break;
      }
    }
    scan.close();
  }

  private static void searchForItem() {
    System.out.println("Enter the item you are looking for: ");
    String itemSearching = scan.nextLine();
    String ItemSearched = groceryList.findItem(itemSearching);
    if(ItemSearched!=null) {
      System.out.println("We have found the item " +ItemSearched+ " which is "
          + "currently at " +(groceryList.getPosition(ItemSearched)+1)+" from the top of list.");
    }else {
      System.out.println("Sorry! There is no such item in the list");
    }
  }

  private static void removeItem() {
    System.out.println("Enter the item you want to delete from the list: ");
    String itemDeleting = scan.nextLine();
    String itemDeleted = groceryList.findItem(itemDeleting);
    if(itemDeleted!=null) {
      System.out.println("We have found the item " +itemDeleted+ " which is "
          + "currently at " +(groceryList.getPosition(itemDeleted)+1)+" from the top of list.");
      System.out.println("Deleting the item from the list now...");
      if(groceryList.removeGroceryItem(groceryList.getPosition(itemDeleted))) {
        System.out.println("We have successfully removed " +itemDeleted+ " from your grocer list.");
        groceryList.getGroceryList();
      }else {
        System.out.println("We were unable to delete the item searched.");
      }
    }
  }

  private static void modifyItem() {
    System.out.println("Enter the item which is to be replaced: ");
    String itemToReplace = scan.nextLine();
    int oldItemPosition = groceryList.getPosition(itemToReplace);
    System.out.println("Enter the new item: ");
    String newItem = scan.nextLine();
    groceryList.modifyGroceryItem(oldItemPosition, newItem);
    System.out.println("\n"+"Updated list: "+"\n");
    
  }

  private static void newItem() {
    System.out.println("Enter the new item to be added in the grocery list: ");
    String newItem = scan.nextLine();
    scan.nextLine();
    boolean isAdded = groceryList.addGroceryItem(newItem);
    if(isAdded) {
      System.out.println(newItem+" is successfully added to the grocery list.");
    }else {
      System.out.println("No item is added to the grocery list unfortutnately.");
    }
  }

  private static void printInstructions() {
    // TODO Auto-generated method stub
    System.out.println("Choose from the options below");
    System.out.println("0. Print Instructions");
    System.out.println("1. Get grocery list");
    System.out.println("2. Add new item in the list");
    System.out.println("3. Replace existing item in the list");
    System.out.println("4. Remove item from the list");
    System.out.println("5. Search for an item in the list");
  }

  private static void groceryList() {
    groceryList.getGroceryList();
  }
  
}
