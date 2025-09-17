package com.xworkz.abstractionapp.juice.impl;

import com.xworkz.abstractionapp.juice.Juice;

public class JuiceRunner {
    public static void main(String[] args) {
        Juice juice=new SpriteImpl();
        juice.color();
        juice.flavour();
        juice.priceForL();
    }
}
