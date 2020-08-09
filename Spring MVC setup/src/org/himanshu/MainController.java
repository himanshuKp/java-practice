package org.himanshu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String welcome() {
		return "index";
	}
	
	@GetMapping("displayname")
	public ModelAndView displayName(@RequestParam("firstName") String name) {
		ModelAndView modelAndView = new ModelAndView("displayName");
		List<String> names = new ArrayList<String>();
		names.add("Himanshu");
		names.add("Pratibha");
		names.add("Sashi");
		names.add("Check");
		Date date = new Date();
		modelAndView.addObject("date", date);
		modelAndView.addObject("firstname", name);
		modelAndView.addObject("team", names);
		return modelAndView;
	}
	
}
