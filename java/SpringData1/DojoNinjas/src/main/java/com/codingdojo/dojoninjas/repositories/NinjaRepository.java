package com.codingdojo.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.codingdojo.dojoninjas.model.Ninja;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll();
	

}
