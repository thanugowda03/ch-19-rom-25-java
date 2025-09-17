package com.xworkz.abstractionapp.pickle.impl;

import com.xworkz.abstractionapp.pickle.Pickle;

public class SuperPicklesImpl implements Pickle {
    @Override
    public void brand() {
        System.out.println("Brand name is Super");
    }

    @Override
    public void price() {
        System.out.println("Price ois 50/g");

    }

    @Override
    public void flavour() {
        System.out.println("Flavour is mango");

    }
}
