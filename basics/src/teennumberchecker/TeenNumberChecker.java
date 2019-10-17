package teennumberchecker;

public class TeenNumberChecker {
  public static boolean hasTeen(int firstPersonAge, int secondPersonAge, int thirdPersonAge) {
    if( (firstPersonAge>=13 && firstPersonAge<=19) || (secondPersonAge>=13 && secondPersonAge<=19) 
        || (thirdPersonAge>=13 && thirdPersonAge<=19)) {
      return true;
    } else {
      return false;
    }
  }
  
  public static boolean isTeen(int firstPersonAge) {
    if( firstPersonAge>=13 && firstPersonAge<=19) {
      return true;
    } else {
      return false;
    }
  }
}
