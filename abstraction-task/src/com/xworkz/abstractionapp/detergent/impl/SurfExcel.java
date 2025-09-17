package com.xworkz.abstractionapp.detergent.impl;

import com.xworkz.abstractionapp.detergent.Detergent;

public class SurfExcel implements Detergent {
    @Override
    public void name() {
        System.out.println("Detergent name Surfexcel");
    }

    @Override
    public void price() {
        System.out.println("price is 10Rs/50g");
    }

    @Override
    public void purpose() {
        System.out.println("purpose of the detergent is washed");

    }
}
