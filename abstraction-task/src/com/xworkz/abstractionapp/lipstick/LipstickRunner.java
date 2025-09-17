package com.xworkz.abstractionapp.lipstick;

import com.xworkz.abstractionapp.lipstick.impl.ZudioImpl;

public class LipstickRunner {
    public static void main(String[] args) {
        Lipstick lipstick=new ZudioImpl();
        lipstick.color();
        lipstick.price();
        lipstick.type();
    }
}
