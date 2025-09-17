package com.xworkz.abstractionapp.plant.impl;

import com.xworkz.abstractionapp.plant.Plant;

public class CoconutTreeImpl implements Plant {

    @Override
    public void plantName() {
        System.out.println("Plant name is coconut tree");
    }

    @Override
    public void use() {
        System.out.println("Coconut tree gives coconut");

    }

    @Override
    public void height() {
        System.out.println("Grows hight more than 15ft");

    }
}
