package com.xworkz.abstractionapp.honey.impl;

import com.xworkz.abstractionapp.honey.Honey;

public class DaburHoneyImpl implements Honey {

    @Override
    public void color() {
        System.out.println("Color is Brown");
    }

    @Override
    public void weight() {
        System.out.println("Weight is 200g");

    }

    @Override
    public void price() {
        System.out.println("Price is 110Rs");

    }
}
