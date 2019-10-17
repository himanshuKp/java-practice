package equalsumchecker;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    if(EqualSumChecker.hasEqualSum(1,1,1)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    if(EqualSumChecker.hasEqualSum(1,1,2)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    if(EqualSumChecker.hasEqualSum(1,-1,0)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
  }

}
