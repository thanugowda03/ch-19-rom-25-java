package com.xworkz.abstractionapp.oil.impl;

import com.xworkz.abstractionapp.oil.HairOil;

public class AshwiniImpl implements HairOil {
    @Override
    public void bottleColor() {
        System.out.println("Bottle Color is green");
    }

    @Override
    public void price() {
        System.out.println("Price is 130Rs");

    }

    @Override
    public void brand() {
        System.out.println("Brand name is Ashwini");

    }
}
