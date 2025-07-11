package com.cognizant.springquery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.springquery.model.Country;
import com.cognizant.springquery.repository.CountryRepository;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testFindByNameContaining();
        testFindByNameContainingOrderByNameAsc();
        testFindByNameStartingWith();
    }

    private void testFindByNameContaining() {
        System.out.println("\n🔍 Countries containing 'ou':");
        List<Country> countries = countryRepository.findByNameContaining("ou");
        countries.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));
    }

    private void testFindByNameContainingOrderByNameAsc() {
        System.out.println("\n🔍 Countries containing 'ou' sorted by name:");
        List<Country> countries = countryRepository.findByNameContainingOrderByNameAsc("ou");
        countries.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));
    }

    private void testFindByNameStartingWith() {
        System.out.println("\n🔤 Countries starting with 'Z':");
        List<Country> countries = countryRepository.findByNameStartingWith("Z");
        countries.forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));
    }
}
