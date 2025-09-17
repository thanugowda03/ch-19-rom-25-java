package com.xworkz.abstractionapp.bangle.impl;

import com.xworkz.abstractionapp.bangle.Bangle;

public class GoldBangleImpl implements Bangle {
    @Override
    public void bangleSize() {
        System.out.println("Bangle size is 2*6");
    }

    @Override
    public void color() {
        System.out.println("Color is golden");

    }

    @Override
    public void noOfPairs() {
        System.out.println("No of pairs is 2");

    }
}
