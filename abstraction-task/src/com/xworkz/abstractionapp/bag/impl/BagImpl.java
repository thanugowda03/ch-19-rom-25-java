package com.xworkz.abstractionapp.bag.impl;

import com.xworkz.abstractionapp.bag.Bag;

public class BagImpl implements Bag {
    @Override
    public void brand() {
        System.out.println("Bag brand is Arrow");
    }

    @Override
    public void color() {
        System.out.println("Bag color is black and blue");

    }

    @Override
    public void price() {
        System.out.println("Bag price is 1200Rs");

    }
}
