package com.himanshu.enums;

enum Fish {
	STAR,GRUPY,GOLD,SHARK;
	Fish(){
		System.out.println("Constructor");
	}
	//public static void main(String[] args) {
	//	System.out.println("Enum main method");
	//}
}
class Test{
	public static void main(String[] args) {
		Fish f = Fish.GOLD;
		System.out.println("Hello "+f);
	}
}
