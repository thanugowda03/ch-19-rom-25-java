package com.xworkz.abstractionapp.tv.impl;

import com.xworkz.abstractionapp.tv.TV;

public class TVRunner {
    public static void main(String[] args) {
        TV tv=new SamsungImpl();
        tv.brand();
        tv.type();
        tv.price();
    }
}
