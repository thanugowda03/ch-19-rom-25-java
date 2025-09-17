package com.xworkz.abstractionapp.state.impl;

import com.xworkz.abstractionapp.state.State;

public class KarnatakaImpl implements State {
    @Override
    public void stateName() {
        System.out.println("State name is Karntaka");
    }

    @Override
    public void cmName() {
        System.out.println("CM Name is Siddaramaih");

    }

    @Override
    public void festival() {
        System.out.println("Fesival is Dasara");

    }
}
