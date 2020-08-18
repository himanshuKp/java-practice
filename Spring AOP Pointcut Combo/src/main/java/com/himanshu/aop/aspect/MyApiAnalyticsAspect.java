package com.himanshu.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.himanshu.aop.Account;

@Aspect
@Order(3)
@Component
public class MyApiAnalyticsAspect {

	@Before("com.himanshu.aop.aspect.MyAOPExpressions.forDAOpackageNoGetterSetter()")
	public void performAnalytics(JoinPoint joinPoint) {
		System.out.println("===========> performing api analytics here");
		
//		display the method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		
		System.out.println("Method: " +methodSignature);
		
//		display the method arguments
		
//		get args
		Object[] args = joinPoint.getArgs();
		
//		loop through args
		for (Object object : args) {
			
			System.out.println("Looping through args:");

			if(object instanceof Account) {
//				downcast data
				Account myAccount = (Account) object;
				
//				print data
				System.out.println("My account name: " +myAccount.getName());
			}
			
		}
		
		
	}
	
}
