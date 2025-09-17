package com.xworkz.abstractionapp.perfume.impl;

import com.xworkz.abstractionapp.perfume.Perfume;

public class FoggImpl implements Perfume {
    @Override
    public void price() {
        System.out.println("Perfume price is 250Rs");
    }

    @Override
    public void weight() {
        System.out.println("Weight is 250ml");

    }

    @Override
    public void bottleColor() {
        System.out.println("perfume Bottle color is purple");

    }
}
