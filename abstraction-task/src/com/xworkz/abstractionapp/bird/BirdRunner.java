package com.xworkz.abstractionapp.bird;

import com.xworkz.abstractionapp.bird.impl.PeacockImpl;

public class BirdRunner {
    public static void main(String[] args) {
        Bird bird=new PeacockImpl();
        bird.birdName();
        bird.food();
        bird.speciality();
    }
}
