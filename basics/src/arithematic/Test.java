package arithematic;

public class Test {

	private static void m1() {
		byte a = 10;
		byte b = 10;
		byte c = (byte) (a+b);
		System.out.println(c);
	}
	
	private static void m2() {
		byte a = 10;
//		internal type casting will be performed here
		a++;
		System.out.println(a);
	}
	
	private static void m3() {
		byte a = 10;
//		no internal type casting is done in this case
//		cast to byte is required, as int operation is going
		a = (byte) (a+1);	
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		m1();
		m2();
		m3();
	}

}
