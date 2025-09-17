package com.xworkz.abstractionapp.mixer;

import com.xworkz.abstractionapp.mixer.impl.PhilipsImpl;

public class MixerRunner {
    public static void main(String[] args) {
        Mixer mixer=new PhilipsImpl();
        mixer.mixerBrandName();
        mixer.price();
        mixer.noOfJars();
    }
}
