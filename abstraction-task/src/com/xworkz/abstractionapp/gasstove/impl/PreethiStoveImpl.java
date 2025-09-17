package com.xworkz.abstractionapp.gasstove.impl;

import com.xworkz.abstractionapp.gasstove.GasStove;

public class PreethiStoveImpl implements GasStove {
    @Override
    public void On() {
        System.out.println("Gas stove is on");
    }

    @Override
    public void Off() {
        System.out.println("Gas stove is off");

    }

    @Override
    public void price() {
        System.out.println("Gas stove price is 5000Rs");

    }
}
