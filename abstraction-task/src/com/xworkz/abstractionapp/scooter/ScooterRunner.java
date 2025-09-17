package com.xworkz.abstractionapp.scooter;

import com.xworkz.abstractionapp.scooter.impl.Activa;

public class ScooterRunner {
    public static void main(String[] args) {
        Scooter scooter=new Activa();
        scooter.producers();
        scooter.price();
        scooter.color();
    }
}
