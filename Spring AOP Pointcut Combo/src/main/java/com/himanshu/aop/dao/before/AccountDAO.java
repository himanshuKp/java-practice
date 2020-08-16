package com.himanshu.aop.dao.before;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	private String name;
	private String batch;
	
	public String getName() {
		System.out.println(getClass()+": in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass()+": in setName()");
		this.name = name;
	}

	public String getBatch() {
		System.out.println(getClass()+": in getBatch()");
		return batch;
	}

	public void setBatch(String batch) {
		System.out.println(getClass()+": in getBatch()");
		this.batch = batch;
	}

	public void accountDao() {
		System.out.println(getClass()+": calling acccountDao() to handle DB interactions");
	}
	
}
