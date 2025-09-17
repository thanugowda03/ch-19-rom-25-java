package com.xworkz.abstractionapp.soap.impl;

import com.xworkz.abstractionapp.soap.Soap;

public class LuxImpl implements Soap {
    @Override
    public void soapColor() {
        System.out.println("Soap Color is Pink");
    }

    @Override
    public void price() {
        System.out.println("Soap price is 48rs");

    }

    @Override
    public void fragnance() {
        System.out.println("Fragnance used is rose water ");

    }
}
