package com.xworkz.abstractionapp.anklet.impl;

import com.xworkz.abstractionapp.anklet.Anklet;

public class SilverAnkletImpl implements Anklet {
    @Override
    public void price() {
        System.out.println("Anklet price is 5000Rs");
    }

    @Override
    public void materialType() {
        System.out.println("Material Type is Silver");
    }

    @Override
    public void weight() {
        System.out.println("Weight of anklet is 10g");

    }
}
