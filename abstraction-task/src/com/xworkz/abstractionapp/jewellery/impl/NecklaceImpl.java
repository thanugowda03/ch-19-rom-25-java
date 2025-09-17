package com.xworkz.abstractionapp.jewellery.impl;

import com.xworkz.abstractionapp.jewellery.Jewellery;

public class NecklaceImpl implements Jewellery {
    @Override
    public void jewelleryName() {
        System.out.println("Jewellery name is Necklace");
    }

    @Override
    public void weight() {
        System.out.println("Weight is 8g");

    }

    @Override
    public void price() {
        System.out.println("Price is 2lakh");

    }
}
