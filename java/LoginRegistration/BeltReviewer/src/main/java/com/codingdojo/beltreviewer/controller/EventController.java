package com.codingdojo.beltreviewer.controller;

import java.util.Date;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.beltreviewer.model.Event;
import com.codingdojo.beltreviewer.model.Message;
import com.codingdojo.beltreviewer.model.User;
import com.codingdojo.beltreviewer.services.EventService;
import com.codingdojo.beltreviewer.services.UserServices;

@RequestMapping ("/events")
@Controller
public class EventController {
	private final EventService eventService;
	private final UserServices userService;

	public EventController(EventService eventService,UserServices userService) {
		
		this.eventService = eventService;
		this.userService =userService;
	}
	
	@RequestMapping("")
		public String eventHomePage(Model model, HttpSession session, @ModelAttribute("event") Event event,BindingResult result) {
		 Long userId = (Long) session.getAttribute("user_id");
		 if (result.hasErrors()) {
			 model.addAttribute("events",eventService.findAllEvent());
				model.addAttribute("users", userService.findAllUser());
				return "homeEvents.jsp";
			 
		 }
		 if (userId == null){
			 return "redirect:/events";
		
		 }
		 
		 User user = userService.findUserById(userId);
		 model.addAttribute("user", user);
		 String state = user.getState();
		 List<Event> instate = eventService.eventsInState(state);
		 model.addAttribute("instate", instate);
		 List<Event> outstate = eventService.eventsOutOfState(state);
		 model.addAttribute("outOfstate", outstate);
		 model.addAttribute("now", new Date());
		 return "homeEvents.jsp";
	}
	
	@RequestMapping(value ="",method =RequestMethod.POST)
	public String eventCreate(@Valid @ModelAttribute("event")Event event,BindingResult result,Model model,HttpSession session) {
		 Long userId = (Long) session.getAttribute("user_id");
		if(result.hasErrors()) {
			User user = userService.findUserById(userId);
			 model.addAttribute("user", user);
			 String state = user.getState();
			 List<Event> instate = eventService.eventsInState(state);
			 model.addAttribute("instate", instate);
			 List<Event> outstate = eventService.eventsOutOfState(state);
			 model.addAttribute("outOfstate", outstate);
			model.addAttribute("events",eventService.findAllEvent());
			model.addAttribute("users", userService.findAllUser());
			return "homeEvents.jsp";
		}
		
		
		
		 if (userId == null) {
			 return "redirect:/";
		 }
	            eventService.createEvent(event);
	            return "redirect:/events";
	       }
	
	
	
	
	@RequestMapping("/{id}/edit")
	public String editPage(@PathVariable("id")Long eventId, Model model ,HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		 if (userId == null) {
			 return "redirect:/";
		 }
		 Event event = eventService.findEventById(eventId);
		 model.addAttribute("event",event);
		 User user = userService.findUserById(userId);
		 model.addAttribute("user", user);
		 return "editEvent.jsp";
				 
	}
	
	
	
	
	@RequestMapping(value ="/{id}/update", method = RequestMethod.POST)
	public String editEvent(@Valid @ModelAttribute("event")Event event,BindingResult result,@PathVariable("id")Long eventId,HttpSession session,Model model ) {
		Long userId = (Long) session.getAttribute("user_id");
		if(userId==null) {
			return "redirect:/";
		}
		if(result.hasErrors()) {
//			model.addAttribute("user",userService.findUserById(userId));
//			model.addAttribute("event",eventService.findEventById(eventId));
//			model.addAttribute("events",eventService.findAllEvent());
		
			return "editEvent.jsp";
		}
		this.eventService.updateEvent(event);
		return "redirect:/events";
		
	}
	@RequestMapping("/{event_id}/a/join")
	public String joinEvent(@PathVariable("event_id") Long eventId ,HttpSession session) {
		 Long userId = (Long) session.getAttribute("user_id");
		 if (userId == null) {
			 return "redirect:/"; 
		 }
		 User user = userService.findUserById(userId);
		 user.getAttending().add(eventService.findEventById(eventId));
		 userService.saveUser(user);
		return "redirect:/events";																																																																																																																						
		
	}
	@RequestMapping("/{event_id}/a/cancel")
	public String cancelEvent(@PathVariable("event_id") Long eventId ,HttpSession session) {
		 Long userId = (Long) session.getAttribute("user_id");
		 if (userId == null) {
			 return "redirect:/"; 
		 }
		 User user = userService.findUserById(userId);
		 user.getAttending().remove(eventService.findEventById(eventId));
		 userService.saveUser(user);
		return "redirect:/events";																																																																																																																						
		
	}
	
	
	@RequestMapping(value="/{id}/del",method=RequestMethod.DELETE)
	public String deletEvent(@PathVariable("id")Long eventId,HttpSession session) {
		 Long userId = (Long) session.getAttribute("user_id");
		if (userId == null) {
			 return "redirect:/"; 
		 }
		eventService.DeleteEvent(eventId);
		return "redirect:/events";
	}
	
	@RequestMapping("/{id}")
	public String showEventAndMessage(@PathVariable("id")Long eventId, @Valid @ModelAttribute("comment") Message comment,Model model,HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		 if (userId == null) {
			 return "redirect:/";
		 }
		 model.addAttribute("user",userService.findUserById(userId));
		 model.addAttribute("event",eventService.findEventById(eventId));
		 return "showEvent.jsp";
		 
		
	}
	@RequestMapping(value ="/comment/create", method=RequestMethod.POST)
	public String addComment(@Valid @ModelAttribute("comment") Message comment,BindingResult result,Model model,HttpSession session) {

		Long userId = (Long) session.getAttribute("user_id");
		if(result.hasErrors()) {
			model.addAttribute("user",userId);
			return "showEvent.jsp";
		}
		
		 if (userId == null) {
			 return "redirect:/"; 
		 }
		 User user = userService.findUserById(userId);
		 model.addAttribute("user", user);
		 Message message = eventService.createMessage(comment);
		 return "redirect:/events/"+message.getEvent().getId();
	}
	
	 @RequestMapping("/logout")
	 public String logout(HttpSession session) {
	     // invalidate session
	     // redirect to login page
		 session.invalidate();
		 return "redirect:/";
	 }
	

}
