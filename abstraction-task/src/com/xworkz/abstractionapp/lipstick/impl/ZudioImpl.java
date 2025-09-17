package com.xworkz.abstractionapp.lipstick.impl;

import com.xworkz.abstractionapp.lipstick.Lipstick;

public class ZudioImpl implements Lipstick {
    @Override
    public void color() {
        System.out.println("Lipstick color is Red");
    }

    @Override
    public void price() {
        System.out.println("price is 150Rs");

    }

    @Override
    public void type() {
        System.out.println("Type is Matte");

    }
}
