package com.himanshu.composition;

public class Main {
  public static void main(String[] args) {
    Dimensions dimensions = new Dimensions(20,20,4);
    Case theCase = new Case("22DD","Dell","22V",dimensions);
    
    Monitor theMonitor = new Monitor("21 inch beast","Acer",27,new Resolution(2180, 1770));
    Motherboard theMotherboard = new Motherboard("B3-299","ASUS",4,6,"v2.44");
    
    PC thePC = new PC(theCase,theMonitor,theMotherboard);
    thePC.getMonitor().drawPixel(1500, 2000, "red");
    thePC.getMotherboard().loadProgram("Windows 19");
    thePC.getTheCase().pressPowerButton();
  }
}
