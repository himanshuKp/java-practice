package secondsAndMinuteChallenge;

public class Main {
  
  private static final String INVALID_VALUE_MESSAGE = "Inavlid Value";
  
  public static void main(String[] args) {
    System.out.println(getDurationString(3000));
  }
  
  public static String getDurationString(int minutes, int seconds) {
    if(minutes<0 || (seconds < 0) || (seconds > 59)) {
       return INVALID_VALUE_MESSAGE;
    }else {
      System.out.println("Count: minutes : " +minutes+ " seconds: " +seconds);
      int calculateHour = (minutes/60);
//      System.out.println("Hours: " +calculateHour);
      int calculateMinutes = ((minutes)%60);
//      System.out.println("Minutes: " +calculateMinutes);
      int calculateSeconds = (minutes*60 + seconds) - (calculateHour*3600 + calculateMinutes*60);
      return ("Final: "+calculateHour + " h " + calculateMinutes + " m " + calculateSeconds + " s.");
    }
  }
  
  public static String getDurationString(int seconds) {
    if(seconds < 0) {
      return INVALID_VALUE_MESSAGE;
    }else {
      int calculateMinutes = (seconds)/60;
      System.out.println("calculated minutes : " +calculateMinutes);
      return getDurationString(calculateMinutes,(seconds%60));
    }
  }
}
