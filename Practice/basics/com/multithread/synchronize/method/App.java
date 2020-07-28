package com.multithread.synchronize.method;

class Brackets {
	public void generate() {
		for(int i=1;i<=10;i++) {
			if(i<=5) {
				System.out.println("[");
			}else {
				System.out.println("]");
			}
		}
		System.out.println();
	}
}

/**
 * @author Himanshu Kandpal
 *
 */
public class App {

	public static void main(String[] args) {
		Brackets bracket = new Brackets();
		bracket.generate();
		new Thread().start();
	}

}
