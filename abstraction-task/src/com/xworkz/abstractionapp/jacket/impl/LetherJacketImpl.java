package com.xworkz.abstractionapp.jacket.impl;

import com.xworkz.abstractionapp.jacket.Jacket;

public class LetherJacketImpl implements Jacket {
    @Override
    public void noOfButton() {
        System.out.println("No of Buttons are 8");
    }

    @Override
    public void color() {
        System.out.println("Color is brown");

    }

    @Override
    public void price() {
        System.out.println("Price is 2500Rs");

    }
}
