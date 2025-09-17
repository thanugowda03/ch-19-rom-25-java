package com.xworkz.abstractionapp.biscuit;

import com.xworkz.abstractionapp.biscuit.impl.GoodDayImpl;

public class BiscuitRunner {
    public static void main(String[] args) {
        Biscuit biscuit=new GoodDayImpl();
        biscuit.biscuitName();
        biscuit.price();
        biscuit.color();
    }
}
