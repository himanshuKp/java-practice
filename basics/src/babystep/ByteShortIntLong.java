package babystep;

public class ByteShortIntLong {
  public static void main(String[] args) {
    @SuppressWarnings("unused")
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
    
    byte myByteMinValue = Byte.MIN_VALUE;   //byte occupies 8 bits
    byte myByteMaxValue = Byte.MAX_VALUE;
    
    System.out.println("Byte Minimum Value: " +myByteMinValue);
    System.out.println("Byte Maximum Value: " +myByteMaxValue);
    
    short  myShortMinValue = Short.MIN_VALUE;
    short myShortMaxValue = Short.MAX_VALUE;
    
    System.out.println("Short Minimum Value: " +myShortMinValue);
    System.out.println("Short Maximum Value: " +myShortMaxValue);
    
    long myLongValue = 2_147_483_647_123L;
    System.out.println("Long Value: " +myLongValue);
    
    long  myLongMinValue = Long.MIN_VALUE;
    long myLongMaxValue = Long.MAX_VALUE;
    
    System.out.println("Long Minimum Value: " +myLongMinValue);
    System.out.println("Long Maximum Value: " +myLongMaxValue);
    
  }
}
