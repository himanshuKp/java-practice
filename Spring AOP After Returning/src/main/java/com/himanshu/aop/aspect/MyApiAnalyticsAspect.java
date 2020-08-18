package com.himanshu.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.himanshu.aop.Account;

@Aspect
@Component
public class MyApiAnalyticsAspect {

	@AfterReturning(pointcut = "execution(* com.himanshu.aop.dao.before.AccountDAO.findAccounts())", returning = "result")
	public void performAfterReturningAOP(JoinPoint joinPoint, List<Account> result) {
		System.out.println("-------------------------");
		System.out.println("After Return AOP for method: " + joinPoint.getSignature().toShortString());

		System.out.println("Result is: " + result);

		System.out.println("-------------POST PROCESS DATA--------------------");

		System.out.println("Convert all data to uppercase and change first name.");
		result.get(0).setName("Goofy");
		convertAccountNamesToUpperCase(result);

		System.out.println("--------------POST PROCES ENDS---------------");

		System.out.println("Result is: " + result);
	}

	private void convertAccountNamesToUpperCase(List<Account> result) {

//		loop through
		for (Account account : result) {
//			get upper case
			String uppercaseName = account.getName().toUpperCase();
			String uppercaseLevel = account.getLevel().toUpperCase();

//			update the data
			account.setName(uppercaseName);
			account.setLevel(uppercaseLevel);
		}

	}

	@Before("com.himanshu.aop.aspect.MyAOPExpressions.forDAOpackageNoGetterSetter()")
	public void performAnalytics(JoinPoint joinPoint) {
		System.out.println("===========> performing @Before advice on method");

//		display the method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

		System.out.println("Method: " + methodSignature);
	}

}
