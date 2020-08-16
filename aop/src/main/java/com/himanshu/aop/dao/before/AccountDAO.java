package com.himanshu.aop.dao.before;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void accountDao() {
		System.out.println(getClass()+": calling acccountDao() to handle DB interactions");
	}
	
}
