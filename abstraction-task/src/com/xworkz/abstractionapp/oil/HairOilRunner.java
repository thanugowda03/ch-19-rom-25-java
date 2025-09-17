package com.xworkz.abstractionapp.oil;

import com.xworkz.abstractionapp.oil.impl.AshwiniImpl;

public class HairOilRunner {
    public static void main(String[] args) {
        HairOil oil=new AshwiniImpl();
        oil.brand();
        oil.price();
        oil.bottleColor();
    }
}
