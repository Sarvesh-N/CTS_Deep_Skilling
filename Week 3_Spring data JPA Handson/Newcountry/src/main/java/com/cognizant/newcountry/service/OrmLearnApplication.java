package com.cognizant.newcountry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.newcountry.model.Country;
import com.cognizant.newcountry.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testAddCountry();
    }

    private void testAddCountry() {
        Country country = new Country();
        country.setCode("ZZ");
        country.setName("Zootopia");

        countryService.addCountry(country);

        Country addedCountry = countryService.findCountryByCode("ZZ");
        System.out.println("✅ Added Country: " + addedCountry.getName() + " (" + addedCountry.getCode() + ")");
    }
}
