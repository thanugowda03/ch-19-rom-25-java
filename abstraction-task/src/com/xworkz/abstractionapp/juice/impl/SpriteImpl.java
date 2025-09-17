package com.xworkz.abstractionapp.juice.impl;

import com.xworkz.abstractionapp.juice.Juice;

public class SpriteImpl implements Juice {
    @Override
    public void color() {
        System.out.println("Juice color is water color");
    }

    @Override
    public void flavour() {
        System.out.println("Flavour is Lemon");

    }

    @Override
    public void priceForL() {
        System.out.println("Price for Ltr 56Rs");

    }
}
