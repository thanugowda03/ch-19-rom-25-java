package com.xworkz.abstractionapp.biscuit.impl;

import com.xworkz.abstractionapp.biscuit.Biscuit;

public class GoodDayImpl implements Biscuit {
    @Override
    public void biscuitName() {
        System.out.println("Biscuit name is GoodDay");
    }

    @Override
    public void price() {
        System.out.println("Biscuit price is 30Rs");

    }

    @Override
    public void color() {
        System.out.println("Biscuit packet color Orange");

    }
}
