package com.xworkz.abstractionapp.cellphone.impl;

import com.xworkz.abstractionapp.cellphone.CellPhone;

public class VivoImpl implements CellPhone {
    @Override
    public void brand() {
        System.out.println("Phone brand is Vivo");
    }

    @Override
    public void price() {
        System.out.println("Price is 25000Rs");


    }

    @Override
    public void color() {
        System.out.println("Color is Blue");

    }
}
