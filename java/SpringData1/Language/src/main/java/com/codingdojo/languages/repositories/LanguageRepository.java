package com.codingdojo.languages.repositories;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.languages.model.Language;
@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
	List<Language> findAll();
	Long deleteByNameStartingWith(String search);
	Long countByNameContaining(String search);

}
