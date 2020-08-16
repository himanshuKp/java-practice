package com.himanshu.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.himanshu.aop.dao.before.AccountDAO;
import com.himanshu.aop.dao.before.BeforeDAO;
import com.himanshu.aop.dao.before.MembershipDAO;

public class MainController {

	public static void main(String[] args) {

//		read spring config java class
		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
//		get the bean from spring container
		AccountDAO theAccount = appContext.getBean("accountDAO", AccountDAO.class);
		
//		get the bean from spring container
		MembershipDAO theMembershipDAO = appContext.getBean("membershipDAO", MembershipDAO.class);
		
//		get the bean from spring container
		BeforeDAO theBeforeDAO = appContext.getBean("beforeDAO", BeforeDAO.class);
		
//		call the business method
		theAccount.accountDao();
		
		theMembershipDAO.accountMemmbershipDao();;
				
		theBeforeDAO.accountBeforeDAO();;
		
//		close application context
		appContext.close();
		
	}

}
