package com.xworkz.abstractionapp.lap;

import com.xworkz.abstractionapp.lap.impl.DellImpl;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop=new DellImpl();
        laptop.brand();
        laptop.price();
        laptop.ram();
    }
}
