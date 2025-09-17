package com.xworkz.abstractionapp.toothpaste.impl;

import com.xworkz.abstractionapp.toothpaste.ToothPaste;

public class ColgateImpl implements ToothPaste {
    @Override
    public void brand() {
        System.out.println("ToothPaste brand is Colgate");
    }

    @Override
    public void price() {
        System.out.println("Tooth paste price 88Rs");

    }

    @Override
    public void quantity() {
        System.out.println("Quantity is 100g");

    }
}
