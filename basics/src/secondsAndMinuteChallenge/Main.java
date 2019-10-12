package secondsAndMinuteChallenge;

public class Main {
  public static void main(String[] args) {
    getDurationString(3000);
  }
  
  public static int getDurationString(int minutes, int seconds) {
    if(minutes<0 || (seconds < 0) || (seconds > 59)) {
      System.out.println("Invalid value");
      return -1;
    }else {
      System.out.println("Count: minutes : " +minutes+ " seconds: " +seconds);
      int calculateHour = (minutes/60);
//      System.out.println("Hours: " +calculateHour);
      int calculateMinutes = ((minutes)%60);
//      System.out.println("Minutes: " +calculateMinutes);
      int calculateSeconds = (minutes*60 + seconds) - (calculateHour*3600 + calculateMinutes*60);
      System.out.println("Final: "+calculateHour + " h " + calculateMinutes + " m " + calculateSeconds + " s.");
      return seconds;
    }
  }
  
  public static int getDurationString(int seconds) {
    if(seconds < 0) {
      System.out.println("Invalid value");
      return -1;
    }else {
      int calculateMinutes = (seconds)/60;
      System.out.println("calculated minutes : " +calculateMinutes);
      return getDurationString(calculateMinutes,(seconds%60));
    }
  }
}
