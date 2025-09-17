package com.xworkz.abstractionapp.facewash;

import com.xworkz.abstractionapp.facewash.impl.MamaEarthImpl;

public class FaceWashRunner {
    public static void main(String[] args) {
        FaceWash faceWash=new MamaEarthImpl();
        faceWash.type();
        faceWash.price();
        faceWash.color();
    }
}
