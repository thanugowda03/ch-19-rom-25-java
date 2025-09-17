package com.xworkz.abstractionapp.country.impl;

import com.xworkz.abstractionapp.country.Country;

public class IndiaImpl implements Country {
    @Override
    public void countryName() {
        System.out.println("Country name is India");
    }

    @Override
    public void noOfStates() {
        System.out.println("No of states 30");

    }

    @Override
    public void primeMinisterName() {
        System.out.println("PM name is Narendra Modi");

    }
}
