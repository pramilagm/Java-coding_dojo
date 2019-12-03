package com.codingdojo.human;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


    
@RestController
public class Human {
	@RequestMapping("/")
    public String index(@RequestParam(value="name",required=false) String searchfirst, @RequestParam(value="last_name",required=false) String searchlast) {
		if(searchfirst==null) {
			return "welcome Human ! Welcome to Spring Boot";
			 
		}
		else {
			return "Hello " + searchfirst + " " +  searchlast + " welcome to Spring Boot";
			
		}
	}
  
	

}
