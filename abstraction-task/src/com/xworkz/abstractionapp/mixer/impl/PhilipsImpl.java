package com.xworkz.abstractionapp.mixer.impl;

import com.xworkz.abstractionapp.mixer.Mixer;

public class PhilipsImpl implements Mixer {
    @Override
    public void mixerBrandName() {
        System.out.println("Mixer brand name is Philips");
    }

    @Override
    public void price() {
        System.out.println("Mixer price is 8000Rs");

    }

    @Override
    public void noOfJars() {
        System.out.println("No of jars is 4");

    }
}
