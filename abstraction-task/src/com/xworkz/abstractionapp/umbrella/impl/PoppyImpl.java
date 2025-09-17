package com.xworkz.abstractionapp.umbrella.impl;

import com.xworkz.abstractionapp.umbrella.Umbrella;

public class PoppyImpl implements Umbrella {
    @Override
    public void brand() {
        System.out.println("Umbrella brand is Poppy");
    }

    @Override
    public void color() {
        System.out.println("Umbrella color is black");

    }

    @Override
    public void price() {
        System.out.println("Price is 500rs");

    }
}
