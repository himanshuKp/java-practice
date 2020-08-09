package org.himanshu;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.himanshu.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@GetMapping("/")
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		
		Map<String, String> genders = new HashMap<String, String>();
		genders.put("male", "Male");
		genders.put("female", "Female");
		
		Map<String, String> countries = new LinkedHashMap<String, String>();
		countries.put("India", "India");
		countries.put("United States of America", "USA");
		countries.put("United Kingdom", "UK"); 
		
		modelAndView.addObject("countryName", countries);
		modelAndView.addObject("genders",genders);
		modelAndView.addObject("user",user);
		return modelAndView;
	}
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		modelAndView.addObject("user",user);
		return modelAndView;
	}
		
}
