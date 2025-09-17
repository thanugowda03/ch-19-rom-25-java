package com.xworkz.abstractionapp.light.impl;

import com.xworkz.abstractionapp.light.Light;

public class LightRunner {
    public static void main(String[] args) {
        Light light=new TubeLightImpl();
        light.type();
        light.on();
        light.off();

    }
}
