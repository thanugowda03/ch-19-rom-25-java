package com.xworkz.abstractionapp.toothbrush.impl;

import com.xworkz.abstractionapp.toothbrush.ToothBrush;

public class ColgateImpl implements ToothBrush {
    @Override
    public void color() {
        System.out.println("Tooth brush color is pink");
    }

    @Override
    public void price() {
        System.out.println("Price is 50Rs");

    }

    @Override
    public void brand() {
        System.out.println("Brand is Colgate");

    }
}
