package com.xworkz.abstractionapp.tea.impl;

import com.xworkz.abstractionapp.tea.Tea;

public class TataImpl implements Tea {
    @Override
    public void price() {
        System.out.println("Tea Powder price 225Rs");
    }

    @Override
    public void flavour() {
        System.out.println("Flavour is Ginger Tea");

    }



    @Override
    public void teaPowderBrand() {
        System.out.println("Tea powder Brand is Tata");

    }
}
