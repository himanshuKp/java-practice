package org.himanshu;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.himanshu.config.AppConfig;
import org.himanshu.dao.AppDAOImpl;
import org.himanshu.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView("index");
		List<User> users = new ArrayList<User>();
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		AppDAOImpl DAO = context.getBean("DAOBean",AppDAOImpl.class);
		users = DAO.listUsers(); 
		
		modelAndView.addObject("users",users);
		
		context.close();
		return modelAndView;
	}
	
	@RequestMapping(value = "/addUser")
	public String addUser(Model model,@Valid User user, BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("user",user);
			return "addUser";
		}else {
			if(user.getName() != null && user.getEmail()!= null) {
				
				AnnotationConfigApplicationContext context = 
						new AnnotationConfigApplicationContext(AppConfig.class);
				AppDAOImpl DAO = context.getBean("DAOBean",AppDAOImpl.class);
				
				DAO.addUser(user);
				context.close();
				
				return "forward:/";
			}else {
				return "addUser";
			}
		}
		
	}
		
}
