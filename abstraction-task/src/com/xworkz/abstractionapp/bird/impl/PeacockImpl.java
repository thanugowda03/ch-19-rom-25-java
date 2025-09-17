package com.xworkz.abstractionapp.bird.impl;


import com.xworkz.abstractionapp.bird.Bird;

public class PeacockImpl implements Bird {

    @Override
    public void birdName() {
        System.out.println("Bird name is Peacock");
    }

    @Override
    public void speciality() {
        System.out.println("Peacock is a national bird");

    }

    @Override
    public void food() {
        System.out.println("It eats both veg and nonveg foods");

    }
}
