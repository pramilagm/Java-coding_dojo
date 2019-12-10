package com.codingdojo.dojoninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojoninjas.model.Dojo;
import com.codingdojo.dojoninjas.repositories.DojoRepository;

@Service
public class Dojoservices {
	private final DojoRepository dojoRepo;
	

	public Dojoservices(DojoRepository dojoRepo) {
	
		this.dojoRepo = dojoRepo;
	}
	
	public List<Dojo> findAllDojo(){
		return dojoRepo.findAll();
	}
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	public Dojo findDojo(Long id) {
        Optional<Dojo>  optional= dojoRepo.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }

	public Dojo updateDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
	}
	


}
