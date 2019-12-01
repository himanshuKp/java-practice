package com.himanshu.innerClass;

import java.util.ArrayList;

public class GearBox {
  private ArrayList<Gear> gears;
  private int maxGears;
  private int currentGear = 0;
  
  public GearBox(int maxGears) {
    this.maxGears = maxGears;
    this.gears = new ArrayList<>();
    Gear neutral = new Gear(0,0.0);
    this.gears.add(neutral);    
  }
  
  public class Gear{
    private int GearNumber;
    private double ratio;
    
    public Gear(int GearNumber, double ratio) {
      this.GearNumber = GearNumber;
      this.ratio = ratio;
    }
    
    public double driveSpeed(int revs) {
      return revs*(this.ratio);
    }
  }
}
