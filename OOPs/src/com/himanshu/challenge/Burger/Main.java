package com.himanshu.challenge.Burger;

import java.util.Scanner;

public class Main {

  protected static Scanner scan = new Scanner(System.in);
	
  public static void main(String[] args) {
	  
	System.out.println("Enter the type of burger you want to order:");
	  
	System.out.println("1. Basic Hamburger"+"\n"+"2. Healthy Hamburger"+"\n"+"3. Deluxe Hamburger"+"\n");

	boolean mainNextInt = scan.hasNextInt();
	
	while(mainNextInt) {
		int element = scan.nextInt();
		
		scan.nextLine();
		
		if(element>0&&element<4) {
			switch(element) {
			case 1: Hamburger();
					break;
			case 2: HealthyBurger();
					break;
			case 3: DeluxeBurger();
					break;
			}
		}else {
			System.out.println("Press any key to exit now");
			System.out.println("Exiting now");
			break;
		}
	}
	scan.close();
  } 

  private static void allTypes() {
	  System.out.println("Enter the type of burger you want to order:");
	  
	  System.out.println("1. Basic Hamburger"+"\n"+"2. Healthy Hamburger"+"\n"+"3. Deluxe Hamburger"+"\n"+"4. EXIT");
  }
  
  protected static void DeluxeBurger() {
	  DeluxeBurger deluxeBurger = new DeluxeBurger("mutton");
		System.out.println("You have selected deluxe burger \n");
		System.out.println("Deluxe Burger base price: "+deluxeBurger.getBasePrice());

		System.out.println("Every item is $1 extra");

		
		deluxeBurger.allItemsList();
		
		//item addition to burger process start here
		boolean deluxeNextInt = scan.hasNextInt();    
		while(deluxeNextInt) {
			      
		  int element = scan.nextInt();
		  scan.nextLine();
		  if(element>0&&element<5&&deluxeBurger.finalItems!=2) {
		  //calls function in hamburger class to add element to hamburger
			  deluxeBurger.addAdditionalItems(element);    
		  }else {
	      System.out.println("Oops! No more items can be added now.");
	      break;
		  } 
			      
		 }
		 //item addition to burger process ends here
			    
		 System.out.println("Final price to pay: " +deluxeBurger.getBasePrice());
		 allTypes();
		 
  }

  protected static void HealthyBurger() {
		HealthyBurger healthyBurger = new HealthyBurger("sausage");
		System.out.println("You have selected healthy burger \n");
		System.out.println("Healthy Burger base price: "+healthyBurger.getBasePrice());
  
		System.out.println("Every item is $1 extra");
		
		healthyBurger.allItemsList();
		
		//item addition to burger process start here
		boolean healthyNextInt = scan.hasNextInt();
		while(healthyNextInt) {
			      
		  int element = scan.nextInt();
		  scan.nextLine();
		  if(element>0&&element<3&&healthyBurger.finalItems!=2) {
		  //calls function in hamburger class to add element to hamburger
			  healthyBurger.addAdditionalItems(element);    
		  }else {
	      System.out.println("Oops! No more items can be added now.");
	      break;
		  } 
			      
		 }
		 //item addition to burger process ends here
			    
		 System.out.println("Final price to pay: " +healthyBurger.getBasePrice());
		 allTypes();
  }

  public static void Hamburger() {
	  Hamburger ham = new Hamburger("Basic", "Chicken");
	  System.out.println("You have selected basic burger \n");
	  System.out.println("Base burger price: " +ham.getBasePrice());
	
	  System.out.println("Every item is $1 extra");
	
	  //display list of all additional items available to add
	  ham.allItemsList();
		    
	  //item addition to burger process start here
	  boolean hamNextInt = scan.hasNextInt();
	  while(hamNextInt) {
		      
	     int element = scan.nextInt();
	     scan.nextLine();
	     if(element>0&&element<5&&ham.finalItems!=4) {
	     //calls function in hamburger class to add element to hamburger
	     ham.addAdditionalItems(element);    
	     }else {
         System.out.println("Oops! No more items can be added now.");
         break;
		 } 
		      
		 }
		 //item addition to burger process ends here
		    
		 System.out.println("Final price to pay: " +ham.getBasePrice());
		 allTypes();
  }
	  
}
