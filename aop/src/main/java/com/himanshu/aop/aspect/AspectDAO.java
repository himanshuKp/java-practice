package com.himanshu.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDAO {

	@Before("execution(public void accountDao())")
	public void runBeforeDAOMethod() {
		System.out.println("Running before DAO method");
	}
	
}
