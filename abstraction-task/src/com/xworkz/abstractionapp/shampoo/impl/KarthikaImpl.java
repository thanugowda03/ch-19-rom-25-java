package com.xworkz.abstractionapp.shampoo.impl;

import com.xworkz.abstractionapp.shampoo.Shampoo;

public class KarthikaImpl implements Shampoo {
    @Override
    public void shampooColor() {
        System.out.println("Shampoo color white");
    }

    @Override
    public void price() {
        System.out.println("Price 135Rs");

    }

    @Override
    public void weight() {
        System.out.println("Weight is 160g");

    }
}
