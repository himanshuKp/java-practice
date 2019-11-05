package com.himanshu.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

}
