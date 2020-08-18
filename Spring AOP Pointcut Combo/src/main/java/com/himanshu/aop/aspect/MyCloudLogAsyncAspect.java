package com.himanshu.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class MyCloudLogAsyncAspect {
	@Before("com.himanshu.aop.aspect.MyAOPExpressions.forDAOpackageNoGetterSetter()")
	public void logToCloudAsync() {
		System.out.println("===========> performing log analytics here");
	}
}
