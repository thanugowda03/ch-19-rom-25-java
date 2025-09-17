package com.xworkz.abstractionapp.camera;

import com.xworkz.abstractionapp.camera.impl.NikonImpl;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera=new NikonImpl();
        camera.brandName();
        camera.price();
        camera.isLensAvailable();
    }
}
