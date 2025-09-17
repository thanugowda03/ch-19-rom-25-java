package com.xworkz.abstractionapp.cloth;

import com.xworkz.abstractionapp.cloth.impl.SareeImpl;

public class ClothRunner {
    public static void main(String[] args) {
        Cloth cloth=new SareeImpl();
        cloth.brand();
        cloth.color();
        cloth.price();
    }
}
