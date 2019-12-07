package com.codingdojo.languages.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.languages.model.Language;
import com.codingdojo.languages.services.LanguageService;


@Controller
public class LanguageController {
	private final LanguageService languageService;
	private Long id;
	private Long lang_id;
    
    public LanguageController(LanguageService languageService) {
        this.languageService= languageService;
    }
    
    @RequestMapping("/languages")
    public String index(Model model) {
        List<Language> languages = languageService.allLanguage();
        model.addAttribute("languages",languages );
        return "/languages/index.jsp";
    }
    @RequestMapping("/languages/new")
    public String newLanguage(@ModelAttribute("language") Language language) {
        return "/languages/new.jsp";
    }
    @RequestMapping(value="/languages/new", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "/languages/new.jsp";
        } else {
            languageService.createLanguage(language);
            return "redirect:/languages";
        }
    }
    @RequestMapping(value="/languages/{id}", method=RequestMethod.GET)
    public String show(@ModelAttribute("id") Long id ,Model model) {
    	Language lang1 =languageService.findLanguage(id);
        
        model.addAttribute("language", lang1);
        return "/languages/show.jsp";
    }
    
    @RequestMapping("/languages/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Language language = languageService.findLanguage(id);
        model.addAttribute("language", language);
        return "/languages/edit.jsp";
    }
    
    @RequestMapping(value="/languages/{id}", method=RequestMethod.POST)
    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "/languages/edit.jsp";
        } else {
            languageService.updateLanguage(language);
            return "redirect:/languages";
        }
    }
    @RequestMapping(value="/languages/{id}/delete")
    public String destroy(@PathVariable("id") Long id) {
        languageService.deleteById(id);
        return "redirect:/languages";
    }
	
	
}
