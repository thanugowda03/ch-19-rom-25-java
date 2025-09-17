package com.xworkz.abstractionapp.bag;

import com.xworkz.abstractionapp.bag.impl.BagImpl;

public class BagRunner {
    public static void main(String[] args) {
        Bag bag=new BagImpl();
        bag.brand();
        bag.color();
        bag.price();
    }
}
