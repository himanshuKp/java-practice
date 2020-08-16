package com.himanshu.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDAO {

	@Pointcut("execution(* com.himanshu.aop.dao.before.*.*(..))")
	private void beforePointCut() {
//		this will not show any output
		System.out.println("Pointcut declaration");
	}
	
//	pointcut for getter methods in package
	@Pointcut("execution(* com.himanshu.aop.dao.before.*.get*(..))")
	private void getter() {}
	
	@Pointcut("execution(* com.himanshu.aop.dao.before.*.set*(..))")
	private void setter() {}
	
	@Pointcut("beforePointCut() && !(getter() || setter())")
	private void forDAOpackageNoGetterSetter() {}
	
	@Before("forDAOpackageNoGetterSetter()")
	public void runBeforeDAOMethod() {
		System.out.println("-----> executing @Before advice before method");
	}
	
	@Before("forDAOpackageNoGetterSetter()")
	public void performAnalytics() {
		System.out.println("===========> performing api analytics here");
	}
}
