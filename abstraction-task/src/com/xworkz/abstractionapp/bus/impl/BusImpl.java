package com.xworkz.abstractionapp.bus.impl;

import com.xworkz.abstractionapp.bus.Bus;

public class BusImpl implements Bus {

    @Override
    public void color() {
        System.out.println("Color is Green");
    }

    @Override
    public void route() {
        System.out.println("Route KBS-Malleshwaram");

    }

    @Override
    public void timings() {
        System.out.println("Timings is 10.30");

    }
}
