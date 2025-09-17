package com.xworkz.abstractionapp.country;

import com.xworkz.abstractionapp.country.impl.IndiaImpl;

public class CountryRunner {
    public static void main(String[] args) {
        Country country=new IndiaImpl();
        country.countryName();
        country.noOfStates();
        country.primeMinisterName();
    }
}
