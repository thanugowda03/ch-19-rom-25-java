package com.xworkz.abstractionapp.shoe.impl;

import com.xworkz.abstractionapp.shoe.Shoe;

public class BataImpl implements Shoe {
    @Override
    public void size() {
        System.out.println("Shoe size is 6");
    }

    @Override
    public void price() {
        System.out.println("Shoe price is 1300Rs");

    }

    @Override
    public void color() {
        System.out.println("Shoe color is White");

    }
}
