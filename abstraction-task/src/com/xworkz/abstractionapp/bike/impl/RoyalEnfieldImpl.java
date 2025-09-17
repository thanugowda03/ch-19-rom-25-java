package com.xworkz.abstractionapp.bike.impl;

import com.xworkz.abstractionapp.bike.Bike;

public class RoyalEnfieldImpl implements Bike {
    @Override
    public void start() {
        System.out.println("RoyalEnfield is staring");
    }

    @Override
    public void stop() {
        System.out.println("RoyalEnfield is stopping");

    }

    @Override
    public void name() {
        System.out.println("RoyalEnfield is the brand name");

    }
}
