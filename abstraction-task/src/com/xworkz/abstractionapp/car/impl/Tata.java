package com.xworkz.abstractionapp.car.impl;

import com.xworkz.abstractionapp.car.Car;

public class Tata implements Car {
    @Override
    public void name() {
        System.out.println("Car brand name is Tata");
    }

    @Override
    public void start() {
        System.out.println("Car is starting");

    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");

    }
}
