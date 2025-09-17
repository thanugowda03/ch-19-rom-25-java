package com.xworkz.abstractionapp.bottle;

import com.xworkz.abstractionapp.bottle.impl.PlasticBottleImpl;
import com.xworkz.abstractionapp.bottle.impl.WaterBottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle=new WaterBottle();
        bottle.bottleColor();
        bottle.materialType();
        bottle.price();

        Bottle bottle1=new PlasticBottleImpl();
        bottle1.bottleColor();
        bottle1.materialType();
        bottle1.price();
    }
}
