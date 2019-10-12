package methodoverloading;

import java.text.DecimalFormat;

public class Main {
  
  static DecimalFormat df = new DecimalFormat();  //limit decimal places
  
  public static void main(String[] args) {  
    
    int newScore = calculateScore("Himanshu", 500);
    System.out.println("New Score is: "+newScore);
    calculateScore(400);
    calculateScore();
   double centimeters = calcFeetAndInchesToCentimeters(6,0);
   if(centimeters<0.0) {
     System.out.println("Invalid parameter");
   }
   calcFeetAndInchesToCentimeters(1234);
  }
  
  public static int calculateScore(String playerName,int score) {
     System.out.println(playerName + " scored: "+ score + " points.");
     return score*1000;  
  }
  
  public static int calculateScore(int score) {
    System.out.println("Unnamed player scored: " +score+ " points.");
    return score*1000;
  }
  
  public static int calculateScore() {
    System.out.println("No player name, no player score.");
    return 0;
  }
  
  public static double calcFeetAndInchesToCentimeters(double feet, double inch) {
    if((feet>=0) || ((inch>=0)&&(inch<=12))) {
      double centiInFeedAndInches = feet*12*2.54 + inch*2.54;
      System.out.println(feet+" feet and " + inch + " inches = " +df.format(centiInFeedAndInches) + " centimeters");
      return centiInFeedAndInches;
    } else {
      System.out.println("Invalid Feet or inches");
      return -1;
    }
  }
  
  public static double calcFeetAndInchesToCentimeters(double inch) {
    if(inch>=0) {
      double feetInInches = (int)  inch/12;
      double remainingInches = (int) inch%12;
      System.out.println(inch + " inches is equal to " +feetInInches+ " feet and " + remainingInches +" inches");
      return calcFeetAndInchesToCentimeters(feetInInches,inch);
    } else {
      System.out.println("Invalid input value");
      return -1;
    }
  }

}
