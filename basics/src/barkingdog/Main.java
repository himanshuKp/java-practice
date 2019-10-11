package barkingdog;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    if(BarkingDog.shouldWakeUp(true, 1)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    
    if(BarkingDog.shouldWakeUp(false, 2)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    
    if(BarkingDog.shouldWakeUp(true, 8)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    
    if(BarkingDog.shouldWakeUp(true, 23)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    
  }

}
