package com.abstraction.challenge;

public class Main {

	public static void main(String[] args) {
		TouchScreenLaptop tcl = new HPNotebook();
		tcl.scroll();
		tcl.click();
		
		TouchScreenLaptop tcl2 = new DellNotebook();
		tcl2.scroll();
		tcl2.click();
	}
	
}
