package com.himanshu.aop.dao.before;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.himanshu.aop.Account;

@Component
public class AccountDAO {

	private String name;
	private String batch;
	
//	add method findAccount()
	
	public List<Account> findAccounts() {
		List<Account> myAccounts = new ArrayList<Account>();
		
//		create sample accounts
		Account temp1 = new Account("Himanshu", "silver");
		Account temp2 = new Account("Pratibha", "gold");
		Account temp3 = new Account("Nandi", "platinum");
		
//		add accounts to list
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		return myAccounts;
	}
	
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
