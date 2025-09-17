package com.xworkz.abstractionapp.watch.impl;

import com.xworkz.abstractionapp.watch.Watch;

public class SonyImpl implements Watch {
    @Override
    public void color() {
        System.out.println("Watch belt color is black");
    }

    @Override
    public void price() {
        System.out.println("Watch price is 1500Rs");

    }

    @Override
    public void warranty() {
        System.out.println("Wrranty is 1 year");

    }
}
