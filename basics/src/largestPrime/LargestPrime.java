package largestPrime;

public class LargestPrime {
  public static int getLargestPrime(int number) {
    
    if(number<=0||number == 1) {
      return -1;
    }else {
      //initialise maximum prime factor variable with the lowest one
      int largestPrime = -1;
      
//      find the number of 2s that divide the number
      while(number % 2 == 0) {
        largestPrime = 2;
        
//        equivalent to n /= 2 or n >>= 1;
        number = number / 2;
      }   
      
//      number must be odd integer by now, skipping even numbers and iterating only over odd integers
      for(int i = 3;i<=Math.sqrt(number);i+=2) {
        while(number % i == 0) {
          largestPrime = i;
          number  = number / i;
        }
      }

      
//      if largestPrime is greater than 2 this will handle it
      if(number > 2)
        largestPrime = number;
      
      return largestPrime;
      
    }
    
  }
}
