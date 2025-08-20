package com.xworkz.countryinfo;

import com.xworkz.countryinfo.country.Country;

public class CountryRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Country country=new Country();
        country.setCountryId(1);
        country.setCountryName("India");
        country.setNoOfStates(28);
        country.setCapital("Bangalore");

        int countryId=country.getCountryId();
        String countryName=country.getCountryName();
        int noOfStates=country.getNoOfStates();
        String capital=country.getCapital();

        System.out.println("Country Id "+countryId);
        System.out.println("Country Name "+countryName);
        System.out.println("No of States "+noOfStates);
        System.out.println("Capital "+capital);
        System.out.println("main ended");
    }
}
