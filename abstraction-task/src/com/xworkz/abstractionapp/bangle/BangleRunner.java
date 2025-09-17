package com.xworkz.abstractionapp.bangle;

import com.xworkz.abstractionapp.bangle.impl.GoldBangleImpl;

public class BangleRunner {
    public static void main(String[] args) {
        Bangle bangle=new GoldBangleImpl();
        bangle.bangleSize();
        bangle.color();
        bangle.noOfPairs();
    }
}
