package com.codingdojo.displaydate;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.text.SimpleDateFormat;
import java.util.Date;
@Controller
public class DateTimeController {
	  @RequestMapping("/")
	    public String index() {
	        return "index.jsp";
	  }
	  @RequestMapping("/date")
	  public String date(Model model) {
		  Date date = new Date() ;// gets current instance of the calendar

		  String newDate = new SimpleDateFormat("EEEEE, dd MMMMM, yyyy").format(date);
		  model.addAttribute("date",newDate);
		  return "date.jsp";
		  
	  };
	  @RequestMapping("/time")
	  public String String(Model model) {
		  Date time = new Date();
		  String newTime = new SimpleDateFormat("HH:mm").format(time);
		  model.addAttribute("time",newTime);
		  return "time.jsp";
		  
		  
	  }
	

}
