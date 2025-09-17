package com.xworkz.abstractionapp.house.impl;

import com.xworkz.abstractionapp.house.House;



public class RentHouseImpl implements House {
    @Override
    public void houseType() {
        System.out.println("House type is 1BHK");
    }

    @Override
    public void rent() {
        System.out.println("Rent is 6k/month");

    }

    @Override
    public void location() {
        System.out.println("Location is RajajiNagar");

    }
}
