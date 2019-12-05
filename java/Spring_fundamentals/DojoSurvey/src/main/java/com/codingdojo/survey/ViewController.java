package com.codingdojo.survey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	 @RequestMapping(value="/login", method=RequestMethod.POST)
	 public String login(@RequestParam(value="name") String name, @RequestParam(value="location") String location,
			 @RequestParam(value="language")String language,@RequestParam(value="des")String des,HttpSession Session) {
		 
		 if(language.equals("java")) {
			 Session.setAttribute("name",name);
			 Session.setAttribute("location", location);
			 Session.setAttribute("language",language);
			 Session.setAttribute("des", des);
			 return "redirect:/java";
		 }
		 else {
			 Session.setAttribute("name",name);
			 Session.setAttribute("location", location);
			 Session.setAttribute("language",language);
			 Session.setAttribute("des", des);
			 return "show.jsp";
		 } 
	 }
	 @RequestMapping(value="/java")
	 public String javaInfo	() {
		
		 return "jvaShow.jsp";
	 }
	 
	      
	
	
	

}
