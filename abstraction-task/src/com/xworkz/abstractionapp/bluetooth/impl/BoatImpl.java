package com.xworkz.abstractionapp.bluetooth.impl;

import com.xworkz.abstractionapp.bluetooth.Bluetooth;

public class BoatImpl implements Bluetooth {
    @Override
    public void bluetoothDeviceName() {
        System.out.println("Bluettoth device name is Airpodes161");
    }

    @Override
    public void brand() {
        System.out.println("Brand name is Boat");

    }

    @Override
    public void price() {
        System.out.println("Bluetooth price is 2200rs");

    }
}
