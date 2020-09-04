package com.encapsulation.challenge;

public class Main {

	public static void main(String[] args) {
		Patient p = new Patient();
		p.setId(1);
		p.setName("himanshu");
		p.setSsn("SSSSSS");
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getSsn());
	}
	
}
