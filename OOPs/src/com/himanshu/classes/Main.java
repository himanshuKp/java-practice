package com.himanshu.classes;

public class Main {

  public static void main(String[] args) {
    
    Car porsche = new Car();
    Car jeep = new Car();
    
    //System.out.println( "Model is " +porsche.getModel());
    
    jeep.setModel("mountaineer");
    
    System.out.println( "Model is " +jeep.getModel());
  }

}
