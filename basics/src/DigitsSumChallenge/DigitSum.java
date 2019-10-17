
public class DigitSum {
	public static int sumDigits(int number) {
		
		if(number<0 || (number>0 && number<10)){
			return -1;
		}
		
		int totalSum = 0;
		
		while(number%10!=0) {
			totalSum += number%10;
			number = number/10;
		}
		
		return totalSum;
	}
}
