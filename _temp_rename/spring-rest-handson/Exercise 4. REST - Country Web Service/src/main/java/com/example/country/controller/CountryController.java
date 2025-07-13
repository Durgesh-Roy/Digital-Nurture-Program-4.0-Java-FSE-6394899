package com.example.country.controller;

import com.example.country.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
public class CountryController {

    private final List<Country> countries = Arrays.asList(
        new Country("IN", "India"),
        new Country("US", "United States"),
        new Country("FR", "France")
    );

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countries;
    }

    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Country not found"));
    }
}
