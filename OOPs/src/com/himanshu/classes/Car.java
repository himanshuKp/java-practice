package com.himanshu.classes;

public class Car {

  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String colour;
    
  //this method basically is now allowing to access to class instances only through 
  //method only after validating it, following the concept of encapsulation
  public void setModel(String model) {
    String modelLowerCase = model.toLowerCase();
    if(modelLowerCase.equals("carrera") || modelLowerCase.equals("mountaineer")) {    
      this.model = model;
    }else {
      this.model = "Unkonwn";
    }
  }
  
  public String getModel() {
    return this.model;
  }
  
}
