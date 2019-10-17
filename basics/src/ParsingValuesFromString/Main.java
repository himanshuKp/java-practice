package ParsingValuesFromString;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String numberAsString = "2018";
    
    System.out.println("Number as string: " +numberAsString);
    
    //parse string as int
    int number = Integer.parseInt(numberAsString);
    
    System.out.println("Number: " +number);
    
    numberAsString += 1;
    number += 1;
    
    System.out.println("Number as string: " +numberAsString);
    System.out.println("Number: " +number);
  }

}
