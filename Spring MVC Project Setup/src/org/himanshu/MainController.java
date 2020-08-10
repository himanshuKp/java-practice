package org.himanshu;

import java.util.ArrayList;
import java.util.List;

import org.himanshu.dao.AppDAOImpl;
import org.himanshu.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@GetMapping("/")
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView("index");
		List<User> users = new ArrayList<User>();
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("/org/himanshu/dao/AppDAOConfig.xml");
		AppDAOImpl DAO = context.getBean("DAOBean",AppDAOImpl.class);
		users = DAO.listUsers(); 
		
		modelAndView.addObject("users",users);
		
		context.close();
		return modelAndView;
	}
		
}
