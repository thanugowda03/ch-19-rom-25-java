package com.xworkz.abstractionapp.clips.Impl;

import com.xworkz.abstractionapp.clips.Clips;

public class HairClip implements Clips {
    @Override
    public void color() {
        System.out.println("Clip color is Black");
    }

    @Override
    public void price() {
        System.out.println("Price is 20rs");

    }

    @Override
    public void brand() {
        System.out.println("Brand is Sujatha");

    }
}
