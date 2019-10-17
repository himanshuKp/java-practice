package flourPackProblem;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    if(FlourPacker.canPack(1, 0, 4)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    if(FlourPacker.canPack(1, 0, 5)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    if(FlourPacker.canPack(0, 5, 4)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    if(FlourPacker.canPack(2, 2, 11)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    if(FlourPacker.canPack(-3, 2, 12)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    if(FlourPacker.canPack(2,1,5)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
    if(FlourPacker.canPack(5,3,24)) {
      System.out.println("True");
    }else {
      System.out.println("False");
    }
  }
}
