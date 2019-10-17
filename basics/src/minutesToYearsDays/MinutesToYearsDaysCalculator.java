package minutesToYearsDays;

public class MinutesToYearsDaysCalculator {
  public static void printYearsAndDays(long minutes) {
    if(minutes<0) {
      System.out.println("Invalid Value");
    } else {
      long currentMinutes = minutes;
      long hours = minutes / 60;
//      long remainingMinutes = minutes % 60;
//      System.out.println("Hours: " +hours);
//      System.out.println("Reamining minutes: " +remainingMinutes);
      long days = hours/24;
//      long remainingHours= hours % 24;
//      System.out.println("Days: " +days);
//      System.out.println("Reamining hours: " +remainingHours);
      long years = days/365;
      long remainingDays = days%365;
      System.out.println(currentMinutes+" min = "+years+" y and " +remainingDays+" d");
      }
    }
}
