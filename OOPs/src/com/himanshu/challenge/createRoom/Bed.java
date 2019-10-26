package com.himanshu.challenge.createRoom;

public class Bed {

  private String material;
  private String type;
  private int height;
  private int width;
  private int depthl;
  
  public Bed(String material, String type, int height, int width, int depthl) {
    super();
    this.material = material;
    this.type = type;
    this.height = height;
    this.width = width;
    this.depthl = depthl;
  }
  
  public void createBed() {
    System.out.println("Bed build: material is " +getMaterial()+ " type is " +getType()+ " height is " +getHeight()+ " width is "+getWidth()+ " depth is " +getDepthl());
  }
  
  private String getMaterial() {
    return material;
  }

  private String getType() {
    return type;
  }

  private int getHeight() {
    return height;
  }

  private int getWidth() {
    return width;
  }

  private int getDepthl() {
    return depthl;
  }
  
}
