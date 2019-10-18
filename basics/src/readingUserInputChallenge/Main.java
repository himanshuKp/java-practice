package readingUserInputChallenge;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int sum = 0;
    int counter=1;
    
    while( counter!=11) {  
      System.out.println("Enter number #"+counter+": ");
      boolean checkInputValue = scanner.hasNextInt();
      if(checkInputValue) {      
        int value = scanner.nextInt();
        counter++;
        sum += value;
      }else {
        System.out.println("Invalid number");
      }
      scanner.nextLine();   //handle end of line
    }
    scanner.close();
    System.out.println("Total sum is: " +sum);

  }

}
