package com.xworkz.abstractionapp.fridge.impl;

import com.xworkz.abstractionapp.fridge.Fridge;

public class LGImpl implements Fridge {
    @Override
    public void fridgeName() {
        System.out.println("Fridge name is LG ");
    }

    @Override
    public void price() {
        System.out.println("Price is 25000Rs");

    }

    @Override
    public void color() {
        System.out.println("Fridge color is Red");

    }
}
