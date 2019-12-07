package com.codingdojo.lookifies.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.lookifies.model.Lookify;
import com.codingdojo.lookifies.repositories.LookifyRepo;

@Service
public class LookifyServices {
	private final LookifyRepo lookifyRepo;

	public LookifyServices(LookifyRepo lookifyRepo) {
		this.lookifyRepo = lookifyRepo;
	}
	public List<Lookify> allLookify(){
		return lookifyRepo.findAll();
		
	}
	public Lookify createSong(Lookify song) {
		return lookifyRepo.save(song);
	}

	public Lookify findLookify(Long id) {
        Optional<Lookify>  optional= lookifyRepo.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }
	public List<Lookify> findByArtist(String artist){
		return lookifyRepo.findByArtistContaining(artist);
		
	}
	public List<Lookify> findTop10(){
		return lookifyRepo.findTop10ByOrderByRatingDesc();
		
	}
	
	public void delete(Long id) {
		lookifyRepo.deleteById(id);
	}

	
 
}
