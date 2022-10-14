package com.boxinator.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boxinator.project.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

}

