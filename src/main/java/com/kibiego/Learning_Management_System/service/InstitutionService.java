package com.kibiego.Learning_Management_System.service;

import com.kibiego.Learning_Management_System.exception.ResourceNotFoundException;
import com.kibiego.Learning_Management_System.institution.Institution;
import com.kibiego.Learning_Management_System.repository.InstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class InstitutionService {

    private final InstitutionRepository institutionRepository;

    @Autowired
    public InstitutionService(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    public List<Institution> getInstitutions() {

        return institutionRepository.findAll();
    }

    public void addNewInstitution(Institution institution) {

        Optional<Institution> institutionOptional = institutionRepository.findInstitutionByName(institution.getName());

        if (institutionOptional.isPresent()){
            throw new IllegalStateException("There’s another Institution with the same name");
        }
        institutionRepository.save(institution);
    }
}
