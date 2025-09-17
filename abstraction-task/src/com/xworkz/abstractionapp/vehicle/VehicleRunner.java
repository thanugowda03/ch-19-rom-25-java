package com.xworkz.abstractionapp.vehicle;

import com.xworkz.abstractionapp.vehicle.implementation.BikeImpl;

public class VehicleRunner {
    public static void main(String[] args) {

                Vehicle vehicle = new BikeImpl.CarImpl();
                vehicle.start();
                vehicle.fuelType();
                vehicle.stop();

                Vehicle vehicle1=new BikeImpl();
                vehicle1.start();
                vehicle1.stop();
                vehicle1.fuelType();
            }
    }
