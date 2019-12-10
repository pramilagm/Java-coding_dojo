package com.codingdojo.relationship.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.codingdojo.relationship.model.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person, Long>{
	List<Person> findAll();
	List<Person> findByFirstName(String search);
	
	

}
