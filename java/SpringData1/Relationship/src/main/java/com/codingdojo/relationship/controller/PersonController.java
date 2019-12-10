package com.codingdojo.relationship.controller;
import java.util.List;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.codingdojo.relationship.model.Person;
import com.codingdojo.relationship.services.PersonService;

@Controller
public class PersonController {
	private final PersonService personService;

	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	 @RequestMapping("/")
	    public String index(Model model) {
	        List<Person> persons = personService.allPerson();
	        model.addAttribute("persons",persons);
	        return "/relationships/index.jsp";
	    }
	 @RequestMapping("/persons/new")
	    public String newPerson(@ModelAttribute("person") Person person) {
	        return "/relationships/new.jsp";
	    }
	
	
	  @RequestMapping(value="/persons/new", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("person") Person person, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/relationships/new.jsp";
	        } else {
	            personService.createPerson(person);
	            return "redirect:/";
	        }
	    }
	  @RequestMapping(value="/person/{id}", method=RequestMethod.GET)
	    public String show(@ModelAttribute("id") Long id ,Model model) {
	    	Person  person =personService.findPerson(id);
	        
	        model.addAttribute("person", person);
	        return "/relationships/showInfo.jsp";
	    }

}
