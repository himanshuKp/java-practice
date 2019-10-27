package com.himanshu.challenge.Burger;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Hamburger ham = new Hamburger(1, "Chicken");
    System.out.println("Base burger price: " +ham.getBasePrice());

    System.out.println("Every item is $1 extra");

    ham.allItemsList();
    Scanner sc = new Scanner(System.in);
    
    boolean hasNextInt = sc.hasNextInt();
    
    while(hasNextInt) {
      
      int element = sc.nextInt();
      sc.nextLine();
      if(element>0&&element<5&&ham.finalItems!=4) {
        ham.addAdditionalItems(element); 
      }else {
        System.out.println("Oops! No more items can be added now.");
        break;
      } 
      
    }
    
    sc.close();
    
    System.out.println("Final price to pay: " +ham.getBasePrice());
  }

}
