package org.himanshu;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String welcome() {
		return "index";
	}
	
	@RequestMapping("displayname")
	public String displayName(HttpServletRequest request) {
		String name = request.getParameter("firstName");
		request.setAttribute("firstname", name);
		return "displayName";
	}
	
}
