package leapyearcalculator;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    if(LeapYear.isLeapYear(-1600)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    
    if(LeapYear.isLeapYear(1600)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    
    if(LeapYear.isLeapYear(2017)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    
    if(LeapYear.isLeapYear(2000)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
  }

}
