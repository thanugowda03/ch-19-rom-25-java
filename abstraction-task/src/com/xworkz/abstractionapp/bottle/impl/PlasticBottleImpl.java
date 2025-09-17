package com.xworkz.abstractionapp.bottle.impl;

import com.xworkz.abstractionapp.bottle.Bottle;


public class PlasticBottleImpl implements Bottle {
    @Override
    public void bottleColor() {
        System.out.println("Bottle color is White");
    }

    @Override
    public void materialType() {
        System.out.println("Plastic is a material");

    }

    @Override
    public void price() {
        System.out.println("Price is 10Rs");

    }
}
