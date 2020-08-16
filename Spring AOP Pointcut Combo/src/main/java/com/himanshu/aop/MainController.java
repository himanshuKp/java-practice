package com.himanshu.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.himanshu.aop.dao.before.AccountDAO;
import com.himanshu.aop.dao.before.BeforeDAO;
import com.himanshu.aop.dao.before.MembershipDAO;
import com.himanshu.aop.dao.before.ParameterDAO;

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
		
//		get the bean from spring container
		ParameterDAO theParameterDAO = appContext.getBean("parameterDAO", ParameterDAO.class);
		
//		call the business method
		theAccount.accountDao();
		
		theAccount.setName("Himanshu");
		theAccount.setBatch("2020");
		
		theAccount.getName();
		theAccount.getBatch();
			
		theMembershipDAO.accountMemmbershipDao();;
				
		theBeforeDAO.accountBeforeDAO();;
		
		theParameterDAO.accountParameterDAO(new Account(10));
		
//		close application context
		appContext.close();
		
	}

}
