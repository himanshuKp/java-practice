package minAndMax;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
 
    int minimumNumber = Integer.MAX_VALUE;
    int maximumNumber = Integer.MIN_VALUE;
    
    while(true) {
      System.out.println("Enter number:");
      if(scanner.hasNextInt()) {
        int temp = scanner.nextInt();
        
        if(temp>maximumNumber) {
          maximumNumber = temp;
        }
        
        if (temp<minimumNumber){
          minimumNumber = temp;
        }
        
        
      }else {
          break;
      }
      scanner.nextLine();
    }
    scanner.close();
    
    System.out.println("Program ended: Minimum number = "+minimumNumber+" Maximum number = " +maximumNumber );
    
  }

}
