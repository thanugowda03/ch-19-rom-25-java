package com.xworkz.abstractionapp.car.impl;

import com.xworkz.abstractionapp.car.Car;

public class HyundaiImpl implements Car {

    @Override
    public void name() {
        System.out.println("Car name is Hyundai");
    }

    @Override
    public void start() {
        System.out.println("Car is started");

    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");

    }
}
