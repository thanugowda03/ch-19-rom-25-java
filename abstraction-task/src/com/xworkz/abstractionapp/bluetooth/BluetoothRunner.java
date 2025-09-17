package com.xworkz.abstractionapp.bluetooth;

import com.xworkz.abstractionapp.bluetooth.impl.BoatImpl;

public class BluetoothRunner {
    public static void main(String[] args) {
        Bluetooth bluetooth=new BoatImpl();
        bluetooth.bluetoothDeviceName();
        bluetooth.brand();
        bluetooth.price();
    }
}
