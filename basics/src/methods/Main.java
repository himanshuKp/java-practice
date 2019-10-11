package methods;

public class Main {

  public static void main(String[] args) {
    
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;
    
    int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
    System.out.println("Your final score was: "+highScore);
    
    score = 10000;
    levelCompleted = 8;
    bonus = 300;
    
    highScore = calculateScore(gameOver,score,levelCompleted,bonus);
    System.out.println("Your final score was: "+highScore);
    
    displayHighScorePosition("Player A", calculateHighScorePosition(1001));
    displayHighScorePosition("Player B", calculateHighScorePosition(700));
    displayHighScorePosition("Player C", calculateHighScorePosition(300));
    displayHighScorePosition("Player D", calculateHighScorePosition(50));
    
  }
  
  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if(gameOver) {
      
      int finalScore = score + (levelCompleted*bonus);
      finalScore += 2000;
      return finalScore;
    }else {
      
//      in programming terms -1 is used to indicate an error
//      in searching algorithms -1 indicated invalid value or value not found
      return -1;
    }
  }
  
//  void method is also called as procedure
  public static void displayHighScorePosition(String playerName, int positionInHighScoreTable) {
    System.out.println(playerName + " managed to get into position " + positionInHighScoreTable + " on the high score table");
  }
  
  public static int calculateHighScorePosition(int playerScore) {
    /*
     * if(playerScore>=1000) { return 1; } else
     * if(playerScore>=500&&playerScore<1000) { return 2; } else
     * if((playerScore>=100)&&(playerScore<500)) { return 3; } else { return 4; }
     */
    
      int position = 4;     //assuming position 4 will be returned
      
      if(playerScore >= 1000) {
        position = 1;
      } else if(playerScore >= 500) {
        position = 2;
      } else if(playerScore >= 100) {
        position = 3;
      } 
      
      return position;
  }
  

}
