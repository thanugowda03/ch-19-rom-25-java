package com.xworkz.abstractionapp.animal;

import com.xworkz.abstractionapp.animal.impl.DogImpl;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal=new DogImpl();
        animal.color();
        animal.noOfLegs();
        animal.breed();
    }
}
