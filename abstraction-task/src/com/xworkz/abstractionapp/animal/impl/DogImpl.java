package com.xworkz.abstractionapp.animal.impl;

import com.xworkz.abstractionapp.animal.Animal;

public class DogImpl implements Animal {
    @Override
    public void color() {
        System.out.println("Animal name is dog");
    }

    @Override
    public void noOfLegs() {
        System.out.println("Dog has 4 Legs");

    }

    @Override
    public void breed() {
        System.out.println("Breed name is Husky");

    }
}
