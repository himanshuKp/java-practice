package com.himanshu.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.himanshu.aop.dao.AccountDAO;

public class MainController {

	public static void main(String[] args) {

//		read spring config java class
		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
//		get the bean from spring container
		AccountDAO theAccount = appContext.getBean("accountDAO", AccountDAO.class);
		
//		call the business method
		theAccount.accountDao();
		
		theAccount.accountDao();
		
//		close application context
		appContext.close();
		
	}

}
