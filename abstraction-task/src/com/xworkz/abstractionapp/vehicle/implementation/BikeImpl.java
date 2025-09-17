package com.xworkz.abstractionapp.vehicle.implementation;

import com.xworkz.abstractionapp.vehicle.Vehicle;

public class BikeImpl implements Vehicle {


        public void start() {
            System.out.println("Bike is starting");
        }

        public void stop() {
            System.out.println("Bike is stopping");
        }
        public void fuelType() {
            System.out.println("Bike runs on Petrol");
        }

    public static class CarImpl implements Vehicle{
        @Override
        public void start() {
            System.out.println("Car is started");

        }

        @Override
        public void stop() {
            System.out.println("Car is stopped");

        }

        @Override
        public void fuelType() {
            System.out.println("Car uses Petrol as fuel");

        }
    }
}


