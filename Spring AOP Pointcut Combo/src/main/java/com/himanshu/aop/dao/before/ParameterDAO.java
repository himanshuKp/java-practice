package com.himanshu.aop.dao.before;

import org.springframework.stereotype.Component;

import com.himanshu.aop.Account;

@Component
public class ParameterDAO {

	public void accountParameterDAO(Account account) {
		System.out.println(getClass()+": with account parameter.");
	}
	
}
