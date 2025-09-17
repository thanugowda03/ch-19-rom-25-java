package com.xworkz.abstractionapp.umbrella;

import com.xworkz.abstractionapp.umbrella.impl.PoppyImpl;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella=new PoppyImpl();
        umbrella.brand();
        umbrella.color();
        umbrella.price();
    }
}
