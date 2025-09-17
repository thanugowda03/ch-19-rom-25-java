package com.xworkz.abstractionapp.door;

import com.xworkz.abstractionapp.door.impl.WoodDoorImpl;

public class DoorRunner {
    public static void main(String[] args) {
        Door door=new WoodDoorImpl();
        door.doorColor();;
        door.size();
        door.price();
    }
}
