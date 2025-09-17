package com.xworkz.abstractionapp.lap.impl;

import com.xworkz.abstractionapp.lap.Laptop;

public class DellImpl implements Laptop {
    @Override
    public void brand() {
        System.out.println("Laptop name is Dell");
    }

    @Override
    public void price() {
        System.out.println("Price is 57000Rs");

    }

    @Override
    public void ram() {
        System.out.println("Ram is 16GB");

    }
}
