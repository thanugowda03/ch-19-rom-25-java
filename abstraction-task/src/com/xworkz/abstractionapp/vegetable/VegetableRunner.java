package com.xworkz.abstractionapp.vegetable;

import com.xworkz.abstractionapp.vegetable.impl.Potato;

public class VegetableRunner {
    public static void main(String[] args) {
        veg veg1=new Potato();
        veg1.color();
        veg1.isHealthy();
        veg1.pricePerKg();
    }
}
