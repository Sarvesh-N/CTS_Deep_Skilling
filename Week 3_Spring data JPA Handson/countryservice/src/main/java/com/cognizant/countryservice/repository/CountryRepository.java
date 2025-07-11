package com.cognizant.countryservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.countryservice.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Custom finder method for partial country name match
    List<Country> findByNameContainingIgnoreCase(String name);
}
