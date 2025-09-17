package com.xworkz.abstractionapp.chocolate.impl;

import com.xworkz.abstractionapp.chocolate.Chocolate;

public class MilkyBarImpl implements Chocolate {
    @Override
    public void chocolateName() {
        System.out.println("Chocolate name is MilkyBar");
    }

    @Override
    public void price() {
        System.out.println("Price is 120rs");
    }

    @Override
    public void flavour() {
        System.out.println("Milk flavour");

    }
}
