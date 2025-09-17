package com.xworkz.abstractionapp.breakfast.impl;

import com.xworkz.abstractionapp.breakfast.BreakFast;

public class IdliImpl implements BreakFast {
    @Override
    public void foodName() {
        System.out.println("Food name is Idli");
    }

    @Override
    public void madeBy() {
        System.out.println("Idli is made by rice");

    }

    @Override
    public void servedWith() {
        System.out.println("Served with Sambar");

    }
}
