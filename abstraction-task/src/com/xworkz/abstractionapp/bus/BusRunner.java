package com.xworkz.abstractionapp.bus;

import com.xworkz.abstractionapp.bus.impl.BusImpl;

public class BusRunner {
    public static void main(String[] args) {
        Bus bus=new BusImpl();
        bus.color();
        bus.route();
        bus.timings();
    }
}
