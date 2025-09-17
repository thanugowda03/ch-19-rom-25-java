package com.xworkz.abstractionapp.vegetable.impl;

import com.xworkz.abstractionapp.vegetable.veg;

public class Potato implements veg {
    @Override
    public void color() {
        System.out.println("Color is brown");
    }

    @Override
    public void isHealthy() {
        System.out.println("Yes! It is healthy");

    }

    @Override
    public void pricePerKg() {
        System.out.println("30Rs per KG");

    }
}
