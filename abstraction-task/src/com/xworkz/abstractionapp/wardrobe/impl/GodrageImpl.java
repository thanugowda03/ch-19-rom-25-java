package com.xworkz.abstractionapp.wardrobe.impl;

import com.xworkz.abstractionapp.wardrobe.Wardrobe;

public class GodrageImpl implements Wardrobe {
    @Override
    public void brand() {
        System.out.println("Brand name is Godrage");
    }

    @Override
    public void color() {
        System.out.println("Wardrobe color is Black");

    }

    @Override
    public void price() {
        System.out.println("Wardrobe price is 12000rs");

    }
}
