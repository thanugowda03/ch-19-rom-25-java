package com.xworkz.abstractionapp.facewash.impl;

import com.xworkz.abstractionapp.facewash.FaceWash;

public class MamaEarthImpl implements FaceWash {

    @Override
    public void type() {
        System.out.println("Face wash type rice water");
    }

    @Override
    public void color() {
        System.out.println("Face wash color is white");

    }

    @Override
    public void price() {
        System.out.println("price is 125rs");

    }
}
