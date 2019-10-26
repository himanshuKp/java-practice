package com.himanshu.challenge.createRoom;

public class Bedroom {
  private Bed theBed;
  private Table theTable;
  private Bathroom theBathroom;
  
  public Bedroom(Bed theBed, Table theTable, Bathroom theBathroom) {
    this.theBed = theBed;
    this.theTable = theTable;
    this.theBathroom = theBathroom;
  }

  public void myBed() {
    theBed.createBed();
  }
  
  public void myTable() {
    theTable.createdTable();
  }
  
  public void myBathroom() {
    theBathroom.myBathroom();
  }
  
}
