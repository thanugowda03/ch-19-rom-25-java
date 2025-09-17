package com.xworkz.abstractionapp.cap.impl;

import com.xworkz.abstractionapp.cap.Cap;

public class CapImpl implements Cap {
    @Override
    public void color() {
        System.out.println("Cap Color is  black");
    }

    @Override
    public void price() {
        System.out.println("Cap price is 180Rs");

    }

    @Override
    public void size() {
        System.out.println("Cap size is M");

    }
}
