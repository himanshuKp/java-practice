
public class Operators {

	public static void main(String[] args) {
//		boolean x = false;	
//		System.out.println(x);

//		int x = 5;
//		
//		if(x==10)
//			System.out.println("condition");
//		System.out.println("false");

		int a = 3;
		/*
		 * a = a++; System.out.println("Post increment a: "+a); //
		 * System.out.println(a); a = ++a; System.out.println("Pre increment a: "+a); a
		 * = a--; System.out.println("post decrement a: " +a); // a = a--; //
		 * System.out.println("post decrement a: " +a); a = --a;
		 * System.out.println("Pre decrement a: " +a);
		 */

		/*
		 * float x =4; x*=5; x-=6; x+=1; x/=2;
		 * 
		 * System.out.println(x);
		 */

//		float value = 1.0f;
		/*
		 * char value = 'a'; switch(value) { case 1: System.out.println("1"); break;
		 * case 2: System.out.println("2"); break; default:
		 * System.out.println("default"); break; }
		 */
		
		int isPrime = 3;
		int flag = 0;		
		
		for (int i=2;i<=isPrime/2;++i) {
			if (isPrime%i==0) {
//				System.out.println("The number "+isPrime+" is not a prime number");
				flag = 1;
				break;
			}
		}
		
		if (isPrime == 1) {
			System.out.println("1 is neither prime nor composite");
		}else {
			if (flag == 0) {
				System.out.println(isPrime+" is a prime number");
			}else {
				System.out.println(isPrime+" is not a prime number");
			}
		}
		
		
	}
}
