package com.himanshu.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
      LinkedList<String> placesToVisit = new LinkedList<String>();
      
      addInOrder(placesToVisit, "Sydney");
      addInOrder(placesToVisit, "Melbourne");
      addInOrder(placesToVisit, "Brisbane");
      addInOrder(placesToVisit, "Perth");
      addInOrder(placesToVisit, "Canberra");
      addInOrder(placesToVisit, "Adelaide");
      addInOrder(placesToVisit, "Darwin");
      
      printList(placesToVisit);
      
      addInOrder(placesToVisit, "Alice Springs");
      addInOrder(placesToVisit, "Darwin");
      
      printList(placesToVisit);
      visit(placesToVisit);
      
  }

  private static void printList(LinkedList<String> placesToVisit) {
    Iterator<String> i = placesToVisit.iterator();
    while(i.hasNext()) {                                                                                        //boolean
      System.out.println("Now visiting: " +i.next());                                           //move to next in linkedlist
    }      
    System.out.println("======================");
  }
  
  private static boolean addInOrder(LinkedList<String> linkedList, String newPlaceName) {
    //create a list iterator
    ListIterator<String> listIterator = linkedList.listIterator();
    
    while(listIterator.hasNext()) {
      int comparison = listIterator.next().compareTo(newPlaceName);
      if (comparison == 0) {
        //match found
        System.out.println(newPlaceName+" is already in the list");
        return false;
      }else if(comparison > 0) {
        //enter the element before the current item in the list
        //move to the previous item before adding to the list
        listIterator.previous();
        listIterator.add(newPlaceName);
        return true;
      }else {
        //move on to the next item
      }
    }
    
    //add to the end of the list 
    //use listiterator instead of linkedlist
    listIterator.add(newPlaceName);
    return true;
  }
  
  private static void visit(LinkedList<String> placesToVisit) {
    ListIterator<String> citiesListIterator = placesToVisit.listIterator();
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;
    boolean goingForward = true;
    if(placesToVisit.isEmpty()) {
      System.out.println("No places to visit");
    }else {
      System.out.println("Now visiting: " +citiesListIterator.next());
      printMenu();
    }
    
    while(flag) {
      int actions = scanner.nextInt();
      scanner.nextLine();
      switch(actions) {
      case 0:
        System.out.println("Holiday (vacation) over");
        flag = false;
        break;
        
      case 1:
        if(!goingForward) {
          if(citiesListIterator.hasNext()) {
            citiesListIterator.next();
          }
          goingForward = true;
        }
        
        if(citiesListIterator.hasNext()) {
          System.out.println("Now visiting: " +citiesListIterator.next());
          System.out.println(goingForward);
          printMenu();
        } else {
          System.out.println("Reached the end of the list");      
          System.out.println(goingForward);
          goingForward = false;
          printMenu();
        }
        break;
        
      case 2:
        if(goingForward) {
          if(citiesListIterator.hasPrevious()) {
            citiesListIterator.previous();
          }
          goingForward = false;
        }
        
        if(citiesListIterator.hasPrevious()) {
          System.out.println("Now visiting: " +citiesListIterator.previous());
          System.out.println(goingForward);
          printMenu();
        }else {
          System.out.println("Reached the start of the list");
          System.out.println(goingForward);
          goingForward = true;
          printMenu();
        }
        break;
        
      case 3:
       printMenu();
       break;
      }
    }
    scanner.close();
    
  }

  private static void printMenu() {
    System.out.println("Available actions:\nPress: ");
    System.out.println("0 - to quit\n"
        + "1 - go to next city\n"
        + "2 - go to previous city\n"
        + "3 - print menu options");
  }

}
