package com.xworkz.abstractionapp.light.impl;

import com.xworkz.abstractionapp.light.Light;

public class TubeLightImpl implements Light {

    @Override
    public void type() {
        System.out.println("Light type is Tubelight");
    }

    @Override
    public void on() {
        System.out.println("Turn on Tubelight");

    }

    @Override
    public void off() {
        System.out.println("Turn off tubelight");

    }
}
