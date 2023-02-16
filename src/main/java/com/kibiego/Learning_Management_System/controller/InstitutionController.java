package com.kibiego.Learning_Management_System.controller;

import com.kibiego.Learning_Management_System.model.Institution;
import com.kibiego.Learning_Management_System.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/institutions")

public class InstitutionController {

    private final InstitutionService institutionService;

    @Autowired
    public InstitutionController(InstitutionService institutionService) {
        this.institutionService = institutionService;
    }

//    Get the list of all the institutions
    @GetMapping
    public List<Institution> getInstitutions(){
        return institutionService.getInstitutions();

    }
    // Add a new institution

    @PostMapping
    public void registerNewInstitution(@RequestBody Institution institution) {
        institutionService.addNewInstitution(institution);
    }

}
