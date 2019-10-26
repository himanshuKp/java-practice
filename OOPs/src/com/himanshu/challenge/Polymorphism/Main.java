package com.himanshu.challenge.Polymorphism;

class Car{
  private boolean engine;
  private int cylinders;
  private int wheels;
  private String name;
  
  public Car(int cylinders, String name) {
    this.cylinders = cylinders;
    this.name = name;
    this.engine = true;
    this.wheels = 4;
  }

  protected String getName() {
    return name;
  }

  protected int getCylinders() {
    return cylinders;
  }
  
  public String startEngine() {
    return "Engine has started";
  }
  
  public String accelerate() {
    return "Car is accelerating";
  }
  
  public String brake() {
    return "Brake has applied";
  }
  
}

class Audi extends Car{
  
  public Audi() {
    super(6,"Audi A4");
  }

  @Override
  public String startEngine() {
    return getClass().getName()+" engine is starting";
  }

  @Override
  public String accelerate() {
    return getClass().getName()+" with " +new Audi().getCylinders()+" number of cylinders is accelerating";
  }

  @Override
  public String brake() {
    return getClass().getName()+" with " +new Audi().getCylinders()+" number of cylinders has applied brakes.";
  }
  
}

class BMW extends Car{
  
  public BMW() {
    super(8,"BMW M3");
  }

  @Override
  public String startEngine() {
    return getClass().getSimpleName()+" engine is starting";
  }

  @Override
  public String accelerate() {
    return getClass().getSimpleName()+" with " +new BMW().getCylinders()+" number of cylinders is accelerating";
  }

  @Override
  public String brake() {
    return getClass().getSimpleName()+" with " +new BMW().getCylinders()+" number of cylinders has applied brakes.";
  }
  
}

class Bugatti extends Car{
  
  public Bugatti() {
    super(12,"Bugatti Veyron");
  }

  @Override
  public String startEngine() {
    return new Bugatti().getName()+" engine is starting";
  }

  @Override
  public String accelerate() {
    return new Bugatti().getName()+" with " +new Bugatti().getCylinders()+" number of cylinders is accelerating.";
  }

  @Override
  public String brake() {
    return new Bugatti().getName()+" with " +new Bugatti().getCylinders()+" number of cylinders has applied brakes.";
  }
  
}

public class Main {

  public static void main(String[] args) {
    BMW myBMW = new BMW();
    System.out.println(myBMW.startEngine());
    System.out.println(myBMW.accelerate());
    System.out.println(myBMW.brake());
  }

}
