package com.kibiego.Learning_Management_System.repository;

import com.kibiego.Learning_Management_System.institution.Institution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InstitutionRepository extends JpaRepository<Institution, Long> {


    Optional<Institution> findInstitutionByName(String name);
}
