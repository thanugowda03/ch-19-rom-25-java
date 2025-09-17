package com.xworkz.abstractionapp.dishwash.impl;

import com.xworkz.abstractionapp.dishwash.DishWash;

public class VimImpl implements DishWash {
    @Override
    public void name() {
        System.out.println("Dish wash name is Vim Gel");
    }

    @Override
    public void weight() {
        System.out.println("Weight is 100ml");

    }

    @Override
    public void price() {
        System.out.println("Price is 20rs");

    }
}
