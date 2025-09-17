package com.xworkz.abstractionapp.snack.impl;

import com.xworkz.abstractionapp.snack.Snack;

public class KurkureImpl implements Snack {
    @Override
    public void name() {
        System.out.println("Name of the Snack is Kurkure");
    }

    @Override
    public void companyName() {
        System.out.println("Company name is Parle");

    }

    @Override
    public void quantity() {
        System.out.println("Quantity is 20g");

    }
}
