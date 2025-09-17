package com.xworkz.abstractionapp.fan;

import com.xworkz.abstractionapp.fan.impl.WallFanImpl;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan=new WallFanImpl();
        fan.fanType();;
        fan.price();
        fan.brand();
    }
}
