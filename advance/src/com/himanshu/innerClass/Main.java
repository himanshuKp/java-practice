package com.himanshu.innerClass;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    GearBox mcLaren = new GearBox(6);
    GearBox.Gear first = mcLaren.new Gear(1, 12.3);
    System.out.println(first.driveSpeed(1000));
  }

}
