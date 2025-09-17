package com.xworkz.abstractionapp.sweet.impl;

import com.xworkz.abstractionapp.sweet.Sweet;

public class SweetImpl implements Sweet {
    @Override
    public void name() {
        System.out.println("Sweet name is MysorePak");
    }

    @Override
    public void price() {
        System.out.println("Price is 250Rs/Kg");

    }

    @Override
    public void beakryName() {
        System.out.println("Bekaey name is Populars");

    }
}
