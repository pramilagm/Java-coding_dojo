package com.codingdojo.languages.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.codingdojo.languages.model.Language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepo;
	public LanguageService(LanguageRepository languageRepo) {
		this.languageRepo =languageRepo;
	}
	public List<Language> allLanguage(){
		return languageRepo.findAll();
		
	}
	public Language createLanguage(Language lang ) {
		return languageRepo.save(lang);
	}
	public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepo.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
	public Language updateLanguage(Language lang) {
		return languageRepo.save(lang);
		
	}
	public void deleteById(Long id) {
		languageRepo.deleteById(id);
	}


}
