package com.xworkz.abstractionapp.fridge;

import com.xworkz.abstractionapp.fridge.impl.LGImpl;

public class FridgeRunner {
    public static void main(String[] args) {
        Fridge fridge=new LGImpl();
        fridge.fridgeName();
        fridge.price();
        fridge.color();
    }
}
