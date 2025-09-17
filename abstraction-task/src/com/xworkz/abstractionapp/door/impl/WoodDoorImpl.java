package com.xworkz.abstractionapp.door.impl;

import com.xworkz.abstractionapp.door.Door;

public class WoodDoorImpl implements Door {
    @Override
    public void doorColor() {
        System.out.println("Door color is brown");
    }

    @Override
    public void size() {
        System.out.println("Size 15*8ft");

    }

    @Override
    public void price() {
        System.out.println("Price is 5000Rs");
    }
}
