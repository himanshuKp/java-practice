package com.himanshu.polymorphism;

class Movie {
  private String name;

  public Movie(String name) {
    this.name = name;
  }
  
  public String plot() {
    return "No plot here";
  }

  protected String getName() {
    return name;
  }
  
}

class Jaws extends Movie {

  public Jaws() {
    super("Jaws");
  }

  @Override
  public String plot() {
    return "Shark eats a lot of people";
  }
  
}

class Avengers extends Movie{
  
  public Avengers() {
    super("Avengers");
  }
  
  @Override
  public String plot() {
    return "A lot of superheroes fight against aliens to protect earth";
  }
}

class Batman extends Movie{
  
  public Batman() {
    super("Batman");
  }
  
  @Override
  public String plot() {
    return "A guy in mask fight bad guyes at night";
  }
  
}

class Spiderman extends Movie{
  
  public Spiderman() {
    super("Spiderman: Far from home");
  }
  
  @Override
  public String plot() {
    return "A guy shoots web from his hands";
  }
  
}

public class Main {

  public static void main(String[] args) {
     for(int i=0;i<=10;i++) {
       Movie movie = randomMovie();
       System.out.println("Movie number: #"+i+" \n" + "Movie name: " +movie.getName()+" \n" +"Movie plot is: " +movie.plot()+ "\n");
     }
  }

  public static Movie randomMovie() {
    int randomNumber = (int) ((Math.random()*4) + 1);
    System.out.println("Random number generated is: " +randomNumber);
    switch(randomNumber) {
    case 1:
      return new Jaws();
      
    case 2:
      return new Avengers();
     
    case 3:
      return new Batman();
      
    case 4:
      return new Spiderman();
      
    }
    return null;
  }
  
}
