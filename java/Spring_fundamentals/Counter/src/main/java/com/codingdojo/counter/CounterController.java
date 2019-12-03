package com.codingdojo.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String Counter(HttpSession session){
        if(session.getAttribute("count") == null){
        	session.setAttribute("count", 0);
        }
        Integer count = (Integer) session.getAttribute("count");
        count +=1;
        session.setAttribute("count", count);
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String display(HttpSession session){
		if(session.getAttribute("count")==null){
			session.setAttribute("count", 0);
	    }
	    Integer count = (Integer) session.getAttribute("count");
	    count +=1;
	    session.setAttribute("count", count);
	    return "show.jsp";
		}
	@RequestMapping("/counter2")
	public String dobleIncrement(HttpSession session){
		if(session.getAttribute("count")==null){
			session.setAttribute("count", 0);
	    }
	    Integer count = (Integer) session.getAttribute("count");
	    count +=2;
	    session.setAttribute("count", count);
	    return "show.jsp";
		}
	
	

}
