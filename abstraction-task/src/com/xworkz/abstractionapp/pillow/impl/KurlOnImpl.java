package com.xworkz.abstractionapp.pillow.impl;

import com.xworkz.abstractionapp.pillow.Pillow;

public class KurlOnImpl implements Pillow {
    @Override
    public void color() {
        System.out.println("Pillow color is Blue");
    }

    @Override
    public void purpose() {
        System.out.println("Purpose is to sleep");

    }

    @Override
    public void price() {
        System.out.println("Price is 250Rs");

    }
}
