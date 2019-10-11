package decimalcomparator;

public class DecimalComparator {
  public static boolean areEqualByThreeDecimalPlaces(double firstNumber,double secondNumber) {
   int x,y;
   
   if(firstNumber>=0 && secondNumber>=0) {
     x = (int)Math.abs(firstNumber*1000);
     y = (int)Math.abs(secondNumber*1000);
   } else if(firstNumber<0 && secondNumber< 0) {
     x = (int)Math.abs(firstNumber*1000);
     y = (int)Math.abs(secondNumber*1000);
   } else {
     return false;
   }
    if(x==y) {
     return true;
   }else {
     return false;
   }
  }
}
