package com.himanshu.challenge.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
  
  private String name;
  private int hitPoints;
  private int strength;
  private String weapon;
  
  public Player(String name, int hitPoints, int strength) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.strength = strength;
    this.weapon = "Sword";
  }

  protected String getName() {
    return name;
  }

  protected void setName(String name) {
    this.name = name;
  }

  protected int getHitPoints() {
    return hitPoints;
  }

  protected void setHitPoints(int hitPoints) {
    this.hitPoints = hitPoints;
  }

  protected int getStrenght() {
    return strength;
  }

  protected void setStrenght(int strength) {
    this.strength = strength;
  }

  protected String getWeapon() {
    return weapon;
  }

  protected void setWeapon(String weapon) {
    this.weapon = weapon;
  }
  
  @Override
  public String toString() {
    return "Player {" +
                "name: " +name+ '\n' +
                "Hit Points: " +hitPoints+ "\n" +
                "Strenght: " +strength+"\n" +
                "Weapon: " +weapon+"\n"+
                "}";
  }

  @Override
  public List<String> write() {
    List<String> values = new ArrayList<String>();
    values.add(0,this.name);
    values.add(1,""+this.hitPoints);
    values.add(2,"" + this.strength);
    values.add(3, this.weapon);
    
    return values;
  }

  @Override
  public void read(List<String> savedValues) {
    if(savedValues != null && savedValues.size() > 0) {
      this.name = savedValues.get(0);
      this.hitPoints = Integer.parseInt(savedValues.get(1));
      this.strength = Integer.parseInt(savedValues.get(2));
      this.weapon = savedValues.get(3);
    }
  }
  
}
