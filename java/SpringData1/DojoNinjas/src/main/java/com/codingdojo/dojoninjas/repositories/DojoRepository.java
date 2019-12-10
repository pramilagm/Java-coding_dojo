package com.codingdojo.dojoninjas.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojoninjas.model.Dojo;

import org.springframework.stereotype.Repository;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{
	

	List<Dojo> findAll();

	
}
