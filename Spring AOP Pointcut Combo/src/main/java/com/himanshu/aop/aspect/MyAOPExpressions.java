package com.himanshu.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAOPExpressions {
	@Pointcut("execution(* com.himanshu.aop.dao.before.*.*(..))")
	public void beforePointCut() {
//		this will not show any output
		System.out.println("Pointcut declaration");
	}
	
//	pointcut for getter methods in package
	@Pointcut("execution(* com.himanshu.aop.dao.before.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution(* com.himanshu.aop.dao.before.*.set*(..))")
	public void setter() {}
	
	@Pointcut("beforePointCut() && !(getter() || setter())")
	public void forDAOpackageNoGetterSetter() {}
}
