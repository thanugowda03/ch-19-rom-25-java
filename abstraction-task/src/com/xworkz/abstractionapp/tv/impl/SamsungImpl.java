package com.xworkz.abstractionapp.tv.impl;

import com.xworkz.abstractionapp.tv.TV;

public class SamsungImpl implements TV {
    @Override
    public void brand() {
        System.out.println("TV brand is Samsung");
    }

    @Override
    public void type() {
        System.out.println("TV Type is LCD");

    }

    @Override
    public void price() {
        System.out.println("Price os 22000Rs");

    }
}
