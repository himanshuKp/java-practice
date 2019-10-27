package com.himanshu.challenge.Burger;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Hamburger ham = new Hamburger(1, "Chicken");
    System.out.println("Base burger price: " +ham.getBasePrice());

    System.out.println("Every item is $1 extra");

    //display list of all additional items available to add
    ham.allItemsList();
    
    //item addition to burger process start here
    Scanner sc = new Scanner(System.in);
    
    boolean hasNextInt = sc.hasNextInt();
    
    while(hasNextInt) {
      
      int element = sc.nextInt();
      sc.nextLine();
      if(element>0&&element<5&&ham.finalItems!=4) {
        //calls function in hamburger class to add element to hamburger
        ham.addAdditionalItems(element);    
      }else {
        System.out.println("Oops! No more items can be added now.");
        break;
      } 
      
    }
    sc.close();
    //item addition to burger process ends here
    
    System.out.println("Final price to pay: " +ham.getBasePrice());
  }

}
