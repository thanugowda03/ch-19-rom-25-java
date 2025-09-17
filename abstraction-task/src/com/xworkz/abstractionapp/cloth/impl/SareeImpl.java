package com.xworkz.abstractionapp.cloth.impl;

import com.xworkz.abstractionapp.cloth.Cloth;

public class SareeImpl implements Cloth {
    @Override
    public void brand() {
        System.out.println("Saree brand is nidhuvasthra");
    }

    @Override
    public void color() {
        System.out.println("Saree color is Pink");

    }

    @Override
    public void price() {
        System.out.println("Saree price is 4500Rs");
    }
}
