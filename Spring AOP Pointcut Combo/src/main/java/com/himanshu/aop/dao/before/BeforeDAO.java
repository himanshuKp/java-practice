package com.himanshu.aop.dao.before;

import org.springframework.stereotype.Component;

@Component
public class BeforeDAO {

	public void accountBeforeDAO() {
		System.out.println(getClass()+": is called for accountDAO method.");
	}
	
}
