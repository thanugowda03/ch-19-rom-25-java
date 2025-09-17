package com.xworkz.abstractionapp.honey;

import com.xworkz.abstractionapp.honey.impl.DaburHoneyImpl;

public class HoneyRunner {
    public static void main(String[] args) {
        Honey honey=new DaburHoneyImpl();
        honey.color();
        honey.price();
        honey.weight();
    }
}
