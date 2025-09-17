package com.xworkz.abstractionapp.bottle.impl;

import com.xworkz.abstractionapp.bottle.Bottle;

public class WaterBottle implements Bottle {
    @Override
    public void bottleColor() {
        System.out.println("Bottle color is Blue");
    }

    @Override
    public void materialType() {
        System.out.println("Material type is steel");

    }

    @Override
    public void price() {
        System.out.println("Price is 350Rs.");

    }
}
