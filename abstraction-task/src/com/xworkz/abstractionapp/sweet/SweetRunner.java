package com.xworkz.abstractionapp.sweet;

import com.xworkz.abstractionapp.sweet.impl.SweetImpl;

public class SweetRunner {
    public static void main(String[] args) {
        Sweet sweet=new SweetImpl();
        sweet.name();
        sweet.price();
        sweet.beakryName();
    }
}
