package com.cognizant.countryservice.service;

import com.cognizant.countryservice.model.Country;

import java.util.List;

public interface CountryService {

    Country getCountryByCode(String code);

    Country addCountry(Country country);

    Country updateCountry(Country country);

    void deleteCountry(String code);

    List<Country> searchCountriesByPartialName(String partialName);
}
