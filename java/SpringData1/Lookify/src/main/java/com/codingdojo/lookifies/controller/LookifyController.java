package com.codingdojo.lookifies.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.lookifies.model.Lookify;
import com.codingdojo.lookifies.services.LookifyServices;

@Controller
public class LookifyController {
	Long  id;
	private final LookifyServices  lookService;
	
	
	public LookifyController(LookifyServices lookService) {
		this.lookService = lookService;
	}

	@RequestMapping("/")
	public String index() {
		return "li/index.jsp";
	}
	@RequestMapping("/dashboard")
    public String index(Model model) {
        List<Lookify> songs = lookService.allLookify();
        model.addAttribute("songs",songs );
        return "/li/dashboard.jsp";
    }
	@RequestMapping("/dashboard/new")
	 public String newLookify(@ModelAttribute("song") Lookify song) {
        return "/li/new.jsp";
    }
    @RequestMapping(value="/dashboard/new", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("song") Lookify song, BindingResult result) {
        if (result.hasErrors()) {
            return "/li/new.jsp";
        } else {
            lookService.createSong(song);
            return "redirect:/dashboard";
        }
    }
    @RequestMapping(value="/dashboard/{id}", method=RequestMethod.GET)
    public String show(@ModelAttribute("id") Long id ,Model model) {
    	Lookify song =lookService.findLookify(id);
        
        model.addAttribute("song", song);
        return "/li/show.jsp";
    }
//    @RequestMapping(value ="/dashboard/search", method=RequestMethod.POST)
    @PostMapping("/dashboard/search")
	public String findArtist(@RequestParam(value="search") String search, Model model) {
    	
		List<Lookify> songs = lookService.findByArtist(search);
		model.addAttribute("songs", songs);
		return "li/artist.jsp";
	}
    @RequestMapping(value="/dashboard/{id}/delete")
    public String destroy(@PathVariable("id") Long id) {
        lookService.delete(id);
        return "redirect:/dashboard";
    }
    @RequestMapping(value="/dashboard/song/top10")
    public String showTop10(Model model) {
    	model.addAttribute("songs", lookService.findTop10());
        return "/li/song.jsp";
    }
}
