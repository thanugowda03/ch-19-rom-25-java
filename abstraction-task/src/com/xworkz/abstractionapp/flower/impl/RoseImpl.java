package com.xworkz.abstractionapp.flower.impl;

import com.xworkz.abstractionapp.flower.Flower;


public class RoseImpl implements Flower {
    @Override
    public void color() {
        System.out.println("Flower color is red");
    }

    @Override
    public void nameOfFlower() {
        System.out.println("Flower nmae is Rose");

    }

    @Override
    public void price() {
        System.out.println("Price is 20rs");

    }
}
