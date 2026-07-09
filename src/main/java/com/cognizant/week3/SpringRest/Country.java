package com.cognizant.week3.SpringRest;

public class Country {
    private int id;
    private String countryName;
    private String countryCode;
    private String capital;

    public Country() {}

    public Country(int id, String countryName, String countryCode, String capital) {
        this.id = id;
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.capital = capital;
    }

    public int getId() { return id; }
    public String getCountryName() { return countryName; }
    public String getCountryCode() { return countryCode; }
    public String getCapital() { return capital; }

    public void setId(int id) { this.id = id; }
    public void setCountryName(String countryName) { this.countryName = countryName; }
    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }
    public void setCapital(String capital) { this.capital = capital; }
}