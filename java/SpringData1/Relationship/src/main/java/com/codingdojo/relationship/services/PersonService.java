package com.codingdojo.relationship.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.codingdojo.relationship.repositories.PersonRepo;

import com.codingdojo.relationship.model.Person;

@Service
public class PersonService {
	private final PersonRepo personRepo;

	public PersonService(PersonRepo personRepo) {
		this.personRepo = personRepo;
	}
	
	public Person createPerson(Person person) {
		return personRepo.save(person);
		
	}
	public Person findPerson(Long id) {
        Optional<Person>  optional= personRepo.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }
	public List<Person> allPerson() {
		return personRepo.findAll();
	}
	
	
	
	
	

}
