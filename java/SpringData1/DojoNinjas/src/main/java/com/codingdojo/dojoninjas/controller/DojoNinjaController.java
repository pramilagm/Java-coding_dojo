package com.codingdojo.dojoninjas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.dojoninjas.model.Dojo;
import com.codingdojo.dojoninjas.model.Ninja;
import com.codingdojo.dojoninjas.services.Dojoservices;
import com.codingdojo.dojoninjas.services.NinjaService;

@Controller
public class DojoNinjaController {
	private final NinjaService ninjaService;
	private final Dojoservices dojoService;
	public DojoNinjaController(NinjaService ninjaService, Dojoservices dojoService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}
	@RequestMapping("/dojos/new")
	public String index(@ModelAttribute("dojo") Dojo dojo) {
		return "li/new_dojo.jsp";
	}

	  @RequestMapping(value="/dojos/process", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/li/new_dojo.jsp";
	        } else {
	            dojoService.createDojo(dojo);
	            return "redirect:/";
	        }
	    }
	  @RequestMapping("/ninjas/new")
		public String newNinja(@ModelAttribute("ninja") Ninja ninja,Model model) {
		  List<Dojo> dojos = dojoService.findAllDojo();
		  model.addAttribute("dojos", dojos);
			
		  return "li/new_ninja.jsp";
		}

	 @RequestMapping(value="/ninjas/process", method=RequestMethod.POST)
		    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		        if (result.hasErrors()) {
		            return "/li/new_ninja.jsp";
		        } else {
		        	
		            ninjaService.createNinja(ninja);
		            return "redirect:/";
		        }
		    }


	 @RequestMapping("/")
		public String index(Model model) {
			List<Dojo> dojos = dojoService.findAllDojo();
			model.addAttribute("dojos", dojos);
			return "/li/readAll.jsp";
		}
	 @RequestMapping(value="/dojos/{id}", method=RequestMethod.GET)
	    public String show(@PathVariable("id") Long id ,Model model) {
	        
	        model.addAttribute("dojo", dojoService.findDojo(id));
	        return "/li/shoNinjas.jsp";
	    }
	 @RequestMapping(value="/dojos/{id}/delete", method=RequestMethod.POST)
	    public String destroy(@PathVariable("id") Long id) {
	        dojoService.deleteDojo(id);
	        return "redirect:/";
	    }

}
