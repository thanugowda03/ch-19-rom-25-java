package com.xworkz.abstractionapp.chair.impl;

import com.xworkz.abstractionapp.chair.Chair;

public class PlasticChair implements Chair {
    @Override
    public void move() {
        System.out.println("Move the chair into forward");
    }

    @Override
    public void sit() {
        System.out.println("Sit on the chair");

    }

    @Override
    public void fold() {
        System.out.println("Fold the chair");

    }
}
