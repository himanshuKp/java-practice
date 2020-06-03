package com.practice.animal.demo;

import com.practice.animal.reptile.Crocodile;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crocodile croc = new Crocodile(20,300,"Land","cold blood");
		croc.setBackbone(true);
		croc.setSkinType("Hard");
		croc.setSoftShellEggs(false);
		croc.showInfo();
	}

}
