package com.codingdojo.relationship.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.relationship.model.License;
import com.codingdojo.relationship.model.Person;
import com.codingdojo.relationship.services.LicenseService;
import com.codingdojo.relationship.services.PersonService;

@Controller
public class LicenseController {
	private final LicenseService licenseService;
	private final PersonService personService;

	
	 public LicenseController(LicenseService licenseService, PersonService personService) {
		this.licenseService = licenseService;
		this.personService = personService;
	}


	@RequestMapping("/license/new")
	public String newLicense(@ModelAttribute("license") License license, Model model) {
		List<Person> persons = personService.allPerson();
		model.addAttribute("persons", persons);
		return "/relationships/createLicense.jsp";
	}
	
	@RequestMapping("/license/process")
	public String create(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "/relationships/createLicense.jsp";
		} else {
			String number = licenseService.generateLicenseNumber();
			license.setNumber(number);
			licenseService.createLicense(license);
			return "redirect:/";
		}
	}

}
