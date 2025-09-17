package com.xworkz.abstractionapp.bike;

import com.xworkz.abstractionapp.bike.impl.KTMImpl;
import com.xworkz.abstractionapp.bike.impl.RoyalEnfieldImpl;

public class BikeRunner {
    public static void main(String[] args) {
        Bike bike=new KTMImpl();
        bike.name();
        bike.start();
        bike.stop();


        Bike bike1=new RoyalEnfieldImpl();
        bike1.name();
        bike1.start();
        bike1.stop();
    }
}
