package com.cognizant.week3.SpringRest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    private List<Country> countryList = new ArrayList<>();

    public CountryController() {
        countryList.add(new Country(1, "India", "IN", "New Delhi"));
        countryList.add(new Country(2, "United States", "US", "Washington D.C."));
        countryList.add(new Country(3, "United Kingdom", "UK", "London"));
        countryList.add(new Country(4, "Japan", "JP", "Tokyo"));
        countryList.add(new Country(5, "Australia", "AU", "Canberra"));
    }

    // Get all countries
    @GetMapping
    public List<Country> getAllCountries() {
        return countryList;
    }

    // Get country by code
    @GetMapping("/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        for (Country c : countryList) {
            if (c.getCountryCode().equalsIgnoreCase(code)) {
                return c;
            }
        }
        return null;
    }

    // Add new country
    @PostMapping
    public String addCountry(@RequestBody Country country) {
        countryList.add(country);
        return "Country added successfully!";
    }
}