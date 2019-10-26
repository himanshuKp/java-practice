package com.himanshu.challenge.createRoom;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Bed theBed = new Bed("Kashmir woord", "King size", 2, 12, 1);
    Table theTable = new Table("Kashmir wood","Side of bed",2,1);
    Bathroom theBathroom = new Bathroom(new Bathtub("Studds", "Hot water bubble"));
    Bedroom myBedroom = new Bedroom(theBed, theTable,theBathroom);
    
    myBedroom.myBed();
    myBedroom.myTable();
    myBedroom.myBathroom();
    
  }

}
