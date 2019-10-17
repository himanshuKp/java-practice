package flourPackProblem;

public class FlourPacker {
    
  public static boolean canPack(int bigCount, int smallCount, int goal) {
    if(bigCount<0 || smallCount<0 || goal<0) {
      return false;
    }else {
      int bigCountBag = bigCount * 5;
      int smallCountBag = smallCount*1;
      int goalAmount = bigCountBag + smallCountBag;
      int remain = goal%5;
      int canBeFilled = (goal/5)*5;
//      System.out.println(goalAmount - (goal%5));
//      System.out.println((goal/5)*5);
//      System.out.println(bigCountBag-goal);
//      System.out.println((bigCount*bigCountBag)/bigCount-goal);
//      System.out.println(bigCount*bigCountBag-goal);
      return (goalAmount - remain>=canBeFilled && smallCount>= remain);
      }
  }
}
