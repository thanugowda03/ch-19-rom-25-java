package com.xworkz.abstractionapp.blanket.impl;

import com.xworkz.abstractionapp.blanket.Blanket;

public class WoollenImpl implements Blanket {
    @Override
    public void color() {
        System.out.println("Blanket color red");
    }

    @Override
    public void price() {
        System.out.println("Blanket price is 800Rs");

    }

    @Override
    public void type() {
        System.out.println("Type is Woollen");
    }
}
