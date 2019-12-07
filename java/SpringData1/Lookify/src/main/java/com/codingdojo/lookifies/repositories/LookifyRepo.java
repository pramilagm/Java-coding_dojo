package com.codingdojo.lookifies.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.lookifies.model.Lookify;


@Repository
public interface LookifyRepo extends CrudRepository<Lookify, Long>{
	List<Lookify> findAll();
	  List<Lookify> findByArtistContaining(String search);
	    List<Lookify> findTop10ByOrderByRatingDesc();
		Long deleteById(Lookify id);
}
