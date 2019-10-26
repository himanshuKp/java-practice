package com.himanshu.challenge.createRoom;

public class Table {
  private String material;
  private String location;
  private int height;
  private int width;

  public Table(String material, String location, int height, int width) {
    this.material = material;
    this.location = location;
    this.height = height;
    this.width = width;
  }
  
  public void createdTable() {
    System.out.println("Table is build at " +getLocation()+ " with material made of " +getMaterial()+" of dimensions " +getHeight()+ "height and width of " +getWidth());
  }

  private String getMaterial() {
    return material;
  }

  private String getLocation() {
    return location;
  }

  private int getHeight() {
    return height;
  }

  private int getWidth() {
    return width;
  }
   
}
