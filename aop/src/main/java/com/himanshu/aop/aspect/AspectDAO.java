package com.himanshu.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDAO {

	@Before("execution(public void account*())")
	public void runBeforeDAOMethod() {
		System.out.println("-----> executing @Before advice before method");
	}
	
}
