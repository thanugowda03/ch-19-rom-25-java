package com.xworkz.abstractionapp.hotel.impl;

import com.xworkz.abstractionapp.hotel.Hotel;

public class KamathHotelImpl implements Hotel {
    @Override
    public void prepareFood() {
        System.out.println("Prepare the food");
    }

    @Override
    public void serveFood() {
        System.out.println("Serve the food");

    }

    @Override
    public void doBusiness() {
        System.out.println("Do business");
    }
}
