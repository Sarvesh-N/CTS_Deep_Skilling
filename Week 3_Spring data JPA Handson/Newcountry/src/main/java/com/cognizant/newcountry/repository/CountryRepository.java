package com.cognizant.newcountry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.newcountry.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
