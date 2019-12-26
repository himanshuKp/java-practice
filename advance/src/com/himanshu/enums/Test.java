package com.himanshu.enums;

enum Fish {
	STAR(1000) {
		@Override
		void m1() {
			// TODO Auto-generated method stub
			System.out.println("Star abstract method");
		}
	},GRUPY(3000) {
		@Override
		void m1() {
			// TODO Auto-generated method stub
			System.out.println("Grupy abstract method");
		}
	},GOLD(200) {
		@Override
		void m1() {
			// TODO Auto-generated method stub
			System.out.println("Gold abstract method");
		}
	},SHARK {
		@Override
		void m1() {
			// TODO Auto-generated method stub
			System.out.println("Shark abstract method");
		}
	};
	int price;
	Fish(){
		this.price = 50;
		System.out.println("Constructor");
	}
	//public static void main(String[] args) {
	//	System.out.println("Enum main method");
	//}
	Fish(int price){
		this.price = price;
	}
	abstract void m1();
}
class Test{
	public static void main(String[] args) {
		Fish[] myFishes = Fish.values();
		for(Fish myFish:myFishes)
		{
			System.out.println("Fish: " +myFish+". Price: " +myFish.price);
			myFish.m1();
		}
	}
}
