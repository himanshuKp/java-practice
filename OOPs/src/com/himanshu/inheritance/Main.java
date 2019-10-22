package com.himanshu.inheritance;

public class Main {

  public static void main(String[] args) {
    
    Animal animal = new Animal("Animal",1,1,1,1);
    
    Dog dog = new Dog("Mickey",5,40,2,4,1,20,"Long silky coat");
    
//    dog.eat();
//    dog.walk();
//    dog.run();
//        
    Fish fish = new Fish("Dino",1,2,2,2,1);
    fish.swim(10);
  }

}
