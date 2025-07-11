package com.cognizant.springquery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.springquery.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    // 1. Find countries where name contains a keyword
    List<Country> findByNameContaining(String keyword);

    // 2. Find countries where name contains keyword, sorted by name ascending
    List<Country> findByNameContainingOrderByNameAsc(String keyword);

    // 3. Find countries where name starts with a specific letter
    List<Country> findByNameStartingWith(String prefix);
}
