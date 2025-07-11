package com.cognizant.newcountry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.newcountry.model.Country;
import com.cognizant.newcountry.repository.CountryRepository;




@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    // Assuming you already have this method
    public Country findCountryByCode(String code) {
        return countryRepository.findById(code).orElse(null);
    }
}
