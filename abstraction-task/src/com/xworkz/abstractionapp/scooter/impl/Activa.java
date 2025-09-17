package com.xworkz.abstractionapp.scooter.impl;

import com.xworkz.abstractionapp.scooter.Scooter;

public class Activa implements Scooter {
    @Override
    public void producers() {
        System.out.println("Activa belongs to Honda");
    }

    @Override
    public void price() {
        System.out.println("Scooter price is 115000Rs");

    }

    @Override
    public void color() {
        System.out.println("Scooter color is White");

    }
}
