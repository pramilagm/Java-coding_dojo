package com.codingdojo.relationship.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.relationship.model.License;



@Repository
public interface LicenseRepo  extends CrudRepository<License, Long>{
	List<License> findAll();
	List<License> findTopByOrderByNumberDesc();
	

}
