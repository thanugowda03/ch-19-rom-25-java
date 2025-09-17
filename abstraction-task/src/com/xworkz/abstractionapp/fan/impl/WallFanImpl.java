package com.xworkz.abstractionapp.fan.impl;

import com.xworkz.abstractionapp.fan.Fan;

public class WallFanImpl implements Fan {
    @Override
    public void fanType() {
        System.out.println("Fan type is wall fan");
    }

    @Override
    public void price() {
        System.out.println("Price is 5000rs");

    }

    @Override
    public void brand() {
        System.out.println("Brand name is Philips");

    }
}
