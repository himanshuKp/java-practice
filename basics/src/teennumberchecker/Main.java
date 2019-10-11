package teennumberchecker;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    if(TeenNumberChecker.hasTeen(0,60,19)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    if(TeenNumberChecker.hasTeen(13,10,22)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    if(TeenNumberChecker.hasTeen(0,0,20)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    
    //isTeen
    if(TeenNumberChecker.isTeen(0)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    if(TeenNumberChecker.isTeen(13)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    if(TeenNumberChecker.isTeen(10)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
  }

}
