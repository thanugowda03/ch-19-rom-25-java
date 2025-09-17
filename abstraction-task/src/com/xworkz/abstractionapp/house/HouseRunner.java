package com.xworkz.abstractionapp.house;

import com.xworkz.abstractionapp.house.impl.RentHouseImpl;

public class HouseRunner {
    public static void main(String[] args) {
        House house=new RentHouseImpl();
        house.houseType();
        house.rent();
        house.location();

    }
}
