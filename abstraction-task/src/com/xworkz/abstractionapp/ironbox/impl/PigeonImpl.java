package com.xworkz.abstractionapp.ironbox.impl;

import com.xworkz.abstractionapp.ironbox.IronBox;

public class PigeonImpl implements IronBox {
    @Override
    public void brandName() {
        System.out.println("Brand name is Pigeon");
    }

    @Override
    public void price() {
        System.out.println("Iron box price is  5000Rs");

    }

    @Override
    public void color() {
        System.out.println("Iron box color is White");

    }
}
