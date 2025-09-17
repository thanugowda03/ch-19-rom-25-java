package com.xworkz.abstractionapp.car;

import com.xworkz.abstractionapp.car.impl.HyundaiImpl;
import com.xworkz.abstractionapp.car.impl.Tata;

public class CarRunner {
    public static void main(String[] args) {
        Car car=new HyundaiImpl();
        car.name();
        car.start();
        car.stop();

        Car car1=new Tata();
        car1.name();
        car1.start();
        car1.stop();
    }
}
