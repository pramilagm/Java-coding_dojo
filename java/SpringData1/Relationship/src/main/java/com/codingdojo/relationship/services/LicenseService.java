package com.codingdojo.relationship.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.relationship.model.License;
import com.codingdojo.relationship.repositories.LicenseRepo;

@Service
public class LicenseService {
	public static int licenseNumber = 0;
	private final LicenseRepo licenseRepo;


	public LicenseService(LicenseRepo licenseRepo) {
		this.licenseRepo = licenseRepo;
	}
	public  List<License> allPerson(){
		return licenseRepo.findAll();
	}
	public License createLicense(License license) {
		return licenseRepo.save(license);
		
	}
	public License findLicense(Long id) {
        Optional<License>  optional= licenseRepo.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
	}
     public String generateLicenseNumber(){	  
    	 if(licenseRepo.findTopByOrderByNumberDesc().isEmpty()) {
    		licenseNumber =1;
			return String.format("%05d", licenseNumber);

    	 }
    	 List<License> top = licenseRepo.findTopByOrderByNumberDesc();
    	 licenseNumber = 1+(Integer.parseInt(top.get(0).getNumber()));
    	 return String.format("%05d", licenseNumber);
    	 }
     
    		
    
	
	

}
