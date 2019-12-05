package com.codingdojo.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class passwordController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	
	@RequestMapping("/login")
	public String login(@RequestParam(value="password", required = false) String password) {
		if(password != null && password.equals("bushido")) {
			return "show.jsp";
			
		}else {
			return "redirect:/createError";
			
		}
		
		
		
	}
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "we must train Harder");
        return "redirect:/";
	}

}
