package com.xworkz.abstractionapp.bike.impl;

import com.xworkz.abstractionapp.bike.Bike;

public class KTMImpl implements Bike {

    @Override
    public void start() {
        System.out.println("KTM Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("KTM Bike is stoping");

    }

    @Override
    public void name() {
        System.out.println("KTM Bike is a brand");

    }
}
