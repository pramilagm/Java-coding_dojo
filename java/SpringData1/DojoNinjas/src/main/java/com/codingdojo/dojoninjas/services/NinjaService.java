package com.codingdojo.dojoninjas.services;

import java.util.List;
import java.util.Optional;
import com.codingdojo.dojoninjas.model.Ninja;
import com.codingdojo.dojoninjas.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepo;

	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	public List<Ninja> findAllNinja() {
		return ninjaRepo.findAll();
	}
	
	public Ninja createNinja (Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public Ninja findNinja(Long id) {
        Optional<Ninja>  optional= ninjaRepo.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }

	public Ninja updateDojo(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public void deleteNinja(Long id) {
		ninjaRepo.deleteById(id);
	}


}
