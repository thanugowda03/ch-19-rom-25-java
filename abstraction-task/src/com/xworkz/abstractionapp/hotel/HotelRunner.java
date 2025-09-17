package com.xworkz.abstractionapp.hotel;

import com.xworkz.abstractionapp.hotel.impl.KamathHotelImpl;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel=new KamathHotelImpl();
        hotel.prepareFood();
        hotel.serveFood();
        hotel.doBusiness();
    }
}
