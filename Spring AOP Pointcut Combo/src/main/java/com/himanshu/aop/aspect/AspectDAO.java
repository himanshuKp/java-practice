package com.himanshu.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class AspectDAO {

	@Before("com.himanshu.aop.aspect.MyAOPExpressions.forDAOpackageNoGetterSetter()")
	public void runBeforeDAOMethod() {
		System.out.println("-----> executing @Before advice before method");
	}

}
