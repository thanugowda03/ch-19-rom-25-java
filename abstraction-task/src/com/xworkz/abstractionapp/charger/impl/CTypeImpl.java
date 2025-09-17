package com.xworkz.abstractionapp.charger.impl;

import com.xworkz.abstractionapp.charger.Charger;

public class CTypeImpl implements Charger {
    @Override
    public void type() {
        System.out.println("Charger typeis C Type");
    }

    @Override
    public void color() {
        System.out.println("Charger color is white");

    }

    @Override
    public void price() {
        System.out.println("Charger price is 500Rs");

    }
}
