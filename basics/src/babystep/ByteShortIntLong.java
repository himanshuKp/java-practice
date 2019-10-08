package babystep;

public class ByteShortIntLong {
  public static void main(String[] args) {
    int myValue = 10000;
    
    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    
    System.out.println("Integer Minimum Value: " +myMinIntValue);
    System.out.println("Integer Maximum Value: " +myMaxIntValue);
    
    System.out.println("Busted Max Value "+(myMaxIntValue+1));
    System.out.println("Busted Min Value "+(myMinIntValue-1));
    
    //indentation with _ works with no problem
    int myMaxNumber = 2_147_483_647;
    
    System.out.println("MyMaxNumber "+myMaxNumber);
  }
}
