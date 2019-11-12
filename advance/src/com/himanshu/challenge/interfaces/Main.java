package com.himanshu.challenge.interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Player player1 = new Player("Himanshu", 10, 100);
    System.out.println(player1.toString());
    saveObject(player1);
    
    player1.setHitPoints(101);
    System.out.println(player1);
    player1.setWeapon("Missile");
    saveObject(player1);
    loadObject(player1);
    System.out.println(player1);
  }

  public static ArrayList<String> readValues(){
    ArrayList<String> values = new ArrayList<String>();
    boolean flag = false;
    int count=0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your choice:\n"
        + "1 - to enter a string\n"
        + "2 - to quit\n");
    
    while(!flag) {
      System.out.println("Choose an option: ");
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch(choice) {
      case 1:
        System.out.println("Enter a string");
        String stringInput = scanner.nextLine();
        values.add(count, stringInput);
        count++;
        break;
     case 2:
       flag = true;
       break;
    }     
    }
    scanner.close();
    return values;
  }
  
  public static void saveObject (ISaveable objectToSave) {
    for(int i=0;i<objectToSave.write().size();i++){
      System.out.println("Saving: " +objectToSave.write().get(i) + " to storage device");
    }
  }
  
  public static void loadObject(ISaveable objectToLoad) {
    ArrayList<String> values =  readValues();
    objectToLoad.read(values);
  }
  
}
