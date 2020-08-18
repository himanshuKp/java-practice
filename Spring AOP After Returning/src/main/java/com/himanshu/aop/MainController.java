package com.himanshu.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.himanshu.aop.dao.before.AccountDAO;

public class MainController {

	public static void main(String[] args) {

//		read spring config java class
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

//		get the bean from spring container
		AccountDAO theAccount = appContext.getBean("accountDAO", AccountDAO.class);

//		call the method to find accounts
		List<Account> allAccounts = theAccount.findAccounts();
		
//		display the accounts:
		System.out.println("\nMain Program begins: ");
		System.out.println("-----------------");
		
		System.out.println(allAccounts);

		System.out.println("Main Program ends");
		
//		close application context
		appContext.close();

	}

}
