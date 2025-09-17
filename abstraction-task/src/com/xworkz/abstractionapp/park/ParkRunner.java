package com.xworkz.abstractionapp.park;

import com.xworkz.abstractionapp.park.impl.WaterParkImpl;

public class ParkRunner {
    public static void main(String[] args) {
        Park park=new WaterParkImpl();
        park.name();
        park.entryFee();
        park.openings();

    }
}
