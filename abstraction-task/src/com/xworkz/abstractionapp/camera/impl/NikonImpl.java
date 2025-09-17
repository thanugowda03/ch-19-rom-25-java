package com.xworkz.abstractionapp.camera.impl;

import com.xworkz.abstractionapp.camera.Camera;

public class NikonImpl implements Camera {
    @Override
    public void brandName() {
        System.out.println("Camera Brand name is Nikon");
    }

    @Override
    public void price() {
        System.out.println("Price is 54000Rs");

    }

    @Override
    public void isLensAvailable() {
        System.out.println("Yes Lens is available");

    }
}
