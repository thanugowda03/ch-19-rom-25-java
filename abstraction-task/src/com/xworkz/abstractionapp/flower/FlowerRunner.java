package com.xworkz.abstractionapp.flower;

import com.xworkz.abstractionapp.flower.impl.RoseImpl;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower=new RoseImpl();
        flower.color();
        flower.nameOfFlower();
        flower.price();
    }
}
