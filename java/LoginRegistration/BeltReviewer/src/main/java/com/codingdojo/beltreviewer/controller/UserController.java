package com.codingdojo.beltreviewer.controller;



import javax.servlet.http.HttpSession;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingdojo.beltreviewer.model.User;
import com.codingdojo.beltreviewer.services.UserServices;

@Controller
public class UserController {
	 private final UserServices userService;
	 
	 public UserController(UserServices userService) {
	     this.userService = userService;
	 }
	 
	 @RequestMapping("/")
	 public String registerForm(@ModelAttribute("user") User user) {
	     return "loginRegister.jsp";
	 }
 
	 @RequestMapping(value="/registration", method=RequestMethod.POST)
	 public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session, RedirectAttributes attribute) {
	     // if result has errors, return the registration page (don't worry about validations just now)
	     // else, save the user in the database, save the user id in session, and redirect them to the /home route
		 if (result.hasErrors()) {
			 return "loginRegister.jsp";
		 }
		 else if(userService.checkUser(user.getEmail())) {
				attribute.addFlashAttribute("error","The user already exists");
				return "redirect:/";
			}
		 else if(!user.getPassword().equals(user.getPasswordConfirmation())){
			 attribute.addFlashAttribute("error","The Password doesnt match");
			 return "redirect:/";
		}
		
		else {
			 User newUser = userService.registerUser(user);
			 session.setAttribute("user_id", newUser.getId());
			 session.setAttribute("loggedIn", true);
			 return "redirect:/events";
		 }
//		return "redirect:/events";
	 }
	 
	 @RequestMapping(value="/login", method=RequestMethod.POST)
	 public String loginUser(@ModelAttribute("user") User userModel,BindingResult result, @RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session,RedirectAttributes attribute) {
	     // if the user is authenticated, save their user id in session
	     // else, add error messages and return the login page
		 User user = userService.findByEmail(email);
		 if (result.hasErrors()) {
				return "registrationPage.jsp";
			}
		 else if(user == null) {
			 model.addAttribute("error","No such User");
			 return "loginRegister.jsp";
		 }
		 else if(email.length()<1) {
			 attribute.addFlashAttribute("error","Must enter an email ");	
			 return "redirect:/";
		 }
		 else if(password.length()<1) {
			 attribute.addFlashAttribute("error","Password must be enter ");
			 return "redirect:/";
		 }
		 else if (!userService.authenticateUser(email, password)) {
			 model.addAttribute("error","Invalid Password");
			 return "redirect:/";
		 } else {
			 session.setAttribute("user_id", user.getId());
			 session.setAttribute("loggedIn", true);
			 return "redirect:/events";
		 }
   }
}
	 
//	 
//	 @RequestMapping("/home")
//	 public String home(HttpSession session, Model model) {
//	     // get user from session, save them in the model and return the home page
//		 Long userId = (Long) session.getAttribute("user_id");
//		 if (userId != null) {
//			 model.addAttribute("user", userService.findUserById(userId));
//		 }
//		 return "homePage.jsp";
//	 }
	